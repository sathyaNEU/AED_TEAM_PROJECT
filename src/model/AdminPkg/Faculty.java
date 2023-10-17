/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;

import java.util.ArrayList;
import model.DateAndTime.TimeSchedule;



/**
 *
 * @author Sathya
 */
public class Faculty {
    String full_name;
    String speciality;
    String faculty_id;
    String pwd;
    int rating;

    public Faculty() {
       rating = 0;
    }
    
    

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating+=rating;
    }
    ArrayList<TimeSchedule> allScheduleList;
    Boolean isAccActive;
    Boolean isAuthToUpdateInfo;

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

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(String faculty_id) {
        this.faculty_id = faculty_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }    
    
    public String toString(){
        return faculty_id;
    }
      
}
