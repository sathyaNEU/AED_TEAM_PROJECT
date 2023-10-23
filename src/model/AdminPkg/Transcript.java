/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;
import java.util.HashMap;
import model.CoursePkg.Course;

/**
 *
 * @author Sathya
 */
public class Transcript {
    HashMap<String, String> grade;
    HashMap<String, String> course_status;
    String out;
    Student student;
      
    public Transcript(Student student){
        grade = new HashMap<>();
        course_status = new HashMap<>();
        this.student = student;      
    }

    public Student getStudent() {
        return student;
    }
    
    public HashMap<String, String> getCourse_status() {
        return course_status;
    }

    public void setCourse_status(String a, String b) {
        this.course_status.put(a, b);
    }
    
    public HashMap<String, String> getGrade() {
        return grade;
    }

    public void setGrade(String a, String b) {
        this.grade.put(a, b);
    }

    
    
    public String generateTranscript(){
        HashMap<String, String> map = student.getTranscript().getCourse_status();
        String buffer="TRANSCRIPT\n"+"-------------------";
        buffer+=("\nSTUDENT NAME : "+this.student.getFull_name()+"\nDOMAIN : "+this.student.getDomain()+"\n\n");
        buffer+="Course Name\tGrade\n---------------------------------";
        for(Course course : this.student.getCourseList()){
             if(map.get(String.valueOf(course.getCourseId())).equals("PASS") ||
                     map.get(String.valueOf(course.getCourseId())).equals("FAIL") ){
                 buffer+=("\n"+course.getCourseName()+"\t\t"+this.grade.get(String.valueOf(course.getCourseId())));
                 
             }
        }
        return buffer;
        
    }
    
}
