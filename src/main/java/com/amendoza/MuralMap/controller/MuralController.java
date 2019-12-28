package com.amendoza.MuralMap.controller;

import com.amendoza.MuralMap.model.Mural;
import com.amendoza.MuralMap.service.MuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/mural")
public class MuralController {
    @Autowired
    MuralService service;

    @PostMapping
    public ResponseEntity <Mural> addMural(@Valid @RequestBody Mural mural) throws Exception {

        return new ResponseEntity<>(service.addMural(mural), HttpStatus.CREATED);
    }


}


