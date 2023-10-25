
import java.util.Scanner;



/**
 *
 * @author Tamnhhe
 */
class Validation {
    private Validation(){
        
    }
    // Validates and returns an integer within a soecufued range
    public static int getInt(String messageInfo, String messageErrorOutOfRange, String messageErrorInvalidNumber, int min, int max){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.print(messageInfo);
                int number = Integer.parseInt(scanner.nextLine());
                
                if(number >= min && number <= max){
                    return number;
                }
                System.out.print(messageErrorOutOfRange);
            }catch(NumberFormatException e){
                System.out.println(messageErrorInvalidNumber);
                
            }
        }
    }
}
