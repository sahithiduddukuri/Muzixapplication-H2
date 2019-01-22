package com.stackroute.Muzix.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity// Creation of table
@Getter
@Setter
@AllArgsConstructor// use of lombok
@NoArgsConstructor//Default Constructor
@Builder

public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String comment;



}
