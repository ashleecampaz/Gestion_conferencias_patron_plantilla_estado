/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

import com.conference.gestion_conferencias_state_template.domain.states.Sent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class Paper {
    
    private String name;
    private String description;
    private List<String> keywords; 
    private State state; 
    private List<Evaluator> evaluators; 

    public Paper(String name, String description, List<String> keywords) {
        this.name = name;
        this.description = description;
        this.keywords = keywords;
        this.keywords = new ArrayList(); 
        this.evaluators = new ArrayList(); 
        this.state = new Sent(); 
    }

    public Paper(String name) {
        this.name = name;
        this.keywords = new ArrayList(); 
        this.evaluators = new ArrayList(); 
        this.state = new Sent(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void goToNextState(){
        state.nextState(this);
    }

    public void setEvaluators(List<Evaluator> evaluators) {
        this.evaluators = evaluators;
    }
    
    
    
    
    
}
