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
 * @author Ashlee Campaz
 */
public class StrictAssignment extends EvaluatorsAssignmentMethod {
    
    private  int evaluators_per_paper;

    public StrictAssignment(int evaluators_per_paper) {
        this.evaluators_per_paper = evaluators_per_paper;
    }
    
    @Override
    protected Map<Paper, List<Evaluator>> balanceAssignment(Map<Paper, List<Evaluator>> b) {
        List<Evaluator> leftover_evaluator = new ArrayList(); 
        Map<Paper, List<Evaluator>> balancedMap = new HashMap(); 
        Paper paper;
        List<Evaluator> evaluators; 
        int balanced; 
        for(Paper p:b.keySet()){
            paper = p;
            evaluators = b.get(p);
            balanced = isBalanced(evaluators);
            if(balanced!=0){
                if(balanced==1){
                    leftover_evaluator.addAll(extractExcessEvaluators(evaluators)); 
                }
                else{
                    evaluators.addAll(addLeftOverEvaluators(paper,evaluators.size(),leftover_evaluator));
                }
            }
            balancedMap.put(paper, evaluators);
        }
        return balancedMap;
    }

    @Override
    protected boolean balanced(Map<Paper, List<Evaluator>> b) {
        boolean balanced = true;
        for(Paper p:b.keySet()){
            if(b.get(p).size()!=evaluators_per_paper){
                return false; 
            }
        }
        return balanced;
    }

    @Override
    protected Map<Paper, List<Evaluator>> solveConflits(Map<Paper, List<Evaluator>> balanced) {
        return balanced;
    }

    @Override
    protected boolean theresConflict(Paper p, Evaluator e) {
        return p.getAuthor().getOrganization()== e.getOrganization();
    }
    
    private int isBalanced(List<Evaluator> v){
        if(v.size() <evaluators_per_paper){
            return -1;
        }
        else{
            if(v.size() == evaluators_per_paper)
                return 0;
        }
        return 1; 
    }
    
    private List<Evaluator> extractExcessEvaluators(List<Evaluator> e){
        int amount_excessEvaluators = e.size() - evaluators_per_paper;
        List<Evaluator> excessEvaluators = new ArrayList();
        
        for(int i=0; i<amount_excessEvaluators; i++){
            excessEvaluators.add(e.get(i));
            e.remove(i);
        }
        
        return excessEvaluators; 
    }
    
    private List<Evaluator> addLeftOverEvaluators(Paper p, int EvaluatorListSize, List<Evaluator> e){
        int amount_missingEvaluators = evaluators_per_paper - EvaluatorListSize;
         List<Evaluator> missingEvaluators  = new ArrayList();
        
         for(int i=0; i<amount_missingEvaluators && i<e.size(); i++){
             if(!theresConflict(p,e.get(i)))
                missingEvaluators.add(e.get(i));
        }
        
         return missingEvaluators;
         
    }
    
}
