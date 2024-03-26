package dev.shiva.BookMyShow.model;

import dev.shiva.BookMyShow.model.constatnt.PaymentMode;
import dev.shiva.BookMyShow.model.constatnt.PaymentStatus;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private Double amount;
    private String reference;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @ElementCollection
    private PaymentMode paymentMode;


}
