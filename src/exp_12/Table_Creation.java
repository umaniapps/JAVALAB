package exp_12;

import java.sql.*;
class Table_Creation
{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Thub@123");
            if(con!=null)
                System.out.println("Database Connected");
            else
                System.out.println("Not Connected");
            Statement st=con.createStatement();
            int count=st.executeUpdate("create table movie(mno int, mname varchar(20), Hero varchar(20), Heroine varchar(30))");
            if(count==1)
                System.out.println("table created");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
