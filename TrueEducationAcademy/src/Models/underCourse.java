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
public class underCourse {
    private String courceID;
    private String courceName;
    private String courceDuration;
    private String courceCredits;
    private String courceFee;

    public void setCourceID(String courceID) {
        this.courceID = courceID;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public void setCourceDuration(String courceDuration) {
        this.courceDuration = courceDuration;
    }

    public void setCourceCredits(String courceCredits) {
        this.courceCredits = courceCredits;
    }

    public void setCourceFee(String courceFee) {
        this.courceFee = courceFee;
    }

    public String getCourceID() {
        return courceID;
    }

    public String getCourceName() {
        return courceName;
    }

    public String getCourceDuration() {
        return courceDuration;
    }

    public String getCourceCredits() {
        return courceCredits;
    }

    public String getCourceFee() {
        return courceFee;
    }
    
}
