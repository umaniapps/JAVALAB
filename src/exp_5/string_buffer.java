package exp_5;

public class string_buffer {
        public static void main(String args[])
        {
            StringBuffer s1=new StringBuffer();
            System.out.println(s1.capacity()); // 16 => C=(S+1)*2 , 34
            System.out.println(s1.length()); // 0
            StringBuffer s2=new StringBuffer("Welcome ");
            System.out.println(s2.capacity()); // 24
            System.out.println(s2.charAt(4)); // o
            s2.setCharAt(4,'a');
            System.out.println(s2); // Welcame
            s2.deleteCharAt(4);
            System.out.println(s2); // Welcme
            s2.append(" Srinu");
            System.out.println(s2); // Welcme Srinu
            s2.insert(4,"a");
            System.out.println(s2); // Welcame Srinu
            s2.delete(8,13);
            System.out.println(s2); // Welcame
            s2.append(true);
            System.out.println(s2); // Welcame true
            s2.reverse();
            System.out.println(s2); // eurt emacleW
        }
    }
