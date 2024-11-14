/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ashlee Campaz
 */
public abstract class EvaluatorsAssignmentMethod {
    
   public Map<Paper,List<Evaluator>> EvaluatorsAssignment (List<Paper> papers, List<Evaluator> evaluators){
    
        Map<Paper,List<Evaluator>> afines = AffinityAssignment(papers,evaluators);
        Map<Paper,List<Evaluator>> balanceados = afines;
        
        
        balanceados = balanceAssignment(balanceados); 
        
        
        Map<Paper,List<Evaluator>> conflitsSolved = solveConflits(balanceados);
        
         System.out.println("Paper y evaluadores");
        
        
        
        
        return conflitsSolved;
    }
    
   protected Map<Paper,List<Evaluator>> AffinityAssignment (List<Paper> papers, List<Evaluator> evaluators) {
        
       Map<Paper,List<Evaluator>> afines = new HashMap(); 
       List<Evaluator> evaluadores_afines; 
       for(Paper p:papers){
           evaluadores_afines = new ArrayList(); 
           for(Evaluator e:evaluators){
               if(TheresAffinity(p.getKeywords(),e.getResearch_fields()) && !theresConflict(p,e)){
                   evaluadores_afines.add(e);
               }
           }
           afines.put(p, evaluadores_afines); 
       }
       return afines; 
    }
    
   private boolean TheresAffinity(List<String> keywords, List<String> researchFields){
        for(String kw:keywords){
            for(String rf:researchFields){
                if(kw.equals(rf))
                    return true; 
            }
        }
        
        return false; 
    }
   
   protected abstract Map<Paper,List<Evaluator>> balanceAssignment(Map<Paper,List<Evaluator>> b); 
   protected abstract boolean balanced(Map<Paper,List<Evaluator>> b);
   protected abstract boolean theresConflict(Paper p, Evaluator e); 
   
   protected abstract Map<Paper,List<Evaluator>> solveConflits ( Map<Paper,List<Evaluator>> balanced); 
}
