package com.example.Book_My_Show.Models;

import com.example.Book_My_Show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "show_seats")
public class ShowSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "seat_no" , nullable = false)
    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;


    private boolean booked;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private  ShowEntity show;

    @ManyToOne
    @JoinColumn
    private  TicketEntity ticket;



}
