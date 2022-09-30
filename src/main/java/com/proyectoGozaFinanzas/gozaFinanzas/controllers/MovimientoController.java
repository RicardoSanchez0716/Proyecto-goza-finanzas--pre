package com.proyectoGozaFinanzas.gozaFinanzas.controllers;


import com.proyectoGozaFinanzas.gozaFinanzas.models.Movimiento;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovimientoController {

    @RequestMapping(value = "movimiento/{id}")
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

    @RequestMapping(value = "movimientos")
    public List<Movimiento> getMovimientos(){
        List<Movimiento> movimientos = new ArrayList<>();
        Movimiento movimiento = new Movimiento();
        movimiento.setId(1L);
        movimiento.setMovimiento("Pago Factura energia");
        movimiento.setFecha("09/09/2022");
        movimiento.setMonto("100.000");
        movimiento.setCategoria("Gasto fijo");
        movimiento.setDescripcion("Pago del luz");

        Movimiento movimiento2 = new Movimiento();
        movimiento2.setId(2L);
        movimiento2.setMovimiento("Pago Factura agua");
        movimiento2.setFecha("09/09/2022");
        movimiento2.setMonto("90.000");
        movimiento2.setCategoria("Gasto fijo");
        movimiento2.setDescripcion("Pago del agua");

        Movimiento movimiento3 = new Movimiento();
        movimiento3.setId(3L);
        movimiento3.setMovimiento("Pago Factura gas");
        movimiento3.setFecha("09/09/2022");
        movimiento3.setMonto("30.000");
        movimiento3.setCategoria("Gasto fijo");
        movimiento3.setDescripcion("Pago del gas");

        movimientos.add(movimiento);
        movimientos.add(movimiento2);
        movimientos.add(movimiento3);
        return movimientos;
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

    @RequestMapping(value = "movimiento3")
    public Movimiento eliminar(){
        Movimiento movimiento = new Movimiento();
        movimiento.setMovimiento("Pago arrendo");
        movimiento.setFecha("09/09/2022");
        movimiento.setMonto("800.000");
        movimiento.setCategoria("Gasto fijo");
        movimiento.setDescripcion("Pago del arriendo mensual");
        return movimiento;
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
