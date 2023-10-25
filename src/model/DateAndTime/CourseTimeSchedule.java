/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DateAndTime;

import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class CourseTimeSchedule {
    String day;
    String timing;
    boolean active;

    public CourseTimeSchedule() {
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
    
@Override
    public String toString() {
        return day;
    }
}
