package dev.shiva.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class BookTicketRequestDto {
    private List<Integer> showSeatIds;
    private Integer useId;

}
