
package Models;

import java.util.Date;



public class Student {
    
    private String StudentId;
    private String StudentName;
    private String StudentAddress;
    private String StudentContact;
    private String StudentEmail;
    private Date StudentDOB;
    private Object StudentGender;

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String StudentAddress) {
        this.StudentAddress = StudentAddress;
    }

    public String getStudentContact() {
        return StudentContact;
    }

    public void setStudentContact(String StudentContact) {
        this.StudentContact = StudentContact;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String StudentEmail) {
        this.StudentEmail = StudentEmail;
    }

    public Date getStudentDOB() {
        return StudentDOB;
    }

    public void setStudentDOB(Date StudentDOB) {
        this.StudentDOB = StudentDOB;
    }

    public Object getStudentGender() {
        return StudentGender;
    }

    public void setStudentGender(Object StudentGender) {
        this.StudentGender = StudentGender;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    
}
