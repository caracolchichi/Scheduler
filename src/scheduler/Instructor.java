/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Instructor {
    private String name;    
    private List<Integer> horario = new LinkedList<Integer>();

    public Instructor(String name){
        this.name = name;
    }
    
    @Override
    public String toString() { 
    return this.name;
} 
    
    public String getName() {
        return name;
    }
    

    

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getHorario() {
        return horario;
    }
    
    public void setHorario(List<Integer> horario) {
        this.horario = horario;
    }
    
}
