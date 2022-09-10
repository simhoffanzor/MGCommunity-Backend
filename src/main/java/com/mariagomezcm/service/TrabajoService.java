/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariagomezcm.service;

import com.mariagomezcm.domain.Trabajo;
import com.mariagomezcm.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author simhoffanzor
 */
@Service
public class TrabajoService implements ITrabajoService{
    
    @Autowired
    private TrabajoRepository trabajoRepo;

    @Override
    public List<Trabajo> verTrabajos() {
        return trabajoRepo.findAll();
    }

    @Override
    public void crearTrabajo(Trabajo trab) {
        trabajoRepo.save(trab);
    }

    @Override
    public void borrarTrabajo(Long id) {
        trabajoRepo.deleteById(id);
    }
    
    
}
