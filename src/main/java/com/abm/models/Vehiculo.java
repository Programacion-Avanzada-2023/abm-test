/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abm.models;

import javax.persistence.*;

/**
 *
 * @author mazal
 */
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    /**
     * An unique identifier name for this vehicle.
     */
    private String name;

    @OneToOne
    /**
     * The specific model linked to this vehicle.
     */
    private Modelo model;

    @Column(name = "domain", nullable = false)
    /**
     * The vehicle's domain.
     */
    private String domain;
}
