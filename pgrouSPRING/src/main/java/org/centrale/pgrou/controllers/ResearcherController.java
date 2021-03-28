/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.controllers;

import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.centrale.pgrou.items.Researcher;
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
public class ResearcherController {
    @Autowired
    private ResearcherRepository researcherRepository;
    
    /* Pas de requete en delete.DO pour le moment
    @RequestMapping(value="delete.do",method=RequestMethod.GET)
    public ModelAndView handleGet(){        
        return new ModelAndView("Suppression_de_profil");
    }
*/
    
    @RequestMapping(value="delete.do",method=RequestMethod.POST)
    public ModelAndView handlePost(HttpServletRequest request) {
        ModelAndView returned ;
        
        String idStr = request.getParameter("id");
        if (idStr != null){
            //int id = Integer.parseInt(idStr);
            Optional<Researcher> researcher = researcherRepository.findById(idStr);
            if (researcher.isPresent()){
                researcherRepository.delete(researcher.get());
            }
        }
        
        List<Researcher> listResearchers = researcherRepository.findAll();
        returned = new ModelAndView("Suppression_de_profil");
        returned.addObject("listResearchers", listResearchers);
        return returned;
    }
}
