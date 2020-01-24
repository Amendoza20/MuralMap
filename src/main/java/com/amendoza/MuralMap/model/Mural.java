package com.amendoza.MuralMap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mural {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long muralId;
    
    private String muralName;
    private String artistName;
    private String muralDescription;
    private String location;
    private String genre;

    public Mural() {
    }

    public Mural(String muralName, String artistName, String muralDescription, String location, String genre) {
        this.muralName = muralName;
        this.artistName = artistName;
        this.muralDescription = muralDescription;
        this.location = location;
        this.genre = genre;
    }

    public Mural(Long muralId, String muralName, String artistName, String muralDescription, String location, String genre) {
        this.muralId = muralId;
        this.muralName = muralName;
        this.artistName = artistName;
        this.muralDescription = muralDescription;
        this.location = location;
        this.genre = genre;
    }

    public Long getMuralId() {
        return muralId;
    }

    public void setMuralId(Long muralId) {
        this.muralId = muralId;
    }

    public String getMuralName() {
        return muralName;
    }

    public void setMuralName(String muralName) {
        this.muralName = muralName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getMuralDescription() {
        return muralDescription;
    }

    public void setMuralDescription(String muralDescription) {
        this.muralDescription = muralDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
