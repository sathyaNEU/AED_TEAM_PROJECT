/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CoursePkg;

import java.util.ArrayList;
import model.AdminPkg.Faculty;
import model.AdminPkg.Transcript;
import model.DateAndTime.CourseTimeSchedule;

/**
 *
 * @author thivya
 */
public class Course {

    private int courseId;
    private String courseName;
    private int credit;
    private float price;
    private String region;
    private String lang;
    Faculty faculty;
    ArrayList<CourseTimeSchedule> courseTimeScheduleList;
  
    private String semester;

    
    public Course() {
        courseTimeScheduleList = new ArrayList<>();
    }
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<CourseTimeSchedule> getCourseTimeScheduleList() {
        return courseTimeScheduleList;
    }

    public void addTimeSchedule(String day, String timings) {
        CourseTimeSchedule timeSchedule = new CourseTimeSchedule();
        timeSchedule.setDay(day);
        timeSchedule.setTiming(timings);
        timeSchedule.setActive(true);
        courseTimeScheduleList.add(timeSchedule);
        

    }

    @Override
    public String toString() {
        return String.valueOf(courseId);
    }

}
