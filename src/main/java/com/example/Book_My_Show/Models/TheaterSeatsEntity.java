package com.example.Book_My_Show.Models;

import com.example.Book_My_Show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;

import java.security.PrivateKey;

@Entity
@Table(name = "theater_seats")
@Data
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




}
