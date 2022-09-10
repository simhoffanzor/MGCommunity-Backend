/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariagomezcm.repository;

import com.mariagomezcm.domain.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author simhoffanzor
 */
@Repository
public interface CertificacionRepository extends JpaRepository<Certificacion, Long> {
    
}
