package exp_1;

import java.util.Scanner;
class Bike_Racers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int racer1_Speed,racer2_Speed,racer3_Speed,racer4_Speed,racer5_Speed;
        int sum;
        float avg_Speed;
        System.out.println("Enter 5 Bike Racers Speeds");
        racer1_Speed=sc.nextInt();
        racer2_Speed=sc.nextInt();
        racer3_Speed=sc.nextInt();
        racer4_Speed=sc.nextInt();
        racer5_Speed=sc.nextInt();

        sum=racer1_Speed+racer2_Speed+racer3_Speed+racer4_Speed+racer5_Speed;
        avg_Speed=(float)sum/5;
        System.out.println("Average Speed is:"+avg_Speed);
        System.out.println("The Qualified Racers are:");
        if(racer1_Speed>avg_Speed)
            System.out.println(racer1_Speed);
        if(racer2_Speed>avg_Speed)
            System.out.println(racer2_Speed);
        if(racer3_Speed>avg_Speed)
            System.out.println(racer3_Speed);
        if(racer4_Speed>avg_Speed)
            System.out.println(racer4_Speed);
        if(racer5_Speed>avg_Speed)
            System.out.println(racer5_Speed);
    }
}
