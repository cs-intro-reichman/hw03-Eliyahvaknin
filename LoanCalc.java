  public class LoanCalc {

    static double epsilon = 0.001;
    static int iterationCounter;
    static double epsilon = 0.001; 
    static int iterationCounter; 

       public static void main(String[] args) {

        double loan = 100000;
        double rate = 0.05;
        int n = 10;
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
        while (endBalance(loan, rate, n, epsilon) > 0) {
            epsilon += epsilon;
@@ -25,7 +42,6 @@ public static double bisectionSolver(double loan, double rate, int n, double eps

        return (low + high) / 2;
    }

    private static double endBalance(double loan, double rate, int n, double payment) {
        double balance = loan;
        for (int i = 0; i < n; i++) {
@@ -34,22 +50,4 @@ private static double endBalance(double loan, double rate, int n, double payment
        return balance;
    }

    public static void main(String[] args) {

        double loan = 100000;
        double rate = 0.05;
        int n = 10;
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

}