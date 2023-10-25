/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;

import java.util.ArrayList;
import model.CoursePkg.Course;

/**
 *
 * @author Sathya
 */
public class OECA {
    
    ArrayList<Student> gradStudents;
    
    public OECA(){
        this.gradStudents = new ArrayList<>();
    }
    
    
    public int isReadyTOGraduate(Transcript transcript){
        int credits = 0;
        for(Course course : transcript.getStudent().getCourseList()){
            if(transcript.getCourse_status().get(String.valueOf(course.getCourseId())).equals("PASS"))
                credits+=course.getCredit();
        }
        if(credits>=32){
            if(!doesStudentAlreadyGraduated(transcript.getStudent()))
                this.gradStudents.add(transcript.getStudent());
        }
        return credits;
    }
    
    public boolean doesStudentAlreadyGraduated(Student student){
        if(this.gradStudents.contains(student))
            return true;
        return false;
    }
    
    public void removeStudentFromGradStudent(Student student){
        this.gradStudents.remove(student);
    }

}
