
package DB;

import Models.Student;
import Models.Lecturer;
import Models.Student_Enroll;
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


public void updateStudent(Student student)
{
    String stuUpdateId = student.getStudentId();
    String stuUpdateEmail = student.getStudentEmail();
    String stuUpdateAddress = student.getStudentAddress();
    String stuUpdateContact = student.getStudentContact();

    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "UPDATE `certificate_program_students` SET `studentEmail`= ? ,`studentAddress`= ? ,`studentContact`= ?  WHERE `studentID`= ? ";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, stuUpdateEmail);
      stmt.setString(2, stuUpdateAddress);
      stmt.setString(3, stuUpdateContact);
      stmt.setString(4, stuUpdateId);
      
      stmt.executeUpdate();
      
      System.out.println("Record is Update successfully..................");
      
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


public void addLecturer(Lecturer lecturer)
{
    String lecID = lecturer.getLecturerID();
    String lecName = lecturer.getLecturerName();
    String lecAddress = lecturer.getLecturerAddress();
    String lecContact = lecturer.getLecturerContact();
    
    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "INSERT INTO `certificate_program_lecturers`(`lecturerID`, `lecturerName`, `lecturerContact`, `lecturerAddress`) VALUES (?,?,?,?)";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, lecID);
      stmt.setString(2, lecName);
      stmt.setString(3, lecContact);
      stmt.setString(4, lecAddress);

      
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


public void deleteLecturer(Lecturer lecturer)
{
    String lecDeleteID = lecturer.getLecturerID();

    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "DELETE FROM `certificate_program_lecturers` WHERE lecturerID = ?";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, lecDeleteID);
      
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

public void viewLecturer(Lecturer lecturer)
{
    String lecViewID = lecturer.getLecturerID();

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
      
      query = "SELECT * FROM `certificate_program_lecturers` WHERE lecturerID = ?";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, lecViewID);
      
      resultSet = stmt.executeQuery();
      
      while ( resultSet.next()) 
      {
	System.out.println("Lecturer ID: " +  resultSet.getString("lecturerID") + ", Lecturer Name: " +  resultSet.getString("lecturerName") + ", Address: " +  resultSet.getString("lecturerAddress") + ", Contact: " +  resultSet.getString("lecturerContact") );
        
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

public void updateLecturer(Lecturer lecturer)
{
    String lecUpdateID = lecturer.getLecturerID();
    String lecUpdateAddress = lecturer.getLecturerAddress();
    String lecUpdateContact = lecturer.getLecturerContact();

    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/true_education_academy", "root", "");
      
      System.out.println("Connection is created successfully:");
      
      query = "UPDATE `certificate_program_lecturers` SET `lecturerContact`= ?,`lecturerAddress`= ? WHERE `lecturerID`= ?";
      
      PreparedStatement stmt = conn.prepareStatement(query);
      
      stmt.setString(1, lecUpdateContact);
      stmt.setString(2, lecUpdateAddress);
      stmt.setString(3, lecUpdateID);
      
      stmt.executeUpdate();
      
      System.out.println("Record is Update successfully..................");
      
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

public void Student_enroll(Student_Enroll Stu)
{
    String name = Stu.getname();
    String contactNo = Stu.getcontactNo();
    String email = Stu.getemail();
    String address =Stu.getaddress();
    String nic =(String) Stu.getnic();
    String stream = Stu.getstream();
    String status = Stu.getstatus();
    String type = Stu.gettype();
    String country = Stu.getcountry();
    String province = Stu.getprovince();
    String district  = Stu.getdistrict ();
    String campus = Stu.getcampus();
    String batch = Stu.getbatch();
    String empStatus = Stu.getempStatus();
    
    Connection conn = null;

      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
            System.out.println(ex);
      }
      conn = DriverManager.getConnection("jdbc:mysql://localhost/student_enroll","root","");
      
      System.out.println("Connection is created successfully:");
      
      query = "INSERT INTO `student_enroll`(`name`, `contactNo`, `email`, `address`, `nic`, `stream`, `status`, `type`, `country`, `province`, `district`, `campus`, `batch`, `empStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement statmt = conn.prepareStatement(query);
      
      statmt.setString(1, name);
      statmt.setString(2, contactNo);
      statmt.setString(3,email);
      statmt.setString(4, address);
      statmt.setString(5, nic);
      statmt.setString(6, stream);
      statmt.setString(7, status);
      statmt.setString(3,type);
      statmt.setString(4, country);
      statmt.setString(5, province);
      statmt.setString(6, district);
      statmt.setString(7, campus);
      statmt.setString(5, batch);
      statmt.setString(6, empStatus);
      
    statmt.execute();
      
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




