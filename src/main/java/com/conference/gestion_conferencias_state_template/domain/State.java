/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

/**
 *
 * @author Ashlee Campaz
 */
public abstract class State {
    
    private String name; 
    public abstract void nextState(Paper p); 
    
    protected State(String name){
        this.name = name; 
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "State{" + "name=" + name + '}';
    }

    
    
}
