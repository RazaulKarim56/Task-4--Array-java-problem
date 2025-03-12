import java.util.Scanner;
public class ArrayMatrixMUltiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter rows and columns of first matrix: ");
        int row1 = input.nextInt();
        int col1 = input.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int row2 = input.nextInt();
        int col2 = input.nextInt();

        if (col1!= row2) {
            System.out.println("Matrix multiplication is not possible! Columns of A must equal rows of B.");
            return;
        }

        int[][] A = new int[row1][col1];
        int[][] B = new int[row2][col2];
        int[][] C = new int[row1][col2]; 

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col1; j++)
                A[i][j] = input.nextInt();

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < col2; j++)
                B[i][j] = input.nextInt();

        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }


        System.out.println("Multification of matrices:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    } 
}
