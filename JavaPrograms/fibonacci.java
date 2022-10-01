import java.util.*;
public class fibonacci
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("The fibonacci series upto " +n+" is");
        if (n==1)
        {
            System.out.println(a);
        }
        else if(n==2)
        {
            System.out.println(a);
            System.out.println(b);
        }
        
        
        else
        {
            System.out.println(a);
            System.out.println(b);
            while(n>2)
            {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
                n-=1;

             }
            
        }
       
     }
}