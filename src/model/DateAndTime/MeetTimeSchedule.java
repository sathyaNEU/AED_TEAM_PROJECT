/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DateAndTime;

import model.AdminPkg.Student;

/**
 *
 * @author Sathya
 */
public class MeetTimeSchedule {
    static int counter = 0;
    String day;
    String timing;
    int booking_id;
    boolean active;
    Student student;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public static int getCounter(){
        return counter;
    }
    
    public static void incCounter(){
        counter+=1;
    }
    
    public String toString(){
        return String.valueOf(booking_id);
    }
    
 }
