/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Andres
 */
public class Class implements Comparable<Class>{
    private String code;
    private Instructor instructor;
    private int time;
    private int aula =-1;
    int numeroalumnos = 0;
    private List<Student> EnrolledStudents = new LinkedList<Student>();

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }
    
    public Class (String code, Instructor instructor){
        this.code = code;
        this.instructor = instructor;
    }
    
    @Override
    public String toString(){
        return this.code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    public void enrollStudent(Student s){
        
        EnrolledStudents.add(s);
        numeroalumnos=EnrolledStudents.size();
        
        
    }

   


    
    public boolean isFull(){
        return numeroalumnos > 40;
    }
    
    public void dropStudent(Student s){
        for(Student st:EnrolledStudents){
            if (s.toString()==st.toString()) {
                EnrolledStudents.remove(st);
                numeroalumnos--;
            }
        }
        
    }

    @Override
    public int compareTo(Class o) {
        return Integer.compare(this.numeroalumnos, o.numeroalumnos);
    }
    
    
}
