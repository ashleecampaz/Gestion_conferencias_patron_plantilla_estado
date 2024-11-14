/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.conference.gestion_conferencias_state_template;

import com.conference.gestion_conferencias_state_template.domain.Author;
import com.conference.gestion_conferencias_state_template.domain.Conference;
import com.conference.gestion_conferencias_state_template.domain.Evaluator;
import com.conference.gestion_conferencias_state_template.domain.Paper;
import com.conference.gestion_conferencias_state_template.domain.StrictAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class Gestion_Conferencias_State_Template {

    public static void main(String[] args) {
        
        
        List<Evaluator> evaluators = new ArrayList<>();
        StrictAssignment asignamientoEstricto = new StrictAssignment(2);
        Conference conferencia = new Conference("Conferencia de software",50,90,asignamientoEstricto);

        // Creando 7 instancias con datos de ejemplo
        evaluators.add(new Evaluator("John", "Doe", "john.doe@example.com", Arrays.asList("AI", "Machine Learning","Quantum Computing"), "Tech University"));
        evaluators.add(new Evaluator("Jane", "Smith", "jane.smith@example.com", Arrays.asList("Quantum Computing", "Physics","Biochemistry"), "Science Institute"));
        evaluators.add(new Evaluator("Carlos", "Garcia", "carlos.garcia@example.com", Arrays.asList("Data Science", "Statistics","Machine Learning"), "Data University"));
        evaluators.add(new Evaluator("Linda", "Kim", "linda.kim@example.com", Arrays.asList("Biochemistry", "Genetics"), "Medical Research Center"));
        evaluators.add(new Evaluator("Ahmed", "Khan", "ahmed.khan@example.com", Arrays.asList("Cybersecurity", "Cryptography","Data Science"), "Security Labs"));
        evaluators.add(new Evaluator("Sophia", "Martinez", "sophia.martinez@example.com", Arrays.asList("Robotics", "Automation","Genetics","AI"), "Engineering College"));
        evaluators.add(new Evaluator("Liam", "Brown", "liam.brown@example.com", Arrays.asList("Astronomy", "Astrophysics"), "Space Observatory"));
        
        conferencia.setEvaluators(evaluators);
        
        List<Paper> papers = new ArrayList<>();

        // Creando 20 instancias de Paper con keywords que coinciden con los research_fields de Evaluators
        papers.add(new Paper("AI Innovations", "Latest developments in artificial intelligence.", Arrays.asList("AI")));
        papers.add(new Paper("Machine Learning Breakthroughs", "Recent machine learning models and their applications.", Arrays.asList("Machine Learning")));
        papers.add(new Paper("Quantum Algorithms", "Exploring new quantum computing algorithms.", Arrays.asList("Quantum Computing")));
        papers.add(new Paper("The Physics of Black Holes", "Study of black hole properties in astrophysics.", Arrays.asList("Physics", "Astronomy")));
        papers.add(new Paper("Statistical Analysis Techniques", "New methods in statistical data analysis.", Arrays.asList("Statistics")));
        papers.add(new Paper("Data Science Trends", "Upcoming trends in data science for big data.", Arrays.asList("Data Science")));
        papers.add(new Paper("Biochemical Pathways", "Analysis of new pathways in biochemistry.", Arrays.asList("Biochemistry")));
        papers.add(new Paper("Genetic Engineering Prospects", "Future of genetic modifications in medicine.", Arrays.asList("Genetics")));
        papers.add(new Paper("Cybersecurity Frameworks", "Advanced frameworks for cybersecurity protection.", Arrays.asList("Cybersecurity")));
        papers.add(new Paper("Cryptography Techniques", "Innovative cryptography methods.", Arrays.asList("Cryptography")));
        papers.add(new Paper("Robotic Arms in Industry", "The use of robotic arms in automated industries.", Arrays.asList("Robotics")));
        papers.add(new Paper("Automation in Modern Manufacturing", "How automation is revolutionizing factories.", Arrays.asList("Automation")));
        papers.add(new Paper("Astrophysical Phenomena", "Understanding complex astrophysical occurrences.", Arrays.asList("Astrophysics")));
        papers.add(new Paper("AI Ethics", "Ethics and regulations in artificial intelligence.", Arrays.asList("AI")));
        papers.add(new Paper("Physics in Quantum Mechanics", "Quantum mechanics principles explained.", Arrays.asList("Physics")));
        papers.add(new Paper("Data Science in Finance", "Financial applications of data science.", Arrays.asList("Data Science", "Statistics")));
        papers.add(new Paper("Genetics and Health", "Impact of genetics on human health.", Arrays.asList("Genetics")));
        papers.add(new Paper("Biotechnology Advances", "Cutting-edge research in biotechnology.", Arrays.asList("Biochemistry")));
        papers.add(new Paper("Cryptographic Algorithms", "Analyzing new cryptographic techniques.", Arrays.asList("Cryptography")));
        papers.add(new Paper("Space Observations", "New technologies for space observation.", Arrays.asList("Astronomy", "Astrophysics")));
        
        
        // Creación de instancias de Author como objetos individuales
        Author author1 = new Author("Michael", "Scott", "michael.scott@techuniversity.com", "Tech University"); // Coincide con Evaluator
        Author author2 = new Author("Emily", "Clark", "emily.clark@scienceinstitute.com", "Science Institute"); // Coincide con Evaluator
        Author author3 = new Author("Raj", "Patel", "raj.patel@datauniversity.com", "Data University"); // Coincide con Evaluator
        Author author4 = new Author("Anna", "Lopez", "anna.lopez@medicalresearchcenter.com", "Medical Research Center"); // Coincide con Evaluator

        // Autores con organizaciones diferentes
        Author author5 = new Author("James", "Wilson", "james.wilson@businesscorp.com", "Business Corp");
        Author author6 = new Author("Sophia", "Reed", "sophia.reed@greenplanet.org", "Green Planet");
        Author author7 = new Author("Luis", "Fernandez", "luis.fernandez@innovativelabs.net", "Innovative Labs");
        Author author8 = new Author("Nina", "Brown", "nina.brown@cityuniversity.com", "City University");
        Author author9 = new Author("Henry", "Smith", "henry.smith@researchhub.org", "Research Hub");
        Author author10 = new Author("Isabella", "Johnson", "isabella.johnson@techfrontiers.com", "Tech Frontiers");
        
        
        
        author1.addPaper(papers.get(0)); // Paper sobre "AI Innovations" (Coincide con "Tech University" y keywords de Evaluator)
        author1.addPaper(papers.get(1)); // Paper sobre "Machine Learning Breakthroughs"

        author2.addPaper(papers.get(2)); // Paper sobre "Quantum Algorithms" (Coincide con "Science Institute")
        author2.addPaper(papers.get(4)); // Paper sobre "Statistical Analysis Techniques"

        author3.addPaper(papers.get(5)); // Paper sobre "Data Science Trends" (Coincide con "Data University")
        author3.addPaper(papers.get(3)); // Paper sobre "The Physics of Black Holes"

        author4.addPaper(papers.get(6)); // Paper sobre "Biochemical Pathways" (Coincide con "Medical Research Center")
        author4.addPaper(papers.get(7)); // Paper sobre "Genetic Engineering Prospects"

        // Para los autores con organizaciones que no coinciden con ningún evaluator
        author5.addPaper(papers.get(8)); // Paper sobre "Cybersecurity Frameworks"
        author5.addPaper(papers.get(9)); // Paper sobre "Cryptography Techniques"

        author6.addPaper(papers.get(10)); // Paper sobre "Robotic Arms in Industry"
        author6.addPaper(papers.get(11)); // Paper sobre "Automation in Modern Manufacturing"

        author7.addPaper(papers.get(12)); // Paper sobre "Astrophysical Phenomena"
        author7.addPaper(papers.get(13)); // Paper sobre "AI Ethics"

        author8.addPaper(papers.get(14)); // Paper sobre "Physics in Quantum Mechanics"
        author8.addPaper(papers.get(15)); // Paper sobre "Data Science in Finance"

        author9.addPaper(papers.get(16)); // Paper sobre "Genetics and Health"
        author9.addPaper(papers.get(17)); // Paper sobre "Biotechnology Advances"

        author10.addPaper(papers.get(18)); // Paper sobre "Cryptographic Algorithms"
        author10.addPaper(papers.get(19)); // Paper sobre "Space Observations"
        
        conferencia.setPapers(papers);
        
        conferencia.evaluatorsAssigment();
        
        System.out.println("Paper y evaluadores");
        
        for(Paper p:papers){
            System.out.println("---------------------------------------------------------\n");
            System.out.println(p);
            System.out.println("Autor:" + p.getAuthor());
            System.out.println(p.getEvaluators());
            System.out.println("---------------------------------------------------------\n");
        }
    }
}
