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
public class EmployerDirectory {
    ArrayList<Employer> employerDir;

    public EmployerDirectory() {
        employerDir = new ArrayList<>();
    }
    
    public Employer getEmployerFromEmployerId(String id){
        for(Employer employer : employerDir){
            if(employer.getEmp_id().equals(id))
                return employer;
        }
        return null;    
    }
    
    public void addEmployerToEmployerDirectory(Employer employer){
        employerDir.add(employer);
    }
    
    public ArrayList<Employer> getEmployerDirectory(){
        return this.employerDir;
    }
    
    
}
