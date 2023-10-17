/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;

import java.util.ArrayList;



/**
 *
 * @author Sathya
 */
public class FacultyDirectory {
    ArrayList<Faculty> facultyDir;
    
    public FacultyDirectory(){
        facultyDir = new ArrayList<>();
    }
    
    public void addFacultyToFacultyDir(Faculty faculty){
        facultyDir.add(faculty);
    }
    
    public void removeStudentFromStudentDir(Faculty faculty){
        facultyDir.remove(faculty);
    }
    
    public Faculty getFacultyByFacultyId(String faculty_id){
        for(Faculty faculty : facultyDir)
            if(faculty.getFaculty_id().equals(faculty_id))
                return faculty;
        return null;     
    }
    public boolean doesFacultyProfileExist(String faculty_id){
        for(Faculty faculty : facultyDir)
            if(faculty.getFaculty_id().equals(faculty_id))
                return true;
        return false;
    }
}
