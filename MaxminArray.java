import java.util.Scanner;
public class MaxminArray {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=input.nextInt();
        System.out.println("Enter the number of cols");
        int col=input.nextInt();
        int[][]arr=new int[row][col];
        System.out.println("Enter Array Elements");
        
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
            arr[i][j]=input.nextInt();
            
        }
        }
        int max=arr[0][0];
        int min=arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
           if(arr[i][j]>max){
            max=arr[i][j];
           }  
           if(arr[i][j]<min){
            min=arr[i][j];
           }
        }
        }
           System.out.println("Max="+max);
           System.out.println("Min="+min);
             
             
         
         } 
}
