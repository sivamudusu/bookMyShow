package dev.shiva.BookMyShow.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreAddRequestDto {
    private String name;
    private String Address;
    private int cityId;

}
