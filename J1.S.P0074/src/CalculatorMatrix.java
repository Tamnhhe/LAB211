
/**
 *
 * @author Tamnhhe
 */
// Function for matrix addition or subtraction
public class CalculatorMatrix {

    public int[][] sumMatrix(int[][] firstMatrix, int[][] secondMatrix, char operator) {
        int rowFisrtMatrix = firstMatrix.length;
        int columnFirstMatrix = firstMatrix[0].length;
        int[][] matrixResult = new int[rowFisrtMatrix][columnFirstMatrix];

        // Interate through each element in the matrices
        for (int i = 0; i < rowFisrtMatrix; i++) {
            for (int j = 0; j < columnFirstMatrix; j++) {
                if (operator == Constant.ADDITION) {
                    matrixResult[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
                if (operator == Constant.SUBTRACTION) {
                    matrixResult[i][j] = firstMatrix[i][j] - secondMatrix[i][j];

                }

            }

        }
        return matrixResult;
    }

    public int[][] multiplicationMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int rowFisrtMatrix = firstMatrix.length;
        int columnFirstMatrix = firstMatrix[0].length;
        int columnSecondMatrix = secondMatrix[0].length;
        int[][] matrixResult = new int[rowFisrtMatrix][columnSecondMatrix];
        
        for (int i = 0; i < rowFisrtMatrix; i++) {
            for (int j = 0; j < columnSecondMatrix; j++) {
                matrixResult[i][j] = 0;

            }
        }
        for (int i = 0; i < rowFisrtMatrix; i++) {
            for (int j = 0; j < columnSecondMatrix; j++) {
                for (int k = 0; k < columnFirstMatrix; k++) {
                    matrixResult[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }

            }

        }
        return matrixResult;
    }
}
