/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;

/**
 *
 * @author Sathya
 */
public class Employer {
    String emp_id;
    String emp_name;
    String pwd;
    String org;
    boolean isAccActive;
    boolean isAuthToUpdateInfo;

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Employer() {
        isAccActive = true;
        isAuthToUpdateInfo = false;
    }
    
    public boolean getIsAccActive() {
        return isAccActive;
    }

    public void setIsAccActive(Boolean isAccActive) {
        this.isAccActive = isAccActive;
    }

    public boolean getIsAuthToUpdateInfo() {
        return isAuthToUpdateInfo;
    }

    public void setIsAuthToUpdateInfo(Boolean isAuthToUpdateInfo) {
        this.isAuthToUpdateInfo = isAuthToUpdateInfo;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    @Override
    public String toString(){
        return emp_id;
    }
    
    
    
}
