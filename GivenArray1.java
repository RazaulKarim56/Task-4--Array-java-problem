import java.util.Scanner;
public class GivenArray1 {
    
public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("Enter the number  of row:");
    int n=input.nextInt();
    System.out.print("Enter the number of column:");
    int m=input .nextInt();
    int [][] num=new int [n][m];
    System.out.print("Enter any  element:");
    for(int i=0;i<n;i++){
    for (int j =0;j<m;j++){
       num[i][j]=input.nextInt();
    }
    }
    System.out.println("Display the array element:");
    for(int i=0;i<n;i++){
        for (int j =0;j<m;j++){
            System.out.print(" "+num[i][j]);
        }
        System.out.println();
    }
    
           
    
}

}

