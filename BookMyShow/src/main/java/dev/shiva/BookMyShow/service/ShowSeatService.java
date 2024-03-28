package dev.shiva.BookMyShow.service;

import dev.shiva.BookMyShow.model.ShowSeat;
import dev.shiva.BookMyShow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShowSeatService {

    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(int showSeatId){
        return showSeatRepository.findById(showSeatId).get();

    }

    public ShowSeat saveShowSeat(ShowSeat showSeat){
        return showSeatRepository.save(showSeat);

    }
}
