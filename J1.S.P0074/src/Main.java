
/**
 * Subject: Matrix Calculator.
 * Code: J1.S.P0074.
 * @author Tamnhhe173108.
 * Version 1.0.
 */
public class Main {
    public static void main(String[] args) {
        CalculatorMatrix calculator = new CalculatorMatrix();
        Matrix matrix = new Matrix();
        int[][]firstMatrix;
        int[][]secondMatrix;
        while(true){
            System.out.println(Message.CALCULATOR_PROGRAM);
            int choice = Validation.getInt(Message.CHOICE, Message.ERROR_CHOICE,Message.INVALID_INPUT, 1, 4);
            switch(choice){
                case 1:
                    //Addition operator
                    System.out.println(Message.ADDITION);
                    firstMatrix = matrix.getFirstMatrix();
                    secondMatrix = matrix.getSecondMatrix(firstMatrix, Constant.ADDITION);
                    
                    System.out.println(Message.RESULT);
                    matrix.displayMatrix(firstMatrix);
                    System.out.println(Constant.ADDITION);
                    matrix.displayMatrix(secondMatrix);
                    System.out.println(Message.EQUAL);
                    matrix.displayMatrix(calculator.sumMatrix(firstMatrix, secondMatrix, Constant.ADDITION));
                    break;
                case 2:
                    //Subtraction operator
                    System.out.println(Message.SUBTRACTION);
                    firstMatrix = matrix.getFirstMatrix();
                    secondMatrix = matrix.getSecondMatrix(firstMatrix, Constant.SUBTRACTION);
                    
                    System.out.println(Message.RESULT);
                    matrix.displayMatrix(firstMatrix);
                    System.out.println(Constant.SUBTRACTION);
                    matrix.displayMatrix(secondMatrix);
                    System.out.println(Message.EQUAL);
                    matrix.displayMatrix(calculator.sumMatrix(firstMatrix, secondMatrix, Constant.SUBTRACTION));
                    break;
                case 3:
                    //Multiplication operator
                    System.out.println(Message.MULTIPLICATION);
                    firstMatrix = matrix.getFirstMatrix();
                    secondMatrix = matrix.getSecondMatrix(firstMatrix, Constant.MULTIPLICATION);
                    
                    System.out.println(Message.RESULT);
                    matrix.displayMatrix(firstMatrix);
                    System.out.println(Constant.MULTIPLICATION);
                    matrix.displayMatrix(secondMatrix);
                    System.out.println(Message.EQUAL);
                    matrix.displayMatrix(calculator.multiplicationMatrix(firstMatrix, secondMatrix));
                    break;
                case 4:
                    //exit
                    return;
            }
        }
    }
    
}
