import java.util.*;
public class MatrixExample
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter number of rows:");
        m=sc.nextInt();
        System.out.println("Enter number of columns:");
        n=sc.nextInt();
        int [][] matrix = new int[m][n];
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
            
        }
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                 System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
            
        }
     }
}