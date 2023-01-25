package com.example.Book_My_Show.Models;

import com.example.Book_My_Show.Enums.SeatType;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Entity
@Table(name = "theater_seats")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "seat_no" , nullable = false)
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private int rate;

    @ManyToOne
    @JoinColumn
    private  TheaterEntity theater;


    public TheaterSeatsEntity(String seatNo , SeatType classic, int i) {
    }
}
