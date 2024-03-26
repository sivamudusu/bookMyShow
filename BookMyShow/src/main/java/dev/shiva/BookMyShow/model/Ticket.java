package dev.shiva.BookMyShow.model;

import dev.shiva.BookMyShow.model.constatnt.TicketStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<ShowSeat>showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;


}
