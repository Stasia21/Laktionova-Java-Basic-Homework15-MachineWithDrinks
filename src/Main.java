public class Main {
    private static int totalAmount = 0;
    private static int coffeeCount = 0;
    private static int teaCount = 0;
    private static int lemonadeCount = 0;
    private static int mojitoCount = 0;
    private static int mineralCount = 0;
    private static int cocaColaCount = 0;

    public static void makeCoffee() {
        System.out.println("Making coffee...");
        coffeeCount++;
        totalAmount += Drinks.COFFEE_PRICE;
    }

    public static void makeTea() {
        System.out.println("Making tea...");
        teaCount++;
        totalAmount += Drinks.TEA_PRICE;
    }

    public static void makeLemonade() {
        System.out.println("Making lemonade...");
        lemonadeCount++;
        totalAmount += Drinks.LEMONADE_PRICE;
    }

    public static void makeMojito() {
        System.out.println("Making mojito...");
        mojitoCount++;
        totalAmount += Drinks.MOJITO_PRICE;
    }

    public static void makeMineral() {
        System.out.println("Making soda...");
        mineralCount++;
        totalAmount += Drinks.MINERAL_PRICE;
    }

    public static void makeCocaCola() {
        System.out.println("Making Coca Cola...");
        cocaColaCount++;
        totalAmount += Drinks.COCA_COLA_PRICE;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a drink selection number (1-6) as a command line argument.");
            return;
        }

        int selection = Integer.parseInt(args[0]);

        switch (selection) {
            case 1:
                makeCoffee();
                break;
            case 2:
                makeTea();
                break;
            case 3:
                makeLemonade();
                break;
            case 4:
                makeMojito();
                break;
            case 5:
                makeMineral();
                break;
            case 6:
                makeCocaCola();
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Total amount: " + totalAmount);
    }
}