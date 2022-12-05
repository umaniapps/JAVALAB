package exp_7;

import java.util.*;
interface Internal
{
    void get_InternalMarks();
}
interface External
{
    void get_ExternalMarks();
}
interface Marks extends Internal, External
{
    void show_Marks();
}
class Result implements Marks
{
    // s1_i -> sub1 internal, s1_e ->sub1 external
    float s1_i,s1_e,s2_i,s2_e,s3_i,s3_e;
    Scanner sc=new Scanner(System.in);
    public void get_InternalMarks()
    {
        System.out.println("Enter 3 subjects internal marks (0 - 40)");
        s1_i=sc.nextFloat();
        s2_i=sc.nextFloat();
        s3_i=sc.nextFloat();
    }
    public void get_ExternalMarks()
    {
        System.out.println("Enter 3 subjects External marks (0 - 60)");
        s1_e=sc.nextFloat();
        s2_e=sc.nextFloat();
        s3_e=sc.nextFloat();
    }
    public void show_Marks()
    {
        System.out.println("Subject \t Internal\tExternal\tTotal_Marks: ");
        System.out.println(" Sub1 \t\t "+s1_i+"\t\t"+s1_e+"\t\t"+(s1_i+s1_e));
        System.out.println(" Sub2 \t\t "+s2_i+"\t\t"+s2_e+"\t\t"+(s2_i+s2_e));
        System.out.println(" Sub3 \t\t "+s3_i+"\t\t"+s3_e+"\t\t"+(s3_i+s3_e));
    }
}
class Mainclass
{
    public static void main(String args[])
    {
        Marks m=new Result();
        m.get_InternalMarks();
        m.get_ExternalMarks();
        m.show_Marks();
    }
}
