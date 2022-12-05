package exp_2;

import java.util.Scanner;
class Prime_Numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,i,j,count=0;
        System.out.println("Enter a number to find prime numbers upto it");
        num=sc.nextInt();
        for(i=2;i<=num;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(i+" ");
        }
    }
}

