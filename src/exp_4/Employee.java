package exp_4;

import java.util.*;
class Employee
{
    int empid;
    String empname,desg, Organization,ug,pg,address;
    float Sal,per_marks_ug,per_marks_pg;
    Scanner sc=new Scanner(System.in);
    public void get_PersonalInfo()
    {
        System.out.println("Enter your empid, name, desg, salary, organization name, address");
        empid=sc.nextInt();
        sc.nextLine();
        empname=sc.nextLine();
        desg=sc.nextLine();
        Sal=sc.nextFloat();
        sc.nextLine();
        Organization=sc.nextLine();
        address=sc.nextLine();
    }
    public void get_QualificationInfo()
    {
        System.out.println("Enter your UG course, marks and PG course and Marks");
        ug=sc.nextLine();
        per_marks_ug=sc.nextFloat();
        sc.nextLine();
        pg=sc.nextLine();
        per_marks_pg=sc.nextFloat();
    }
    public void show_PersonalInfo()
    {
        System.out.println("============================");
        System.out.println(" PERSONAL INFORMATION ");
        System.out.println("============================");
        System.out.println("EMPID: "+empid);
        System.out.println("EMP NAME: "+empname);
        System.out.println("DESGINATION: "+desg);
        System.out.println("SALARY: "+Sal);
        System.out.println("ORGANIZATION NAME: "+Organization);
        System.out.println("ADDRESS: "+address);
    }
    public void show_QualificationInfo()
    {
        System.out.println("=============================");
        System.out.println(" QUALIFICATION INFORMATION ");
        System.out.println("=============================");
        System.out.println("UG COURSE: "+ug);
        System.out.println("UG PERCENTAGE: "+per_marks_ug);
        System.out.println("PG COURSE: "+pg);
        System.out.println("PG PERCENTAGE: "+per_marks_pg);
    }
    public static void main(String args[])
    {
        // Object Creation - memory for member variable declared inside the class
        Employee e1=new Employee();
        // reading of employee information
        e1.get_PersonalInfo();
        e1.get_QualificationInfo();
        // showing of employee information
        e1.show_PersonalInfo();
        e1.show_QualificationInfo();
    }
}

