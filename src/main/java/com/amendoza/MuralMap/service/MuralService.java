package com.amendoza.MuralMap.service;

import com.amendoza.MuralMap.model.Mural;
import com.amendoza.MuralMap.repository.MuralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuralService {
    private MuralRepository repository;

    @Autowired
    public MuralService (MuralRepository repository){
        this.repository = repository;
    }

    public Mural addMural (Mural mural) throws Exception{
        if(repository.findMuralByName(mural.getName()) == null){
            return repository.save(mural);
        }
        throw new Exception("Mural already exists. Try 'updating' instead?");
    }

    public Mural updateMural (String name, Mural mural){
        Mural originalMural = findMuralByName(name);
        if(mural.getName() != null)
            originalMural.setName(mural.getName());
        if(mural.getArtistName() != null)
            originalMural.setArtistName(mural.getArtistName());
        if(mural.getMuralDescription() != null)
            originalMural.setMuralDescription(mural.getMuralDescription());
        if(mural.getLocation() != null)
            originalMural.setLocation(mural.getLocation());
        if(mural.getGenre() != null)
            originalMural.setLocation(mural.getLocation());
        return repository.save(mural);
    }

    public Mural findMuralByName (String name) {
        return repository.findMuralByName(name);
    }

    public Mural findMuralByArtistName (String artistName){
        return repository.findMuralByArtistName(artistName);
    }

    public Mural findMuralByLocation (String location){
        return repository.findMuralByLocation(location);
    }

    public Mural findMuralByGenre (String genre){
        return repository.findMuralByGenre(genre);
    }

    public List<Mural> getAllMurals (String name){
        return repository.getAllByName(name);
    }
    public List<Mural> getAllByArtistName (String artistName){
        return repository.getAllByArtistName(artistName);
    }
    public List<Mural> getAllByGenre (String genre){
        return repository.getAllByGenre(genre);
    }
    public Boolean deleteMural (String name){
        Mural mural = findMuralByName(name);
        if(mural != null){
            repository.delete(mural);
            return true;
        }
        return false;
    }
}
