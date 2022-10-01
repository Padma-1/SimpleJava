import java.util.*;
public class CyclicPalindrome
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r,len=0,temp=n,p=1;
        while (n>0)//to find length
        {
            r=n%10;
            n=n/10;
            len+=1;
        }
        for (int i=0;i<len-1;i++)//to get power
        {
            p=p*10;
        }
        int z=(temp%10*p)+(temp/10);//to get cyclic number
        int temp1=z,rev=0;
        while (z>0)//checking for palindrome
        {
            rev=(rev*10)+(z%10);
            z=z/10;
        }
        if(rev==temp1)
        {
            System.out.println(temp+" is a cyclic palindrome");
        }
        else
        {
            System.out.println(temp+" is not a cyclic palindrome");
        }
     }
}