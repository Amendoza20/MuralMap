package com.amendoza.MuralMap.controller;

import com.amendoza.MuralMap.model.Mural;
import com.amendoza.MuralMap.service.MuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/mural")
public class MuralController {
    @Autowired
    MuralService service;

    @PostMapping
    public ResponseEntity<Mural> addMural(@Valid @RequestBody Mural mural) throws Exception {
        return new ResponseEntity<>(service.addMural(mural), HttpStatus.CREATED);
    }
    @PutMapping("{muralName}")
    public ResponseEntity<Mural> updateMural(@PathVariable String muralName, @Valid @RequestBody Mural mural){
        return new ResponseEntity<>(service.updateMural(muralName, mural), HttpStatus.OK);
    }
    @GetMapping("/findMural/{muralName}")
    public ResponseEntity<Mural> findMuralByName(@PathVariable String muralName){
        return new ResponseEntity<>(service.findMuralByName(muralName), HttpStatus.OK);
    }
    @GetMapping("/findMural/{artistName}")
    public ResponseEntity<Mural> findMuralByArtist(@PathVariable String artistName){
        return new ResponseEntity<>(service.findMuralByArtistName(artistName), HttpStatus.OK);
    }
    @GetMapping("/findMural/{location}")
    public ResponseEntity<Mural> findMuralByLocation(@PathVariable String location){
        return new ResponseEntity<>(service.findMuralByLocation(location), HttpStatus.OK);
    }
    @GetMapping("/findMural/{genre}")
    public ResponseEntity<Mural> findMuralByGenre(@PathVariable String genre){
        return new ResponseEntity<>(service.findMuralByGenre(genre), HttpStatus.OK);
    }
    @GetMapping("/getMurals")
    public ResponseEntity<List<Mural>> getAllMurals(){
        return new ResponseEntity<>(service.getAllMurals(),HttpStatus.OK);
    }
    @GetMapping("/getMurals/{artistName}")
    public ResponseEntity<List<Mural>> getAllMuralsByArtistName(@PathVariable String artistName){
        return new ResponseEntity<>(service.getAllByArtistName(artistName), HttpStatus.FOUND);
    }
    @GetMapping("/getMurals/{genre}")
    public ResponseEntity<List<Mural>> getAllMuralsByGenre (@PathVariable String genre){
        return new ResponseEntity<>(service.getAllByGenre(genre), HttpStatus.FOUND);
    }
    @DeleteMapping("/{muralId")
    public ResponseEntity<Boolean> deleteMural(@PathVariable Long id){
        return new ResponseEntity<>(service.deleteMural(id), HttpStatus.OK);
    }
 }


