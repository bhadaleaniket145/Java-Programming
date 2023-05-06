import java.sql.*;
public class SqlTest
{
    public static void main(String[] args)
    {
        try
        {
        // Step 1: Make a connection

        // Load the driver
        Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");

        // Get a connection using this driver
        String url = "jdbc:pointbase://localhost/cs595";
        String dbUser = "PBPUBLIC";
        String dbPassword = "PBPUBLIC"; 

        Connection con = DriverManager.getConnection(url, dbUser, dbPassword);
        Statement stmt = con.createStatement();
        String sql= "select * from Traps";

        ResultSet rs = stmt.executeQuery(sql);

        String name;
        double val;
        java.sql.Date date;
        while (rs.next())
        {
            name = rs.getString("TrapName");
            val = rs.getDouble("TrapValue");
            date = rs.getDate("TrapDate");
            System.out.println("name = " + name + " Value = " + val + " Date = " + date);
        }
        stmt.close();
        con.close();
        }
        catch(ClassNotFoundException ex1)
        {
            System.out.println(ex1);
        }
        catch(SQLException ex2)
        {
            System.out.println(ex2);
        }
    }
}