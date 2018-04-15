package com.studia.bd2.hotels.management.server.database.entity;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(name = "check_in_date")
    private LocalDateTime checkInDate;

    @Column(name = "check_out_date")
    private LocalDateTime checkOutDate;

    private Long cost;

    @Enumerated(EnumType.STRING)
    private ReservationState state;

    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private HotelClient client;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "rooms_reservations",
            joinColumns = {@JoinColumn(name = "reservation_id")},
            inverseJoinColumns = {@JoinColumn(name = "room_id")}
    )
    private List<Room> rooms;
}
