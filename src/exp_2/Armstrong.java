package exp_2;
import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,rem,m,d;
        System.out.println("Enter a number");
        num=sc.nextInt();
        d=(int)Math.log10(num)+1;
        m=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum+(int)Math.pow(rem,d);
            num=num/10;
        }
        if(sum==m)
            System.out.println(m+" is Armstrong Number");
        else
            System.out.println(m+" is not an Armstrong Number");
    }
}

