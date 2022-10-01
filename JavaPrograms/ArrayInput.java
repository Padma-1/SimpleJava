import java.util.*;
public class ArrayInput
{

     public static void main(String []args)
     {
        Scanner sc =new Scanner(System.in);
        int[] list = new int[10];
        for (int i=0;i<10;i++)
        {
            list[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i =0;i<10;i++)
        {
            System.out.println(list[i]);
        }
        
     }
}