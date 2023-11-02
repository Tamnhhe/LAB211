
/**
 * Use to display menu and control the fruit shop
 *
 * Code: J1.S.P0023
 * Author: Tamnhhe173108
 * Class: SE1811
 * Version 1.0
 *
 */
public class Main {

    /**
     * Initialize io to use method in class Validation
     */
    private static FruitShopIO validation = new FruitShopIO();

    /**
     * Initialize manager to use method in class FruitShopManagement
     */
    private static FruitShopManagement manager = new FruitShopManagement();

    /**
     * Start running the program
     *
     */
    public static void main(String[] args) {
        manager.testData();
        menu();
    }

    /**
     * Display menu and provide method to use
     */
    public static void menu() {

        //Initialize choice to contains choice of user from keyboard
        int choice;

        Fruit fruit;
        //Running menu and chosing method
        while (true) {
            System.out.print(Message.MENU);
            choice = validation.checkInputIntLimit(Message.MIN, Message.MAX_CHOICE);
            switch (choice) {
                case 1: {
                    while (true) {
                        fruit = createFruit();
                        if (fruit != null) {
                            manager.addFruit(fruit);
                            if (!validation.checkInputYN()) {
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    manager.viewAllOrder();
                    break;
                }
                case 3: {
                    manager.shopping();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }
    }

    /**
     * Creates a new Fruit object with specified attributes.
     */
    public static Fruit createFruit() {
        
        /**
         * Initialize fruitID to hold ID of fruit
         */
        
        String fruitID;

        /**
         * Initialize fruitName to hold name of fruit
         */
        String fruitName;

        /**
         * Initialize price to hold price of fruit
         */
        double price;

        /**
         * Initialize quantity to hold quantity of fruit
         */
        int quantity;

        /**
         * Initialize origin to hold origin of fruit
         */
        String origin;

        System.out.print(Message.ENTER_FRUIT_ID);
        fruitID = validation.checkInputString();

        if (!manager.checkIDExist(fruitID)) {
            System.out.println(Message.FRUIT_EXISTED);
            return null;
        }

        System.out.println(Message.ENTER_FRUIT_NAME);
        fruitName = validation.checkInputString();

        System.out.println(Message.ENTER_FRUIT_PRICE);
        price = validation.checkInputDouble();

        System.out.println(Message.ENTER_FRUIT_QUANTITY);
        quantity = validation.checkInputInt();

        System.out.println(Message.ENTER_FRUIT_ORIGIN);
        origin = validation.checkInputString();
        Fruit fruit = new Fruit(fruitID, fruitName, price, quantity, origin);
        return fruit;

    }
}
