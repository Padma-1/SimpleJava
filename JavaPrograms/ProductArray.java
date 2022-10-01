import java.util.*;
public class ProductArray
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int[] list = new int[10];
        for (int i=0;i<10;i++)
        {
            list[i] = sc.nextInt();
        }
        int product = 1;
        for(int i =0;i<10;i++)
        {
            product*=list[i];
        }
        System.out.println("The product of the given array elements is "+product);
        
     }
}