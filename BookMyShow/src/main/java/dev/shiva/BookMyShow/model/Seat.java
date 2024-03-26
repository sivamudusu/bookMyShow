package dev.shiva.BookMyShow.model;

import dev.shiva.BookMyShow.model.constatnt.SeatStatus;
import dev.shiva.BookMyShow.model.constatnt.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNUmber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private int row;
    private int col;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;



}
