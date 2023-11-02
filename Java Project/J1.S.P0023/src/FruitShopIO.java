import java.util.ArrayList;
import java.util.Scanner;
/**
 * Provide method to control the input from the keyboard
 * 
 * Code: J1.S.P0023
 * Author: Tamnhhe173108
 * Class: SE1811
 * Version 1.0
 */
public class FruitShopIO {
    
    Scanner scanner= new Scanner(System.in);
    
    /**
     * Check the integer type input from the key board with limit min and max
     * 
     */
    public int checkInputIntLimit(int min,int max){
        int result;
        while(true){
            try{
            result=Integer.parseInt(scanner.nextLine().trim());
            if(result<min || result>max) {
                throw new NumberFormatException();
            }
            else{
              return result;  
            }
            
            } catch(NumberFormatException e){
                System.err.println(Message.LIMIT+min+", "+max);
                System.out.println(Message.RE_ENTER);
            }
        }
    }
    
    /**
     * Checking string type input from key board
     * 
     */
    public String checkInputString(){
        String result;
        while(true){
            result=scanner.nextLine();
            if(result.isEmpty()) {
                System.err.println(Message.STRING_CONDITION);
                System.out.println(Message.RE_ENTER);
            }
            else{
              return result;  
            }
        }
    }
    
    /**
     * Checking integer type input from key board
     * 
     */
    public int checkInputInt(){
        int result;
        while(true){
            try{
            result=Integer.parseInt(scanner.nextLine().trim());
            return result;
            } catch(NumberFormatException e){
                System.err.println(Message.INT_CONDITION);
                System.out.println(Message.RE_ENTER);
            }
        }
    }
    
    /**
     * Checking string type input from key board
     * 
     */
    public double checkInputDouble(){
        double result;
        while(true){
            try{
            result=Double.parseDouble(scanner.nextLine().trim());
            return result;
            } catch(NumberFormatException e){
                System.err.println(Message.DOUBLE_CONDITION);
                System.out.println(Message.RE_ENTER);
            }
        }
    }
    
    /**
     * Checking user want to continue or not from key board
     * 
     */
    public boolean checkInputYN(){
        System.out.println(Message.CONTINUE);
        String result;
        while(true){
            result=checkInputString();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }
            if(result.equalsIgnoreCase("N")){
                return false;
            }
            System.err.println(Message.RE_ENTER_YES_NO);
        }
    }
    
    
    /**
     * Checking if item already exist in order list.
     * 
     */
    public boolean checkItemExist(ArrayList<Order> listorder,String id){
        for(Order order: listorder){
            if(order.getFruitID()==id){
                return false;
            }
        }
        return true;
    }
}
