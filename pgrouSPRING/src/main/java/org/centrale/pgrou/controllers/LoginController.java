/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.controllers;

import java.util.List;
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
public class LoginController {
    
    @RequestMapping(value="login.do",method=RequestMethod.GET)
    public ModelAndView handleGet(){  
        return new ModelAndView("AccueilIntranet");
    }
    
    @RequestMapping(value="login.do",method=RequestMethod.POST)
    public ModelAndView handlePost(@ModelAttribute("User")User anUser) {
        ModelAndView returned;
        if ((anUser.getUser().equals("admin")&&(anUser.getPasswd().equals("adminPass")))){
            returned = new ModelAndView("AccueilIntranet");
        } else {
            returned = new ModelAndView("AccueilAdmin");
        }
        return returned;
    }
}