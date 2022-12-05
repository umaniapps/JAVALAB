package exp_7;

class A
{
    int x=10;
    public void show()
    {
        System.out.println("A: X = "+x);
    }
}
class B extends A
{
    int x=20;
    public void show()
    {
        super.show();
        System.out.println("B: X = "+x);
    }
}
class C extends B
{
    int x=30;
    public void show()
    {
        super.show();
        System.out.println("C: X = "+x);
    }
}
class MainDemo
{
    public static void main(String args[])
    {
        C c=new C();
        c.show();
    }
}

