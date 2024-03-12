package com.dh.dental.clinicRest.model.controller;


import com.dh.dental.clinicRest.model.Odontologo;
import com.dh.dental.clinicRest.model.service.IOdontologoService;
import com.dh.dental.clinicRest.model.service.implementation.OdontologoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class OdontologoController {
    private IOdontologoService odontologoService;

    public OdontologoController(OdontologoService odontologoService){
        this.odontologoService = odontologoService;
    }

    @PostMapping("/registrar")
    public Odontologo guardar(@RequestBody Odontologo odontologo){
        return odontologoService.guardar(odontologo);
    }

    @GetMapping("/listar")
    public List<Odontologo> listarOdontologos(){
        return odontologoService.listarTodos();
    }
    @GetMapping("/{id}")
    public Odontologo buscarPorId(@PathVariable Integer id){
        return odontologoService.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        odontologoService.eliminar(id);
    }

    @PutMapping("/update")
    public Odontologo actualizar(@RequestBody Odontologo odontologo){
        return odontologoService.actualizar(odontologo);
    }
}
