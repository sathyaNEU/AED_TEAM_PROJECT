/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AdminPkg;

/**
 *
 * @author Sathya
 */
public class BusinessLogic {

    StudentDirectory studentDir;
    FacultyDirectory facultyDir;
    EmployerDirectory employerDir;

    public BusinessLogic(StudentDirectory studentDir, FacultyDirectory facultyDir, EmployerDirectory employerDir) {

        this.studentDir = studentDir;
        this.facultyDir = facultyDir;
        this.employerDir = employerDir;

        Student student = new Student();
        student.setDomain("SES");
        student.setFull_name("Test User");
        student.setUser_id("stest");
        student.setPwd("stest");
        studentDir.addStudentToStudentDir(student);
        System.out.println("Profile created for : " + student);

        Faculty faculty = new Faculty();
        faculty.setFull_name("Test Faculty");
        faculty.setSpeciality("software");
        faculty.setFaculty_id("ftest");
        faculty.setPwd("ftest");
        this.facultyDir.addFacultyToFacultyDir(faculty);
        System.out.println("Profile created for : " + faculty);
        
        Employer employer = new Employer();
        employer.setEmp_id("etest");
        employer.setEmp_name("Test Employer");
        employer.setPwd("etest");
        employer.setOrg("A Company");
        this.employerDir.addEmployerToEmployerDirectory(employer);
        System.out.println("Profile created for : " + employer);
        
        
        
        
        
    }

}
