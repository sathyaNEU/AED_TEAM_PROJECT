/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CoursePkg;

import java.util.ArrayList;

/**
 *
 * @author thivya
 */
public class CourseCatalog {

    private ArrayList<Course> courseList;

    public CourseCatalog() {
        this.courseList = new ArrayList<Course>();
        //courseList.add(new Course(4100, "Machine Learning") );
        //courseList.add(new Course(4200, "Amazon Web Services") );
        //courseList.add(new Course(4210, "Google Cloud Platform") );
        //courseList.add(new Course(4110, "Artifical Intelligence") );

    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourseToCourseList(Course course) {
        courseList.add(course);
    }

}
