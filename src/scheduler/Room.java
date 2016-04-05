/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andres
 */
public class Room{
    private int roomKey = -1;
    private int capacity = 40;
    private int[] timeslots = new int[9];
    
    
    
    public Room(int roomKey){
        for (int i = 0; i < 9; i++) {
            timeslots[i] = 0;
        }
        this.roomKey = roomKey;
    }
    
    public boolean isOccupied(int time){
        int x = parseTime(time);
        return timeslots[x] == 1;
    }
    
    public void occupy(int time){
        int x = parseTime(time);
        timeslots[x] = 1;
    }
    
    public void release(int time){
        int x = parseTime(time);
        timeslots[x] = 0;
    }
    
    public int parseTime(int time){
        if (time == 700) {
            return 0;
        }
        if (time == 830) {
            return 1;
        }
        if (time == 1000) {
            return 2;
        }
        if (time == 1130) {
            return 3;
        }
        if (time == 1300) {
            return 4;
        }
        if (time == 1420) {
            return 5;
        }
        if (time == 1540) {
            return 6;
        }
        if (time == 1700) {
            return 7;
        }
        if (time == 1830) {
            return 8;
        }        
        return -1;
    }
    
    public int getRoomKey(){
		return roomKey;
	}
	
	public boolean equals(Room r){
		return this.roomKey == r.roomKey;
	}
	
    @Override
        public String toString(){
            return Integer.toString(roomKey);
        }
	
     
}
