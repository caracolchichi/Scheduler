/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Student {
    private String studentID = "0";
    private List<Class> proposed = new ArrayList<Class>();
    private List<Class> enrolled = new ArrayList<Class>();
    
    public Student(String studentID, List<Class> proposed){
        this.studentID = studentID;
        this.proposed.addAll(proposed);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<Class> getProposed() {
        return proposed;
    }

    public void setProposed(List<Class> proposed) {
        this.proposed = proposed;
    }

    public List<Class> getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(List<Class> enrolled) {
        this.enrolled.clear();
        this.enrolled.addAll(enrolled);
    }
    
    public void unenroll(Class c){
        enrolled.remove(c);
    }

    @Override
    public String toString() {
        return studentID;
    }
    
    
    



}
