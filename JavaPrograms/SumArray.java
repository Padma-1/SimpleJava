import java.util.*;
public class SumArray
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int[] list = new int[10];
        for (int i=0;i<10;i++)
        {
            list[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<10;i++)
        {
            sum+=list[i];
        }
        System.out.println("The sum of the given array elements is "+sum);
        
     }
}