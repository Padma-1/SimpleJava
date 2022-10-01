import java.util.*;
public class palindrome
{

     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp = n;
        int rev=0;
        int rem;
        while (n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        } 
        if (rev==temp)
        {
           System.out.println(temp+" is palindrome" ); 
        }
        else
        {
            System.out.println(temp+" not a palindrome");
        }
    }
}