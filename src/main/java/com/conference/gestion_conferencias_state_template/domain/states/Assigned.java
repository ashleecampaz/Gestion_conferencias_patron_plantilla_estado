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
public class Assigned extends State {

    protected Assigned(){
        super("Assigned"); 
    }
    @Override
    public void nextState(Paper p) {
        p.setState(new Evaluated());
    }
    
}
