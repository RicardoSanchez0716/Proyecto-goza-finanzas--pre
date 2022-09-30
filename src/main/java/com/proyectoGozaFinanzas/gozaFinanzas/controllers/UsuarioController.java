package com.proyectoGozaFinanzas.gozaFinanzas.controllers;

import com.proyectoGozaFinanzas.gozaFinanzas.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ricardo");
        usuario.setApellido("Leon");
        usuario.setEmail("ricardo@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario1234")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ricardo");
        usuario.setApellido("Leon");
        usuario.setEmail("ricardo@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ricardo");
        usuario.setApellido("Leon");
        usuario.setEmail("ricardo@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario12")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ricardo");
        usuario.setApellido("Leon");
        usuario.setEmail("ricardo@gmail.com");
        return usuario;
    }

}
