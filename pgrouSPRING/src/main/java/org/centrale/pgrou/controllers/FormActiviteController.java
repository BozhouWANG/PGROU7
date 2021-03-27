/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ECN
 */
@Controller
public class FormActiviteController {
    @RequestMapping(value="newActivity.do",method=RequestMethod.GET)
    public ModelAndView handleGet(){  
        return new ModelAndView("Formulaire_d_activite");
    }
}
