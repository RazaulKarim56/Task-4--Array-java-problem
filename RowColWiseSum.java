import java.util.Scanner ;
public class RowColWiseSum {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row=input.nextInt();
        System.out.print("Enter the number of column:");
        int col=input.nextInt();
        int[][]arr=new int[row][col];
        System.out.print("Enter the element of Array :");
        
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
            arr[i][j]=input.nextInt();
        }
        }
        System.out.println("row sum:=");
        for(int i=0;i<row;i++){
            int rowsum=0;
            for(int j=0;j<col;j++){
           rowsum+=arr[i][j];
         }
        
         System.out.println(rowsum);  
        }
        System.out.println("col sum:=");
        for(int j=0;j<col;j++){
            int colsum=0;
            for(int i=0;i<row;i++){
           colsum+=arr[i][j];
         }
        
         System.out.println(colsum);
        }
        
        }
        
}
