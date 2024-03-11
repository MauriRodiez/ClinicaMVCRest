package com.dh.dental.clinicRest.model.controller;


import com.dh.dental.clinicRest.model.Odontologo;
import com.dh.dental.clinicRest.model.service.IOdontologoService;
import com.dh.dental.clinicRest.model.service.implementation.OdontologoService;
import org.springframework.web.bind.annotation.*;
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
}
