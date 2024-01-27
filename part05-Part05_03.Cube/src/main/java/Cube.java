/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Cube {
    private int edgeLenght;

    public Cube(int edgeLenght) {
        this.edgeLenght = edgeLenght;
    }
    public int volume(){
        int volume = this.edgeLenght*this.edgeLenght*this.edgeLenght;
        
        return volume;
    }

    @Override
    public String toString() {
        return "The length og the edge is "+ this.edgeLenght +" and the volume "+ volume();
    }
    
}
