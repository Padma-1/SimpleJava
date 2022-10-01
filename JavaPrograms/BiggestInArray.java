import java.util.*;
public class BiggestInArray
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int big=0;
        int[] list = new int[10];
        for (int i=0;i<10;i++)
        {
            list[i] = sc.nextInt();
        }
        for(int i =0;i<10;i++)
        {
            if (list[i]>big)
                big = list[i];
        }
        System.out.println("biggest number is "+big);
        
     }
}