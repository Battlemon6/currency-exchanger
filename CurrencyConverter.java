public class CurrencyConverter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("If I give you £1, how many USD will you give me? ");
        double euroOverPoundRatio = scan.nextDouble();
        System.out.print("If I give you 1$, how many Sterling pounds will you give me? ");
        double poundOverEuroRatio = scan.nextDouble();
        System.out.println("OK, now I know enough.");
        boolean finished = false;
        while (!finished) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("   1 - Exchange pounds into USD");
            System.out.println("   2 - Exchange USD into pounds");
            System.out.println("   0 - Exit the program");
            System.out.println();
            System.out.print(  "> ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.print("How many pounds would you like to convert? ");
                double pounds = scan.nextDouble();
                double USD   = pounds * euroOverPoundRatio;
                System.out.println("£" + pounds + " will give you " + USD + "$");
                break;
            case 2:
                System.out.print("How many USD would you like to convert? ");
                USD   = scan.nextDouble();
                pounds = USD * poundOverEuroRatio;
                System.out.println(USD + "$ will give you £" + pounds);
                break;
            case 0:
                finished = true;
                break;
            default:
                System.out.println("Sorry, that is not a valid option");
            }
        }
        System.out.println("Exiting the program");
    }
}
