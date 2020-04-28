
package DB;

import Models.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class Database {

    private String query;
    private Object stmt;
    
public void addStudent(Student student)
{
    String stuId = student.getStudentId();
    String stuName = student.getStudentName();
    Date stuDOB = (Date) student.getStudentDOB();
    String stuGender = (String) student.getStudentGender();
    String stuEmail = student.getStudentEmail();
    String stuAddress = student.getStudentAddress();
    String stuContact = student.getStudentContact();
    
    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "INSERT INTO `certificate_program_students`(`studentID`, `studentName`, `studentDOB`,`studentGender`, `studentEmail`, `studentAddress`, `studentContact`) VALUES (?,?,?,?,?,?,?)";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, stuId);
      stmt.setString(2, stuName);
      stmt.setDate(3, new java.sql.Date(stuDOB.getTime()));
      stmt.setString(4, stuGender);
      stmt.setString(5, stuEmail);
      stmt.setString(6, stuAddress);
      stmt.setString(7, stuContact);
      
      stmt.execute();
      
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


public void deleteStudent(Student student)
{
    String stuDeleteId = student.getStudentId();

    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "DELETE FROM `certificate_program_students` WHERE `studentID` = ?";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, stuDeleteId);
      
      stmt.executeUpdate();
      
      System.out.println("Record is deleted in the table successfully..................");
      
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
    

public void viewStudent(Student student)
{
    String stuViewId = student.getStudentId();

    Connection conn = null;
    ResultSet resultSet = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "SELECT * FROM `certificate_program_students` WHERE `studentID` = ?";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, stuViewId);
      
      resultSet = stmt.executeQuery();
      
      while ( resultSet.next()) 
      {
	System.out.println("Student ID: " +  resultSet.getString("studentID") + ", Student Name: " +  resultSet.getString("studentName") + ", Date of Birth: " +  resultSet.getDate("studentDOB") + ", Gender: " +  resultSet.getString("studentGender") + ", Email: " +  resultSet.getString("studentEmail") + ", Address: " +  resultSet.getString("studentAddress") + ", Contact: " +  resultSet.getString("studentContact") );
        
        jTextArea.setText(resultSet.getString("studentID") + " \n " + resultSet.getString("studentName")  + " \n " + resultSet.getDate("studentDOB") + " \n " + resultSet.getString("studentGender") + " \n " + resultSet.getString("studentEmail") + " \n " + resultSet.getString("studentAddress") + " \n " + resultSet.getString("studentContact"));
        
      }
      
      System.out.println("Record is View successfully..................");
      
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

