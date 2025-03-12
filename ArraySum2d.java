import java .util .Scanner;
public class ArraySum2d {
public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
     
    System.out.print("Enter the number of row:");
    int num1=input.nextInt();
    System.out.print("Enter the number of col:");
    int num2=input.nextInt();
    int[][]num=new int[num1][num2];
    int sum=0;
    System.out.print("Enter the element of row and column:");
    for(int i=0;i<num1;i++){
        for(int j=0;j<num2;j++){
            num[i][j]=input.nextInt();
        }
    }
    for(int i=0;i<num1;i++){
        for(int j=0;j<num2;j++){
            sum=sum+num[i][j];
        }
       
    }
    System.out.print("the sum is:"+sum);
}    
}
