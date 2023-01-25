package com.example.Book_My_Show.Controllers;

//
//import com.example.book_my_show_backed.Dtos.MovieRequestDto;
//import com.example.Book_my_show_backed.Service.MovieService;
import com.example.Book_My_Show.Dtos.MovieRequestDto;
import com.example.Book_My_Show.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){

        return movieService.addMovie(movieRequestDto);
    }




    //Get movie by Name
}
