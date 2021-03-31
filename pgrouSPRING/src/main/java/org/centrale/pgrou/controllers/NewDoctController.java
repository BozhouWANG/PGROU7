/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.centrale.pgrou.items.DoctoralStudent;
import org.centrale.pgrou.items.Emploeur;
import org.centrale.pgrou.items.Researcher;
import org.centrale.pgrou.repositories.DoctorRepository;
import org.centrale.pgrou.repositories.ResearcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ECN
 */
@Controller
public class NewDoctController {
    
    @Autowired
    private ResearcherRepository researcherRepository;
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    @RequestMapping(value="newDoctorant.do",method=RequestMethod.GET)
    public ModelAndView handleGet(){  
        return new ModelAndView("Doctor");
    }
    
    @RequestMapping(value = "newDoctorant.do", method = RequestMethod.POST)
    public ModelAndView handlePost(HttpServletRequest request) {
        ModelAndView returned;
        boolean canSave = true;

        // Get parameters
        String refChercheur = "-1";
        if (request.getParameter("idEmployer") != null) {
            try {
                refChercheur = request.getParameter("refChercheur");
            } catch (NumberFormatException ex) {
                canSave = false;
            }
        }
        Researcher researcher = null;
        Optional<Researcher> researcherResult = researcherRepository.findById(refChercheur);
        if (researcherResult.isPresent()) {
            researcher = researcherResult.get();
        } else {
            canSave = false;
        }

        // Create researcher
        if (canSave) {
            // Can save researcher

            DoctoralStudent aDoctor = new DoctoralStudent();
            aDoctor.setNameStudent(request.getParameter("nameStudent"));
            aDoctor.setSurnameStudent(request.getParameter("surnameStudent"));
            aDoctor.setIdOrcid(request.getParameter("idOrcidStudent"));
            
            //TODO : Partie non fonctionnelle pour récupérer les dates
            Date defDate = new Date(Integer.parseInt(request.getParameter("defenseDate"))); //non fonctionnel encore
            aDoctor.setDefenseDate(defDate);
            Date startThesis = new Date(Integer.parseInt(request.getParameter("dateStartThesis")));
            aDoctor.setDateStartThesis(startThesis);
            
            aDoctor.setFuture(request.getParameter("future"));

            doctorRepository.save(aDoctor);

            List<Researcher> listResearchers = researcherRepository.findAll();
            returned = new ModelAndView("AccueilAdmin");
        } else {
            // There is a problem, go back
            List<Researcher> listResearchers = researcherRepository.findAll();

            returned = new ModelAndView("Doctor");
            returned.addObject("listResearchers", listResearchers);
        }
        return returned;
    }
}
