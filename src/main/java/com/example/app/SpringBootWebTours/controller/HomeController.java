package com.example.app.SpringBootWebTours.controller;

import com.example.app.SpringBootWebTours.service.LocationsService;
import com.example.app.SpringBootWebTours.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Autowired
    FeedbackService feedbackService;
    @Autowired
    LocationsService locationsService;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("places", feedbackService.getClients());
        model.addAttribute("resorts", locationsService.getOffices());
        return "home";
    }
}
