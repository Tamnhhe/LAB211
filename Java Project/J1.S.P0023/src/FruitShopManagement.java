
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Provide manager method to use to control the Fruit Shop Management.
 *
 * Code: J1.S.P0023
 * Author: Tamnhhe173108
 * Class: SE1811
 * Version 1.0
 */
public class FruitShopManagement {

    /**
     * Initialize io to use method in class Validation
     */
    private static FruitShopIO validation = new FruitShopIO();

    /**
     * Initialize fruitlist to contains fruit data of the program
     */
    private static ArrayList<Fruit> fruitList = new ArrayList<>();

    /**
     * Initialize orderlist that is hashtable to contains customer name and
     * order list data of the program
     */
    private static Hashtable<String, ArrayList<Order>> orderlist = new Hashtable<>();

    /**
     * Create fruit and add to fruit list and check continue or not repeatly
     */
    
    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
        System.out.println(Message.ADD_SUCCESSFUL);

    }

    /**
     * Running display customer name and order that had been made
     */
    public void viewAllOrder() {
        for (String name : orderlist.keySet()) {
            System.out.println("Customer: " + name);
            displayOrderByName(name);
        }
    }

    /**
     * Display order of a customer
     *
     * @param listorder contain order that had been made
     */
    public void displayOrderByName(String name) {
        double total = 0;
        double amount;
        ArrayList<Order> listorder = orderlist.get(name);
        System.out.println(Message.ORDER_LIST);
        for (Order order : listorder) {
            amount = order.price * order.quantity;
            System.out.format("%-15s%-15s%-15s%-15s\n", order.fruitName, order.quantity, order.price, amount);
            total = total + amount;
        }
        System.out.println("Total: " + total + "$");
    }

    /**
     * Provide shopping method for user to shopping and seeing fruit that
     * available
     */
    public void shopping() {
        if (fruitList.isEmpty()) {
            System.out.println(Message.NO_ITEM);
            return;
        }
        ArrayList<Order> listorder = new ArrayList<>();

        /**
         * Initialize itemchoice to hold the item choice that user input
         */
        int itemchoice;

        /**
         * Initialize fruit to hold fruit data that be input from key board
         */
        Fruit fruit;

        /**
         * Initialize quantity to hold quantity user input
         */
        int quantity;

        while (true) {
            displayFruit();
            System.out.println(Message.SELECTION);
            itemchoice = validation.checkInputIntLimit(1, fruitList.size());
            fruit = getFruitbyItem(itemchoice);
            System.out.println(Message.ENTER_FRUIT_QUANTITY);
            quantity = validation.checkInputIntLimit(1, fruit.getQuantity());
            if (!validation.checkItemExist(listorder, fruit.getFruitID())) {
                updateOrder(listorder, fruit.getFruitID(), quantity);
            } else {
                listorder.add(new Order(fruit.getFruitID(), fruit.getFruitName(), quantity, fruit.getPrice()));
            }
            if (!validation.checkInputYN()) {
                break;
            }

        }

        System.out.println(Message.ENTER_NAME);

        /**
         * Initialize name of person make order
         */
        String name;
        name = validation.checkInputString();
        orderlist.put(name, listorder);
        displayOrderByName(name);
        System.out.println(Message.ADD_SUCCESSFUL);

    }

    /**
     * Get fruit by item that display on the screen
     */
    public Fruit getFruitbyItem(int item) {

        /**
         * Initialize countItem as item number to check fruit user select
         */
        int countItem = 1;

        for (Fruit f : fruitList) {
            if (f.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return f;
            }
        }
        return null;
    }

    /**
     * Update order that has been record
     *
     * @param listorder
     * @param id
     * @param quantity
     */
    public void updateOrder(ArrayList<Order> listorder, String id, int quantity) {
        for (Order order : listorder) {
            if (order.getFruitID().equalsIgnoreCase(id)) {
                order.setQuantity(order.getQuantity() + quantity);
                return;
            }
        }
    }

    /**
     * Display fruit list that has in the shop
     */
    public void displayFruit() {
        System.out.println(Message.FRUIT_LIST);
        int countitem = 1;
        for (Fruit fruit : fruitList) {
            System.out.format("\t%-8s%-20s%-14s%-10.05f$\n", countitem++, fruit.fruitName, fruit.Origin, fruit.price);
        }
    }

    /**
     * Provide test data
     */
    public void testData() {
        fruitList.add(new Fruit("1", "Mango", 2, 200, "VietNam"));
        fruitList.add(new Fruit("2", "Orange", 3, 200, "US"));
        fruitList.add(new Fruit("3", "Apple", 4, 200, "Thailand"));
        fruitList.add(new Fruit("4", "Grape", 6, 200, "France"));
        ArrayList<Order> listOrder = new ArrayList<>();
        listOrder.add(new Order("1", "Mango", 3, 3));
        listOrder.add(new Order("2", "Grape", 4, 6));
        orderlist.put("Quang Trung", listOrder);
    }

    /**
     * Checking if ID already existed
     *
     */
    public boolean checkIDExist(String id) {
        for (Fruit f : fruitList) {
            if (f.getFruitID().equals(id)) {
                return false;
            }
        }
        return true;
    }
}
