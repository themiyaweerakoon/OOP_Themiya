
package DB;

import Models.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;



public class Database {

    private String query;
    
public void addStudent(Student student)
{
    String stuId = student.getStudentId();
    String stuName = student.getStudentName();
    Date stuDOB = student.getStudentDOB();
    Object stuGender = student.getStudentGender();
    String stuEmail = student.getStudentEmail();
    String stuAddress = student.getStudentAddress();
    String stuContact = student.getStudentContact();
    
    Connection conn = null;
    Statement stmt = null;
      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      stmt = (Statement) conn.createStatement();
      
      query = "INSERT INTO `certificate_program_students`(`studentID`, `studentName`, `studentDOB`,`studentGender`, `studentEmail`, `studentAddress`, `studentContact`) VALUES (?,?,?,?,?,?,?)";
      
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
      System.out.println("Check it in the MySQL Table..........");
   }
    
}

