package com.proyectoGozaFinanzas.gozaFinanzas.controllers;


import com.proyectoGozaFinanzas.gozaFinanzas.dao.MovimientoDao;
import com.proyectoGozaFinanzas.gozaFinanzas.dao.UsuarioDao;
import com.proyectoGozaFinanzas.gozaFinanzas.models.Movimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovimientoController {

    @Autowired
    private MovimientoDao movimientoDao;

    @RequestMapping(value = "api/movimiento/{id}", method = RequestMethod.GET)
    public Movimiento getMovimiento(@PathVariable Long id){
        Movimiento movimiento = new Movimiento();
        movimiento.setId(id);
        movimiento.setMovimiento("Pago arrendo");
        movimiento.setFecha("09/09/2022");
        movimiento.setMonto("800.000");
        movimiento.setCategoria("Gasto fijo");
        movimiento.setDescripcion("Pago del arriendo mensual");
        return movimiento;
    }

    @RequestMapping(value = "api/movimientos", method = RequestMethod.GET)
    public List<Movimiento> getMovimientos(){
        return movimientoDao.getMovimientos();

    }


    @RequestMapping(value = "api/movimientos",method = RequestMethod.POST)
    public void crearMovimientos(@RequestBody Movimiento movimiento){
        movimientoDao.crear(movimiento);

    }

    @RequestMapping(value = "movimiento2")
    public Movimiento editar(){
        Movimiento movimiento = new Movimiento();
        movimiento.setMovimiento("Pago arrendo");
        movimiento.setFecha("09/09/2022");
        movimiento.setMonto("800.000");
        movimiento.setCategoria("Gasto fijo");
        movimiento.setDescripcion("Pago del arriendo mensual");
        return movimiento;
    }

    @RequestMapping(value = "api/movimientos/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        movimientoDao.eliminar(id);
    }

    @RequestMapping(value = "movimiento4")
    public Movimiento buscar(){
        Movimiento movimiento = new Movimiento();
        movimiento.setMovimiento("Pago arrendo");
        movimiento.setFecha("09/09/2022");
        movimiento.setMonto("800.000");
        movimiento.setCategoria("Gasto fijo");
        movimiento.setDescripcion("Pago del arriendo mensual");
        return movimiento;
    }
}
