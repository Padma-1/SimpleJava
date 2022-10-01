import java.util.*;
//using do-while loop
public class DigitsOfNumber
{

     public static void main(String []args)
     {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     do
     {
         System.out.println(n%10);
         n=n/10;
    
     }while (n>0);
     }
}
//output:2 9 for input=92