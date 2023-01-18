package com.example.Book_My_Show.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "theater")
@Entity
@Data
@NoArgsConstructor
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    private  String city;
    private  String address;

    // list of shows
    @OneToMany(mappedBy = "theater" , cascade = CascadeType.ALL)
    List<ShowEntity> listOfShows;

    // list of theater seats
    @OneToMany(mappedBy = "theater" , cascade = CascadeType.ALL)
    List<TheaterSeatsEntity> theaterSeatsEntityList;
}
