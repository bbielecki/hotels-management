package com.studia.bd2.hotels.management.server.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity(name = "personal_data")
public class PersonalData {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
}