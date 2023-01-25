package com.example.Book_My_Show.Models;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "theater")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    public List<TheaterSeatsEntity> getTheaterSeatsEntityList() {
        return theaterSeatsEntityList;
    }

    public void setTheaterSeatsEntityList(List<TheaterSeatsEntity> theaterSeatsEntityList) {
        this.theaterSeatsEntityList = theaterSeatsEntityList;
    }
}
