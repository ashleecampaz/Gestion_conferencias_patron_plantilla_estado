/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class Evaluator {
    private final String name;
    private final String lastName; 
    private final String email; 
    private final List<String> research_fields;
    private List<Paper> papers_to_review; 

    public Evaluator(String name, String lastName, String email, List<String> research_fields) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.papers_to_review = new ArrayList(); 
        this.research_fields = research_fields; 
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<Paper> getPapers_to_review() {
        return papers_to_review;
    }
    
    public void addResearchField(String r){
        research_fields.add(r); 
    }

    public void addPaperToReview (Paper p){
        papers_to_review.add(p);
    }
    public List<String> getResearch_fields() {
        return research_fields;
    }
    
    
}
