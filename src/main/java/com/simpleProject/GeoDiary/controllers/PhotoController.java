package com.simpleProject.GeoDiary.controllers;

import com.simpleProject.GeoDiary.services.PhotoService;
import com.simpleProject.GeoDiary.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Constants.PHOTO_API)
public class PhotoController {

    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }
}
