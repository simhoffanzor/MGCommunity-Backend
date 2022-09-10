package com.mariagomezcm.service;

import com.mariagomezcm.domain.Certificacion;
import com.mariagomezcm.repository.CertificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificacionService implements ICertificacionService {
    
    @Autowired
    private CertificacionRepository certRepo;

    @Override
    public List<Certificacion> verCertificaciones() {
        return certRepo.findAll();
    }

    @Override
    public void crearCertificacion(Certificacion cert) {
        certRepo.save(cert);
    }

    @Override
    public void borrarCertificacion(Long id) {
        certRepo.deleteById(id);
    }
    
}
