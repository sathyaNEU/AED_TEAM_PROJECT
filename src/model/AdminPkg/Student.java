/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;


/**
 *
 * @author Sathya
 */
public class Student {
    String full_name;
    String user_id;
    String pwd;
    String domain;
    Boolean isAccActive;
    Boolean isAuthToUpdateInfo;
    
    public Student(){
        isAccActive=true;
        isAuthToUpdateInfo=false;
    }

    public Boolean getIsAccActive() {
        return isAccActive;
    }

    public void setIsAccActive(Boolean isAccActive) {
        this.isAccActive = isAccActive;
    }

    public Boolean getIsAuthToUpdateInfo() {
        return isAuthToUpdateInfo;
    }

    public void setIsAuthToUpdateInfo(Boolean isAuthToUpdateInfo) {
        this.isAuthToUpdateInfo = isAuthToUpdateInfo;
    }
    
    public String getFull_name() {
        return full_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getDomain() {
        return domain;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    @Override
    public String toString(){
        return user_id;
    }
}
