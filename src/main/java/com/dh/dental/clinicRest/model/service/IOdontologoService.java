package com.dh.dental.clinicRest.model.service;


import com.dh.dental.clinicRest.model.Odontologo;

import java.util.List;

public interface IOdontologoService {

    Odontologo guardar (Odontologo odontologo);

    List<Odontologo> listarTodos();

    Odontologo buscarPorId(Integer id);
    void eliminar(Integer id);
}
