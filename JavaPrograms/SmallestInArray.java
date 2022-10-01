import java.util.*;
public class SmallestInArray
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int[] list = new int[10];
        for (int i=0;i<10;i++)
        {
            list[i] = sc.nextInt();
        }
        int small = list[0];
        for(int i =0;i<10;i++)
        {
            if (list[i]<small)
                small = list[i];
        }
        System.out.println("smallest number is "+small);
        
     }
}