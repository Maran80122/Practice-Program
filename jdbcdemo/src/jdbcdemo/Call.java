package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Call {
    public static void sp() throws Exception {
        String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root";
        String pass = "Maran@9095";

        try {
            Connection con = DriverManager.getConnection(URL, user, pass);
            CallableStatement cst = con.prepareCall("{call GetEmp()}");
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                System.out.println("id is " + rs.getInt(1));
                System.out.println("name is " + rs.getString(2));
                System.out.println("salary is " + rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        sp();
    }
}
