/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.DriverManager;
import java.sql.Connection;

public class StudentEnroll {
    
    public static Connection getConnection()
            {
                Connection con=null;
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost/student_enroll","root","");                }
                catch(Exception ex)
                {
                    
                    {
                       System.out.println("ex.getMessage()");     
                    }
               
                }
    return con;
            }
    
}
