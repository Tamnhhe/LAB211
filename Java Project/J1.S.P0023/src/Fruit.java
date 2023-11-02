/**
 * Initialize Fruit object use thourgh the process
 * 
 * Code: J1.S.P0023
 * Author: Tamnhhe173108
 * Class: SE1811
 * Version 1.0
 */
public class Fruit {
    
    /**
     * Initialize fruitID as ID of fruit
     */
    String fruitID;
    
    /**
     * Initialize fruitName as Name of fruit
     */
    String fruitName;

    /**
     * Initialize price as price of fruit
     */
    double price;
    
    /**
     * Initialize quantity as quantity of fruit
     */
    int quantity;
    /**
     * Initialize origin as Origin of fruit
     */
    String Origin;

    public Fruit() {
    }
    
    /**
     * Constructor to create object fruit
     * @param fruitID
     * @param fruitName
     * @param price
     * @param quantity
     * @param Origin 
     */
    public Fruit(String fruitID, String fruitName, double price, int quantity, String Origin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.Origin = Origin;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }


}
