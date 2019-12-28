package com.amendoza.MuralMap.repository;

import com.amendoza.MuralMap.model.Mural;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MuralRepository extends CrudRepository<Mural, Long> {
   //Get single mural info
    Mural findMuralByMuralName(String muralName);

    Mural findMuralByArtistName (String artistName);

    Mural findMuralByLocation (String location);

    Mural findMuralByGenre (String genre);

    //Get multiple mural info
    List<Mural> getAllByMuralName(String muralName);

    List<Mural> getAllByArtistName(String artistName);

    List<Mural> getAllByGenre(String genre);
}
