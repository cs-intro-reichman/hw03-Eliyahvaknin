public class LoanCalc {

    static int n; 
    static double g;
    static double low;
    static double high;
    static double loan; 
    static double rate; 
    static double epsilon;
    static double payment; 
    static double endBalance;
    static int iterationCounter;

    public static void main(String[] args) {
       
        loan = Double.parseDouble(args[0]); 
        rate = Double.parseDouble(args[1]); 
        n = Integer.parseInt(args[2]); 
        epsilon = 0.001;
        payment = 10000;

        System.out.println("Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);
        System.out.print("Periodical payment, using brute force: ");
        System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
        System.out.println();
        System.out.println("number of iterations: " + iterationCounter);
        System.out.print("Periodical payment, using bi-section search: ");
        System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
        System.out.println();
        System.out.println("number of iterations: " + iterationCounter);
    }

    public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
        g = loan / n;
        iterationCounter = 0;
        while (endBalance(loan, rate, n, g) > epsilon) {
            g += epsilon;
            iterationCounter++;
        }
        return g;
    }

    public static double bisectionSolver(double loan, double rate, int n, double epsilon) {
        iterationCounter = 0;
        low = loan / n;
        high = loan;
        g = (low + high) / 2;
      
        while ((high - low) > epsilon) {
            if (endBalance(loan, rate, n, g) * endBalance(loan, rate, n, low) > 0) {
                low = g;
            } else {
                high = g;
            }
            g = (low + high) / 2;
            iterationCounter++;
        }
        return g;

    }
    private static double endBalance(double loan, double rate, int n, double payment) {
        endBalance = loan;
        for (int i = 0; i < n; i++) {
            endBalance = (endBalance - payment) * (1 + rate / 100);
        }
        return endBalance;
    }

}