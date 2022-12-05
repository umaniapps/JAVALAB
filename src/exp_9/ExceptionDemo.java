package exp_9;

class ExceptionDemo
{
    public static void main(String[] args)
    {
        int m, n, o=0;
        try
        {
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
            o = m/n;
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae.getMessage());
        }
        catch(NumberFormatException ne)
        {
            System.out.println(ne.getMessage());
        }
        catch(ArithmeticException are)
        {
            are.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Cleanup code");
            System.out.println(o);
        }
    }
}

