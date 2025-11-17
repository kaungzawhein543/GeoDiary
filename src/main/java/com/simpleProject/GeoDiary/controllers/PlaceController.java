package com.simpleProject.GeoDiary.controllers;

import com.simpleProject.GeoDiary.entities.Place;
import com.simpleProject.GeoDiary.services.PlaceService;
import com.simpleProject.GeoDiary.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Constants.PLACE_API)
public class PlaceController {

    private final PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    public String getAllPlaces(Model model) {
        model.addAttribute("places", placeService.getAllPlaces());
        return "places";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("place", new Place());
        return "create";
    }

    @PostMapping
    public String createPlace(@ModelAttribute Place place) {
        placeService.addPlace(place);
        return "redirect:/places";
    }
}
