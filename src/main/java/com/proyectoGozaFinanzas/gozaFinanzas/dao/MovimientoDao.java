package com.proyectoGozaFinanzas.gozaFinanzas.dao;

import com.proyectoGozaFinanzas.gozaFinanzas.models.Movimiento;

import java.util.List;

public interface MovimientoDao {
    List<Movimiento> getMovimientos();


    void eliminar(Long id);

    void crear(Movimiento movimiento);
}
