import java.util.*;
public class CurrentBill
{
    int bill;
    CurrentBill()
    {
      bill=100;
    }
    CurrentBill(int n)
    {
        if(n>75 && n<=150)
        {
            bill=50+(n-50)*2;
        }
        else if(n>150 && n<=250)
        {
            bill=250+(n-150)*4;
        }
        else
        {
            bill=650+(n-250)*10;
        }
    }
    void Display()
    {
        System.out.println("The generated bill is:"+bill);
    }
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number of units:"+n);
        CurrentBill CB;
        if (n<=75)
        {
          CB = new CurrentBill();
        } 
        else
        {
           CB = new CurrentBill(n);  
        }
        CB.Display();
     }
}