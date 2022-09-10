/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariagomezcm.service;

import com.mariagomezcm.domain.Trabajo;
import java.util.List;

/**
 *
 * @author simhoffanzor
 */
public interface ITrabajoService {
    
    public List<Trabajo> verTrabajos();
    
    public void crearTrabajo(Trabajo trab);
    
    public void borrarTrabajo(Long id);
}
