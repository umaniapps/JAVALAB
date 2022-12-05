package exp_4;

class Box_Demo
{
    int l,b,area;

    public Box_Demo() // Default Constructor
    {
        System.out.println("Default");
        l=b=1;
    }
    public Box_Demo(int m) // Parameterized
    {
        System.out.println("SQUARE");
        l=m;
        b=m;
    }
    public Box_Demo(int m,int n) // Parameterized
    {
        System.out.println("RECTANGLE");
        l=m;
        b=n;
    }
    public void Cal_Area()
    {
        area=l*b;
        System.out.println("Area is: "+area);
    }
    public static void main(String args[])
    {
        Box_Demo b1=new Box_Demo(5);
        b1.Cal_Area();
        Box_Demo b2=new Box_Demo(3,4);
        b2.Cal_Area();
        Box_Demo b3=new Box_Demo();
        b3.Cal_Area();
    }
}

