import java.util.*;
public class NumberType
{
     static boolean palindrome(int x)
    {
        int r=0,i=x;
        while(i>0)
        {
          r=(r*10)+(i%10);
          i/=10;
        }
        if(r==x)
          return true;
        else
          return false;
    }
     static boolean armstrong(int x)
      {
        int r=0,i=x;
        while(i>0)
        {
          r+=(i%10)*(i%10)*(i%10);
          i/=10;
        }
        if(r==x)
          return true;
        else
          return false;
      }
      
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("Enter your choice 1:palindrome,2:Armstrong,3:Cyclicpalindrome");
        int c=sc.nextInt();
        switch (c)
        {
            case 1:
                if(palindrome(n))
                    System.out.println(n+" is  palindrome");
                else
                    System.out.println(n+" is not  palindrome");
                break;
            case 2:
                if(armstrong(n))
                    System.out.println(n+" is armstrong");
                else
                    System.out.println(n+" is not  armstrong");
                break;
            case 3:
                    if(n<10)
                      System.out.println(n+" is cyclic palindrome");
                    else if(n<100)
                      if(palindrome(n))
                        System.out.println(n+" is cyclic palindrome");
                      else
                        System.out.println(n+" is not cyclic palindrome");
                    else if(n%100==0)
                      System.out.println(n+" is not cyclic palindrome");
                    else if(n%10==0)
                      if(palindrome(n/10))
                        System.out.println(n+" is cyclic palindrome");
                      else
                        System.out.println(n+" is not cyclic palindrome");
                    else
                      if(palindrome(n%100))
                        if(palindrome(n/100))
                          System.out.println(n+" is cyclic palindrome");
                        else
                          System.out.println(n+" is not cyclic palindrome");
                      else
                        System.out.println(n+" is not cyclic palindrome");
        }
        
     }
}