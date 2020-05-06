/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author THISITHA
 */
public class underLecturer {
     private String ID;
    private String lecturerName;
    private String lecturerContact;
    private String lecturerAddress;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public void setLecturerContact(String lecturerContact) {
        this.lecturerContact = lecturerContact;
    }

    public void setLecturerAddress(String lecturerAddress) {
        this.lecturerAddress = lecturerAddress;
    }

    public String getID() {
        return ID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public String getLecturerContact() {
        return lecturerContact;
    }

    public String getLecturerAddress() {
        return lecturerAddress;
    }

}
