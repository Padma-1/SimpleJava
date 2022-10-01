import java.util.*;
//using while loop
public class Prime_num
{

     public static void main(String []args)
     {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int i=2,flag=0;
     while (i <= n/2)
     {
        if (n%i==0)
        {
            flag++;
            break;
        }
        i++;
     }
     if (flag==0)
     {
         System.out.println(n+" is prime");
     }
     else
     {
         System.out.println(n+" not a prime");
     }
    
     }
}
//27 not a prime
//using for loop
/*import java.util.*;
public class Prime_num
{

     public static void main(String []args)
     {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int flag=0;
     for (int i=2;i<=n/2;i++)
     {
        if (n%i==0)
        {
            flag++;
            break;
        }
     }
     if (flag==0)
     {
         System.out.println(n+" is prime");
     }
     else
     {
         System.out.println(n+" not a prime");
     }
    
     }
}*/

/*#using do-while
import java.util.*;
//using do-while loop
public class Prime_num
{

     public static void main(String []args)
     {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int i=2,flag=0;
     
     do
     {
        if (n%i==0)
        {
            flag++;
            break;
        }
        i++;
     }while (i <= n/2);
     if (flag==0)
     {
         System.out.println(n+" is prime");
     }
     else
     {
         System.out.println(n+" not a prime");
     }
    
     }
}*/