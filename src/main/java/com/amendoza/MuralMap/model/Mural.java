package com.amendoza.MuralMap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mural {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer muralId;
    private String name;
    private String artistName;
    private String muralDescription;
    private String location;
    //maybe I can make this an enum. But How? and even Why?
    private String genre;

    public Mural() {
    }

    public Mural(String name, String artistName, String muralDescription, String location, String genre) {
        this.name = name;
        this.artistName = artistName;
        this.muralDescription = muralDescription;
        this.location = location;
        this.genre = genre;
    }

    public Mural(Integer muralId, String name, String artistName, String muralDescription, String location, String genre) {
        this.name = name;
        this.artistName = artistName;
        this.muralDescription = muralDescription;
        this.location = location;
        this.genre = genre;
    }

    public Integer getMuralId() {
        return muralId;
    }

    public void setMuralId(Integer muralId) {
        this.muralId = muralId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
