/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain.states;

import com.conference.gestion_conferencias_state_template.domain.Conference;
import com.conference.gestion_conferencias_state_template.domain.Paper;
import com.conference.gestion_conferencias_state_template.domain.State;

/**
 *
 * @author Ashlee Campaz
 */
public class Evaluated extends State{
    
    private boolean accepted;
    
    protected Evaluated(){
        super("Evaluated"); 
    }
    @Override
    public void nextState(Paper p) {
        if (accepted){
            p.setState(new Accepted());
        }else{
             p.setState(new Rejected());
        }     
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
    
    
}
