package dev.shiva.BookMyShow.controller;

import dev.shiva.BookMyShow.dto.BookTicketRequestDto;
import dev.shiva.BookMyShow.model.Ticket;
import dev.shiva.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketRequestDto bookTicketRequestDto) throws Exception {
        return ResponseEntity.ok(ticketService.bookTicket(bookTicketRequestDto.getShowSeatIds(), bookTicketRequestDto.getUseId()));

    }

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet = ticketService.greet();
        return ResponseEntity.ok(greet);
    }

}
