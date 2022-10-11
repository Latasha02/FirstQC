/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstqc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author latas
 */
public class Queue {
    
    List<String> queue = new ArrayList<>();

    public List<String> getQueue() {
        return queue;
    }

    public void setQueue(String person, String action) {
        if("add".equals(action)){
            queue.add(person);
        }
        else{
            queue.remove(queue.get(0));
        }
    }

    public List<String> getQueueItems() {
        return queue;
    }

    public int getQueuelength() {
        return queue.size();
    }
    
}
