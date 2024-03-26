package dev.shiva.BookMyShow.model;

import dev.shiva.BookMyShow.model.constatnt.AuditoriumFeature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection // used when enum is multiple ie , datastructure, list etx
    @Enumerated(EnumType.STRING) // creates a raltionship between the entity class and the enum in DB
    private List<AuditoriumFeature>auditoriumFeatures;



}
