/*import java.util.*;
public class series
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=6,temp=6;
        if (n>1)
        {
            System.out.println("6");
        }
        for(int i=1;i<n;i++)
        {
            temp+=16;//6+16=22-->22+16=38
            res+=temp;//6+22=28-->38+28=66
            System.out.println(res);
        }
    }
}*/

import java.util.*;
public class series
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//5
        for (int i=1;i<=n;i++)
        {
            System.out.print(2*i*(4*i-1)+" ");//6 28 66 120 190 
        }
    }
    
    
}

