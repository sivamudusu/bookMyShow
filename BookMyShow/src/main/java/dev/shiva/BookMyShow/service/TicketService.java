package dev.shiva.BookMyShow.service;

import dev.shiva.BookMyShow.exception.SeatNotAvailableException;
import dev.shiva.BookMyShow.model.ShowSeat;
import dev.shiva.BookMyShow.model.Ticket;
import dev.shiva.BookMyShow.model.constatnt.ShowSeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class TicketService {

    @Autowired
    private ShowSeatService showSeatService;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer>showSeatIds,int userId) throws Exception {
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new SeatNotAvailableException();
            }
        }
        for(int showSetId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSetId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }
//        payment flow
        startPayment();
        return new Ticket();


    }
    public boolean startPayment(){
        return true;
    }
    public String greet(){
        return "hello word";
    }
}
