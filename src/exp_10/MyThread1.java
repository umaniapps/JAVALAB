package exp_10;

class MyThread1 extends Thread
{
    public void run()
    { try{
        while(true)
        {
            System.out.println(Thread.currentThread().getName()+": Good Morning");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException ie)
    {
    }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        try{
            while(true)
            {
                System.out.println(Thread.currentThread().getName()+": Hello");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException ie)
        {
        }
    }
}
class MyThread3 extends Thread
{
    public void run()
    {
        try{
            while(true)
            {
                System.out.println(Thread.currentThread().getName()+": Welcome");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException ie)
        {
        }
    }
}
class MainDemo
{
    public static void main(String args[])
    {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("MAIN CLOSED");
    }
}
