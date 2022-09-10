/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariagomezcm.service;

import com.mariagomezcm.domain.Certificacion;
import java.util.List;

/**
 *
 * @author simhoffanzor
 */
public interface ICertificacionService {
    
    public List<Certificacion> verCertificaciones();
    
    public void crearCertificacion(Certificacion cert);
    
    public void borrarCertificacion(Long id);

}
