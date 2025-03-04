
package wedding__management__system;

import java.sql.*;
public class Connect {
    
    Statement stmt;
    Connection con;
        void getConnect()
        {
            try
            {
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
                stmt=con.createStatement();
            }
            catch(SQLException e)
            {
                System.out.println("Error is "+e);
            }
        }
}
    

