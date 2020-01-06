package com.amendoza.MuralMap.repository;

import com.amendoza.MuralMap.model.Mural;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MuralRepository extends JpaRepository<Mural, Long> {
   //Get single mural info
    Mural findMuralByMuralName(String muralName);

    Mural findMuralByArtistName (String artistName);

    Mural findMuralByLocation (String location);

    Mural findMuralByGenre (String genre);

    Mural findMuralById(Long id);

    //Get multiple mural info

    List<Mural> getAllByArtistName(String artistName);

    List<Mural> getAllByGenre(String genre);


}
