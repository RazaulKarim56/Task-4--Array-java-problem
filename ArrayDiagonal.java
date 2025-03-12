import java .util.Scanner;

public class ArrayDiagonal {
       public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sumofdiagonal=0;
        int[][] A=new int[3][3];
        System.out.print("enter the element of row and col:");
        for(int i=0;i<3;i++){
            for( int j=0;j<3;j++){
                A[i][j]=input.nextInt();

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sumofdiagonal =sumofdiagonal+A[i][j];
                }
            }
           
        }
        System.out.println("Sum of diagonal:"+sumofdiagonal);
    }
}
