package com.amendoza.MuralMap.controller;

import com.amendoza.MuralMap.service.MuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MuralController {
    MuralService service;

    @Autowired
    public MuralController (MuralService service){
        this.service = service;
    }
}
