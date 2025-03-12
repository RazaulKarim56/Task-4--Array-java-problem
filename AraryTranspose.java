import java.util.Scanner;
public class AraryTranspose {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][2];

        System.out.print("Enter elements for the matrix: ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                A[i][j]= input.nextInt();
            }
        }
        System.out.println("A= ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of A (At) = ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
        


    }
}
