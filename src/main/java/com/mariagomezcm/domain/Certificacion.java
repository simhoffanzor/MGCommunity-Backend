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
public class Certificacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String nombreEmisor;
    private String fechaCertificacion;
    private String imagenEmisor;
    private String certificado;

    public Certificacion() {
    }

    public Certificacion(Long id, String titulo, String nombreEmisor, String fechaCertificacion, String imagenEmisor, String certificado) {
        this.id = id;
        this.titulo = titulo;
        this.nombreEmisor = nombreEmisor;
        this.fechaCertificacion = fechaCertificacion;
        this.imagenEmisor = imagenEmisor;
        this.certificado = certificado;
    }
    
    
    
}