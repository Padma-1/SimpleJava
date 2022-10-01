import java.util.*;
public class MatrixProduct
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int i,j,k,m,n;
        System.out.println("Enter number of rows:");
        m=sc.nextInt();
        System.out.println("Enter number of columns:");
        n=sc.nextInt();
        int [][] a = new int[m][n];
        int [][] b = new int[m][n];
        int [][] c = new int[m][n];
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                a [i][j] = sc.nextInt();
            }
            
        }
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                  b [i][j] = sc.nextInt();
            } 
        }
        for (i=0;i<m;i++)
        {
            for (j=0;j<n;j++)
            {
                c[i][j]=0;
                for (k=0;k<n;k++)
                {
                    c [i][j] += a[i][k]*b[k][j];
                    
                } System.out.print(" "+c[i][j]);
               
            } System.out.println();
            
        }
        
     }
}