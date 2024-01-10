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
@@ -65,5 +46,23 @@ private static double endBalance(double loan, double rate, int n, double payment
        }
        return endBalance;
    }
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
 }   

