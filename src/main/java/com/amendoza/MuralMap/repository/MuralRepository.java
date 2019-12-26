package com.amendoza.MuralMap.repository;

import com.amendoza.MuralMap.model.Mural;
import org.springframework.data.repository.CrudRepository;

public interface MuralRepository extends CrudRepository <Mural, Integer> {
    Mural findMuralByName (String name);
    Mural findMuralByArtistName (String artistName);
    Mural findMuralByLocation (String location);
    Mural findMuralByGenre (String genre);

}
