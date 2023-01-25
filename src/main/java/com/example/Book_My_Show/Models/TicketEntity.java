package com.example.Book_My_Show.Models;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tickets")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketEntity  {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private  String allocated_seats;
    private  int amount;
    private Date bookedAt;
    @ManyToOne
    @JoinColumn
    private UserEntity user;
    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @OneToMany(mappedBy = "ticket" , cascade = CascadeType.ALL)
   private List<ShowSeatEntity> bookedSeats;

}