/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class Chair {
    private final String name;
    private final String lastName; 
    private final String email; 
    private List<Conference> conferences; 

    public Chair(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
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

    public List<Conference> getConferences() {
        return conferences;
    }
    
    
    
    
}
