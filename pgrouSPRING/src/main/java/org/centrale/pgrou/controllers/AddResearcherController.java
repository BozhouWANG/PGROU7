/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.controllers;

import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.centrale.pgrou.items.*;
import org.centrale.pgrou.repositories.EmployerRepository;
import org.centrale.pgrou.repositories.ResearcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ECN
 */
@Controller
public class AddResearcherController {

    @Autowired
    private ResearcherRepository researcherRepository;

    @Autowired
    private EmployerRepository employerRepository;

    @RequestMapping(value = "add.do", method = RequestMethod.GET)
    public ModelAndView handleGet(HttpServletRequest request) {
        ModelAndView returned;
        List<Researcher> listResearchers = researcherRepository.findAll();
        List<Emploeur> listEmployer = employerRepository.findAll();

        returned = new ModelAndView("chercheur");
        returned.addObject("listResearchers", listResearchers);
        returned.addObject("listEmployer", listEmployer);
        return returned;
    }

    @RequestMapping(value = "add.do", method = RequestMethod.POST)
    public ModelAndView handlePost(HttpServletRequest request) {
        ModelAndView returned;
        boolean canSave = true;

        // Get parameters
        int idEmployer = -1;
        if (request.getParameter("idEmployer") != null) {
            try {
                idEmployer = Integer.parseInt(request.getParameter("idEmployer"));
            } catch (NumberFormatException ex) {
                canSave = false;
            }
        }
        Emploeur emploer = null;
        Optional<Emploeur> employerResult = employerRepository.findById(idEmployer);
        if (employerResult.isPresent()) {
            emploer = employerResult.get();
        } else {
            canSave = false;
        }

        // Create researcher
        if (canSave) {
            // Can save researcher

            Researcher aResearcher = new Researcher();
            aResearcher.setNameResearcher(request.getParameter("nameResearcher"));
            aResearcher.setSurnameResearcher(request.getParameter("surnameResearcher"));
            aResearcher.setIdOrcidResearcher(request.getParameter("idOrcidResearcher"));
            aResearcher.setIdEmployer(emploer);
            aResearcher.setStatus(request.getParameter("Statut"));
            aResearcher.setContractType(request.getParameter("contractType"));
            aResearcher.setFunction(request.getParameter("function"));
            aResearcher.setEmailAddress(request.getParameter("emailAddress"));

            researcherRepository.save(aResearcher);

            List<Researcher> listResearchers = researcherRepository.findAll();
            returned = new ModelAndView("AccueilAdmin");
            returned.addObject("listResearchers", listResearchers);
        } else {
            // There is a problem, go back
            List<Researcher> listResearchers = researcherRepository.findAll();
            List<Emploeur> listEmployer = employerRepository.findAll();

            returned = new ModelAndView("chercheur");
            returned.addObject("listResearchers", listResearchers);
            returned.addObject("listEmployer", listEmployer);
        }
        return returned;
    }
}
