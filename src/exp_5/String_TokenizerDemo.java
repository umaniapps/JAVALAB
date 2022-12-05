package exp_5;

import java.util.StringTokenizer;

public class String_TokenizerDemo {
        public static void main(String args[])
        {
            StringTokenizer st = new StringTokenizer("my name is khan and your name is salman"," ");
            //System.out.println(st.countTokens());
            int count=0;
            while (st.hasMoreTokens())
            {
                System.out.println(st.nextToken()); // my nam
                count++;
            }
            System.out.println("No of Tokens: "+count);
        }
    }
