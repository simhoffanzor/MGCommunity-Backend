package com.mariagomezcm.controller;

import com.mariagomezcm.domain.Certificacion;
import com.mariagomezcm.domain.Trabajo;
import com.mariagomezcm.service.ICertificacionService;
import com.mariagomezcm.service.ITrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author simhoffanzor
 */
@RestController
public class Controller {
    
    //Métodos de certificación
    @Autowired
    private ICertificacionService certService;
    
    @PostMapping("/newCertificacion")
    public void agregarCertificacion(@RequestBody Certificacion cert){
        certService.crearCertificacion(cert);
    }
    
    @GetMapping("/verCertificaciones")
    public List<Certificacion> verCertificaciones(){
        return certService.verCertificaciones();
    }
    
    @DeleteMapping ("/eliminarCertificacion/{id}")
    public void borrarCertificacion(@PathVariable Long id){
        certService.borrarCertificacion(id);
    }
    
    //Métodos de trabajo
    @Autowired
    private ITrabajoService trabajoService;
    
    @PostMapping("/newTrabajo")
    public void agregarTrabajo(@RequestBody Trabajo trab){
        trabajoService.crearTrabajo(trab);
    }
    
    @GetMapping("/verTrabajos")
    public List<Trabajo> verTrabajos(){
        return trabajoService.verTrabajos();
    }
    
    @DeleteMapping("/eliminarTrabajo/{id}")
    public void borrarTrabajo(@PathVariable Long id){
        trabajoService.borrarTrabajo(id);
    }
}
