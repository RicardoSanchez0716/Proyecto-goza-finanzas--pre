package com.proyectoGozaFinanzas.gozaFinanzas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "movimientos")
public class Movimiento {

    @Getter @Setter @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @Column(name = "movimiento")
    private String movimiento;

    @Getter @Setter @Column(name = "fecha")
    private String fecha;

    @Getter @Setter @Column(name = "monto")
    private String monto;

    @Getter @Setter @Column(name = "categoria")
    private String categoria;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;


}
