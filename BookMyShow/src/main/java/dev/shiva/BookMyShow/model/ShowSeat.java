package dev.shiva.BookMyShow.model;

import dev.shiva.BookMyShow.model.constatnt.ShowSeatStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

public class ShowSeat extends BaseModel{
    private int prica;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}
