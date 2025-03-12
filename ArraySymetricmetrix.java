import java.util.Scanner;
public class ArraySymetricmetrix {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=input.nextInt();
        System.out.println("Enter the number of column:");
        int col=input.nextInt();
        if(row!=col){
        System.out.println("The Matrix is not symmetric because it's a non Square matrix");
           return;
        }
        int[][]arr=new int[row][col];
        System.out.println("Enter Array Elements");
        
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
            arr[i][j]=input.nextInt();
        }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
          if(arr[i][j]!=arr[j][i]){
            System.out.print("The Matrix is not Symmetric Matrix");
             return;
          }
          
        }
        }
          
            System.out.print("The Matrix is Symmetric Matrix");
          
        }    
}
