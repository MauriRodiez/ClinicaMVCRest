package com.dh.dental.clinicRest.model.service.implementation;


import com.dh.dental.clinicRest.model.Odontologo;
import com.dh.dental.clinicRest.model.dao.IDao;
import com.dh.dental.clinicRest.model.dao.implementation.OdontologoDaoH2;
import com.dh.dental.clinicRest.model.service.IOdontologoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService implements IOdontologoService {

    private IDao<Odontologo> iDao;

    public OdontologoService() {
        iDao = new OdontologoDaoH2();
    }
    @Override
    public Odontologo guardar(Odontologo odontologo){
        return iDao.guardar(odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        return iDao.listarTodos();
    }

    @Override
    public Odontologo buscarPorId(Integer id) {
        return iDao.buscarPorId(id);
    }

    @Override
    public void eliminar(Integer id) {
        iDao.eliminar(id);
    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) {
        return iDao.actualizar(odontologo);
    }


}
