import java.util.*;
public class reverse
{

     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int rem;
        while (n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            
        
        } System.out.println(" the reverse of given number is "+rev);
        
        
     }
}