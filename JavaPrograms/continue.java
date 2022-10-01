import java.util.*;
//using do-while loop continue
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
             continue;
         }
         System.out.println("hello"+i);
     }
     }
}
#output:
/*hello1
hello2
hello3
hello4
hello6
hello7*/