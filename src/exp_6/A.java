package exp_6;
class A
    {
        int x=10;
        public void showX()
        {
            System.out.println("X = "+x);
        }
    }
    class B extends A
    {
        int y=20;
        public void showY()
        {
            System.out.println("Y = "+y);
        }
    }
    class SingleLevel
    {
        public static void main(String args[])
        {
            A a=new A();
            a.showX();

            System.out.println("=========================");
            B b=new B();
            b.showX();
            b.showY();
        }
    }


