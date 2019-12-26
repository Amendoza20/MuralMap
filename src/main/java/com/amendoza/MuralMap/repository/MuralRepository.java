package com.amendoza.MuralMap.repository;

import com.amendoza.MuralMap.model.Mural;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MuralRepository extends CrudRepository <Mural, Integer> {
   //Get single mural info
    Mural findMuralByName (String name);

    Mural findMuralByArtistName (String artistName);

    Mural findMuralByLocation (String location);

    Mural findMuralByGenre (String genre);

    //Get multiple mural info
    List<Mural> getAllByName(String name);

    List<Mural> getAllByArtistName(String artistName);

    List<Mural> getAllByGenre(String genre);
}
