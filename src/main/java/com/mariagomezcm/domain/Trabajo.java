/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariagomezcm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author simhoffanzor
 */
@Getter @Setter
@Entity
public class Trabajo {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;
    
    private String puesto;
    private String lugarTrabajo;
    private String periodo;
    private String imagenLugar;

    public Trabajo() {
    }

    public Trabajo(Long id, String puesto, String lugarTrabajo, String periodo, String imagenLugar) {
        this.id = id;
        this.puesto = puesto;
        this.lugarTrabajo = lugarTrabajo;
        this.periodo = periodo;
        this.imagenLugar = imagenLugar;
    }
    
    
}
