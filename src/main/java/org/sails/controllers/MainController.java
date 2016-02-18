package org.sails.controllers;

import org.sails.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * Created by Nodirbek on 12.02.2016. project
 */
@Controller
public class MainController {

    @Inject
    GreetingService greetingService;

    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name", greetingService.getName());

        return modelAndView;
    }

}
