/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.CoursePkg.Course;
import model.DateAndTime.MeetTimeSchedule;

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
    ArrayList<Course> courseList;
    ArrayList<MeetTimeSchedule> apptSchedule;
     // "FAIL PURSUING PASS"
    Transcript transcript;
    Employer employer;
    Boolean isEmployed;
    float cgpa;
    HashMap<Boolean,Employer> employment_status;

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
    public Student() {
        courseList = new ArrayList<>();
        apptSchedule = new ArrayList<>();
        this.employer=null;
        this.isEmployed = false;
        transcript = new Transcript(this);
        isAccActive = true;
        isAuthToUpdateInfo = false;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Boolean getIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(Boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }



    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourseToStudent(Course newCourse) {
        for (Course course : courseList) {
            if (newCourse.getCourseId() == course.getCourseId()) {
                JOptionPane.showMessageDialog(null, "This Course has already been registered", "Warning", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }
        courseList.add(newCourse);
        JOptionPane.showMessageDialog(null, "Course has been registered successfully!");

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
    
    public void setApptSchedule(MeetTimeSchedule schedule){
        this.apptSchedule.add(schedule);
    }

    public ArrayList<MeetTimeSchedule> getApptSchedule() {
        return apptSchedule;
    }
    
    public void deleteCourseToStudent(Course newCourse) {
        courseList.remove(newCourse);
       

    }
    

    @Override
    public String toString() {
        return user_id;
    }
}
