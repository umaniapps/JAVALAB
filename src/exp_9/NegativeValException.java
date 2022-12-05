package exp_9;

class NegativeValException extends Exception
{
    public NegativeValException(String msg)
    {
        super(msg);
    }
}
class Excep3
{
    public static void main(String args[])
    {
        String name=null;
        int m1=0,m2=0,m3=0;
        try
        {
            name=args[0];
            m1=Integer.parseInt(args[1]);
            m2=Integer.parseInt(args[2]);
            m3=Integer.parseInt(args[3]);
            if(m1<0 || m2<0 || m3<0)
                throw new NegativeValException("Marks should be greater than 0");
        }
        catch(ArrayIndexOutOfBoundsException aoe)
        {
            System.out.println("Minimum of 4 arguments you need to pass");
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Marks should be Integers only");
        }
        catch(NegativeValException nve)
        {
            System.out.println("Marks should be greater than zero");
            System.exit(0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Name = "+name);
        System.out.println("Average Marks="+(m1+m2+m3)/3);
    }
}

