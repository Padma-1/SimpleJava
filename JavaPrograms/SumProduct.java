import java.util.*;
public class SumProduct
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r,sum=0,mul=1;
        while (n>0)
        {
            r=n%10;
            sum+=r;
            mul*=r;
            n=n/10;
        }
        if(sum==mul)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
     }
}