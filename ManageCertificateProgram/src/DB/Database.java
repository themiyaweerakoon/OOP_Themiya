
package DB;

import Models.Student;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Database {

    private String query;
    
public void addStudent(Student student)
{
    student.getStudentName();
    student.getStudentId();
    
    Connection conn = null;
      Statement stmt = null;
      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/certificate_program_students", "root", "");
      
      System.out.println("Connection is created successfully:");
      stmt = (Statement) conn.createStatement();
      query = "INSERT INTO `certificate_program_students`(`studentID`, `studentName`, `studentDOB`, `studentGender`, `studentEmail`, `studentAddress`, `studentContact`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7])";
      stmt.execute(query);
      System.out.println("Record is inserted in the table successfully..................");
      } catch (SQLException excep) {
         excep.printStackTrace();
      } catch (Exception excep) {
         excep.printStackTrace();
      } finally {
         try {
            if (stmt != null)
               conn.close();
         } catch (SQLException se) {}
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }  
      }
      System.out.println("Please check it in the MySQL Table..........");
   }
    
}

