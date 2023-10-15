

/**
 *
 * @author Tamnhhe
 */
class Matrix {
    //Method to get the first matrix from user input.
    public int [][] getFirstMatrix(){
        //Get the number of rows and columns for the matrix.
        int row = Validation.getInt(Message.format(Message.ENTER_ROW_MATRIX,1),Message.ENTER_ROW_MATRIX,Message.ERROR_INVALID_NUMBER,1,Integer.MAX_VALUE);
        int column = Validation.getInt(Message.format(Message.ENTER_COLUMN_MATRIX,1),Message.ENTER_COLUMN_MATRIX,Message.ERROR_INVALID_NUMBER,1,Integer.MAX_VALUE);
        
        //Initialize a  matrix and populate its elements with user input.
        int [][]matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = Validation.getInt(Message.format(Message.ENTER_MATRIX_ELEMENT,1,i+1,j+1),Message.ERROR_RANGE,Message.ERROR_INVALID_NUMBER,Integer.MIN_VALUE,Integer.MAX_VALUE);
            }
            
        }return matrix; //Return the resulting matrix
    }
    
    //Method to get the second matrix based on the operator and the first matrix
    public int [][] getSecondMatrix(int[][] firstMatrix, char operator){
        int rowFirstMatrix = firstMatrix.length;
        int columnFirstMatrix = firstMatrix[0].length;
        int rowSecondMatrix=0;
        int columnSecondMatrix=0;
        
        //Determine the dimentions of the second matrix based on the operation
        if(operator == Constant.ADDITION || operator == Constant.SUBTRACTION){
            rowSecondMatrix = Validation.getInt(Message.format(Message.ENTER_ROW_MATRIX,2),Message.ROW_NOT_MATCH,Message.ERROR_INVALID_NUMBER, rowFirstMatrix, rowFirstMatrix);
            columnFirstMatrix = Validation.getInt(Message.format(Message.ENTER_COLUMN_MATRIX,2),Message.COLUMN_NOT_MATCH,Message.ERROR_INVALID_NUMBER, columnFirstMatrix, columnFirstMatrix);
        }
        
        if(operator == Constant.MULTIPLICATION){
            rowSecondMatrix = Validation.getInt(Message.format(Message.ENTER_ROW_MATRIX,2),Message.ROW_NOT_MATCH,Message.ERROR_INVALID_NUMBER, columnFirstMatrix, columnFirstMatrix);
            columnFirstMatrix = Validation.getInt(Message.format(Message.ENTER_COLUMN_MATRIX,2),Message.COLUMN_SHOULD_BE_POSITIVE,Message.ERROR_INVALID_NUMBER,1,Integer.MAX_VALUE);
        }
        int [][] secondMatrix = new int[rowSecondMatrix][columnSecondMatrix];
        for (int i = 0; i < rowSecondMatrix; i++) {
            for (int j = 0; j < columnSecondMatrix; j++) {
                secondMatrix[i][j] = Validation.getInt(Message.format(Message.ENTER_MATRIX_ELEMENT,2,i+1,j+1),Message.ERROR_RANGE,Message.ERROR_INVALID_NUMBER,Integer.MIN_VALUE,Integer.MAX_VALUE);
                
            }
            
        }
        return secondMatrix;
        
    }
    public void displayMatrix(int[][] matrix){
        //Get the number of roww and columns in the matrix.
        int row = matrix.length;
        int column = matrix.length;
        
        //Display each element of the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("["+ matrix[i][j]+"]");
                
            }
            System.out.println();
        }
    }
    
}
