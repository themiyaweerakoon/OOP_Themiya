
package Models;

import java.util.Date;


public class PostGraduateStudent {


    private String PostStudentId;
    private String PostStudentName;
    private String PostStudentAddress;
    private String PostStudentContact;
    private String PostStudentEmail;
    private Date PostStudentDOB;
    private String PostStudentGender;

    public void setPostStudentId(String PostStudentId) {
        this.PostStudentId = PostStudentId;
    }

    public void setPostStudentName(String PostStudentName) {
        this.PostStudentName = PostStudentName;
    }

    public void setPostStudentAddress(String PostStudentAddress) {
        this.PostStudentAddress = PostStudentAddress;
    }

    public void setPostStudentContact(String PostStudentContact) {
        this.PostStudentContact = PostStudentContact;
    }

    public void setPostStudentEmail(String PostStudentEmail) {
        this.PostStudentEmail = PostStudentEmail;
    }

    public void setPostStudentDOB(Date PostStudentDOB) {
        this.PostStudentDOB = PostStudentDOB;
    }

    public void setPostStudentGender(String PostStudentGender) {
        this.PostStudentGender = PostStudentGender;
    }

    public String getPostStudentId() {
        return PostStudentId;
    }

    public String getPostStudentName() {
        return PostStudentName;
    }

    public String getPostStudentAddress() {
        return PostStudentAddress;
    }

    public String getPostStudentContact() {
        return PostStudentContact;
    }

    public String getPostStudentEmail() {
        return PostStudentEmail;
    }

    public Date getPostStudentDOB() {
        return PostStudentDOB;
    }

    public String getPostStudentGender() {
        return PostStudentGender;
    }
    
}
