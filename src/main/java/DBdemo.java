
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class DBdemo {
    
     static Connection con;
    static Statement s;

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "aditya");
            System.out.println(con);
            System.out.println(
                    "Connection Established successfully");
            s = con.createStatement();
            m1();
            m2();
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBdemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception e) {
            System.out.println("abc");
        }

    }

    static void m1() {
        String q = "insert into abcd values(2,\"d\");";
        try {
            System.out.println(
                    "before q");
            s.execute(q);
            System.out.println(
                    "after q");
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
        static void m2() {
        String q = "delete from abcd where a=2;";
        try {
            System.out.println(
                    "before q");
            s.execute(q);
            System.out.println(
                    "after q");
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}
