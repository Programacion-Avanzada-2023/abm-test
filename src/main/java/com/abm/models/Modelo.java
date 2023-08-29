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
@Table(name = "modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    /**
     * An unique identified name for this model.
     */
    private String name;

    @Column(name = "year", nullable = false)
    /**
     * The year this model was radicated in.
     */
    private int year;

    @OneToOne
    /**
     * The brand this model is from.
     */
    private Marca brand;
}
