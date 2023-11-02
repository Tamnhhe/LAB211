

/**
 * Initialize Order object use thourgh the process
 * 
 * Code: J1.S.P0023
 * Author: Tamnhhe173108
 * Class: SE1811
 * Version 1.0
 */
public class Order {
    
    /**
     * The unique identifier for the fruit.
     */
    String fruitID;

    /**
     * The name of the fruit.
     */
    String fruitName;

    /**
     * The quantity of the fruit in the order.
     */
    int quantity;

    /**
     * The price per unit of the fruit.
     */
    double price;

    /**
     * Default constructor for the Order class.
     */
    public Order() {
    }

    /**
     * Parameterized constructor for the Order class.
     *
     * @param fruitID   The unique identifier for the fruit.
     * @param fruitName The name of the fruit.
     * @param quantity  The quantity of the fruit in the order.
     * @param price     The price per unit of the fruit.
     */
    public Order(String fruitID, String fruitName, int quantity, double price) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFruitID() {
        return fruitID;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    
}
