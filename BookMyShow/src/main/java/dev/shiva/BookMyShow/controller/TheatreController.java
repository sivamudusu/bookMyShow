package dev.shiva.BookMyShow.controller;

import dev.shiva.BookMyShow.dto.TheatreAddRequestDto;
import dev.shiva.BookMyShow.model.Theatre;
import dev.shiva.BookMyShow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {
    @Autowired
    private TheatreService theatreService;

    @PostMapping("/theatre")
    public ResponseEntity createTheatre(@RequestBody TheatreAddRequestDto theatreAddRequestDto){
        Theatre savedTheatre= theatreService.saveTheatre(theatreAddRequestDto.getName(),theatreAddRequestDto.getAddress(),
                theatreAddRequestDto.getCityId());

        return ResponseEntity.ok(savedTheatre);
    }

}
