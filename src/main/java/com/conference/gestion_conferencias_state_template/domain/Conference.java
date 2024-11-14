/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencias_state_template.domain;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Ashlee Campaz
 */
public class Conference {
    private final String name;
    private int num_papers; 
    private int max_papers;
    private double min_paper_score;
    
    private EvaluatorsAssignmentMethod assignmentMethod;
    private List<Evaluator> evaluators; 
    private List<Paper> papers; 
    private List<Paper> accepted_papers;
    private List<Paper> rejeted_papers;

    public Conference(String name, int max_papers, double min_paper_score, EvaluatorsAssignmentMethod assignmentMethod) {
        this.name = name;
        this.num_papers = 0; 
        this.max_papers = max_papers;
        this.min_paper_score = min_paper_score;
        this.assignmentMethod = assignmentMethod; 
   }

    public int getNum_pappers() {
        return num_papers;
    }

    public void setNum_pappers(int num_pappers) {
        this.num_papers = num_pappers;
    }

    public int getMax_papers() {
        return max_papers;
    }

    public void setMax_papers(int max_papers) {
        this.max_papers = max_papers;
    }

    public double getMin_paper_score() {
        return min_paper_score;
    }

    public void setMin_paper_score(double min_paper_score) {
        this.min_paper_score = min_paper_score;
    }

    public List<Evaluator> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<Evaluator> evaluators) {
        this.evaluators = evaluators;
    }

    public List<Paper> getPapers() {
        return papers;
    }

    public void setPapers(List<Paper> papers) {
        this.papers = papers;
    }
   
    public boolean receivePaper(Paper p){
        if(num_papers<max_papers){
            papers.add(p);
            num_papers++;
            return true; 
        } 
        return false; 
    }
    
    public void evaluatorsAssigment(){
        Map<Paper,List<Evaluator>> asignacion = assignmentMethod.EvaluatorsAssignment(papers, evaluators);
        
        for(Paper p:papers){
            p.goToNextState();
            p.setEvaluators(asignacion.get(p));
            for(Evaluator e:asignacion.get(p)){
                e.addPaperToReview(p);
            }
        }
        
        for(Paper p:papers){
            System.out.println("---------------------------------------------------------\n");
            System.out.println(p);
            System.out.println("Autor:" + p.getAuthor());
            System.out.println(p.getEvaluators());
            System.out.println("---------------------------------------------------------\n");
        }
        
    }
    
    
    
}
