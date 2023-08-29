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
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private int id;

    @Column(name = "nombre", nullable = false, length = 32)
    /**
     * A specific name to identify this brand as. Must be unique.
     */
    private String nombre;

    @Column(name = "descripcion", nullable = true)
    /**
     * An optional description about the brand.
     */
    private String descripcion;
}
