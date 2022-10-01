import java.util.*;
//using do-while loop break
public class Continue
{

     public static void main(String []args)
     {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for (int i=1;i<=n;i++)
     {
         if(i==5)
         {
             break;
         }
         System.out.println("hello"+i);
     }
     }
}
/*output:hello1
hello2
hello3
hello4 for input 7*/