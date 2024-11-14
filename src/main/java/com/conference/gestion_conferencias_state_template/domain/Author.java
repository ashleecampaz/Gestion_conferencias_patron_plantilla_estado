/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ashlee Campaz
 */
public class Author {
    
    private final String name;
    private final String lastName; 
    private final String email; 
    private List<Paper> papers; 

    public Author(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.papers = new ArrayList(); 
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

    public List<Paper> getPapers() {
        return papers;
    }
    
    public boolean addPaper(Paper p){
        papers.add(p);
        //Un autor no debe tener dos papers con el mismo nombre 
        return true;
    }
    
    public boolean sendPaper(Conference c, Paper p){
        boolean result = c.receivePaper(p);
        return result;
    }
}
