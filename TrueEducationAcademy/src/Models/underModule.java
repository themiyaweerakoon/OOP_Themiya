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
public class underModule {
        private int moduleID;
        private String moduleName;
        private String moduleLecturer;

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleLecturer(String moduleLecturer) {
        this.moduleLecturer = moduleLecturer;
    }

    public int getModuleID() {
        return moduleID;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleLecturer() {
        return moduleLecturer;
    }
}
