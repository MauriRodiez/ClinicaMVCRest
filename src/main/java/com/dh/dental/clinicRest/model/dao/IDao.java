package com.dh.dental.clinicRest.model.dao;

import java.util.List;

public interface IDao<T> {
    //Registrar
    T guardar(T t);

    // Listar Todos
    List<T> listarTodos();

    // Buscar por ID
    T buscarPorId(Integer id);

}
