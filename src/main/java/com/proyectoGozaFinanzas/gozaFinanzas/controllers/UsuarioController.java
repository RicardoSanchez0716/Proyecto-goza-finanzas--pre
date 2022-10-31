package com.proyectoGozaFinanzas.gozaFinanzas.controllers;

import com.proyectoGozaFinanzas.gozaFinanzas.dao.UsuarioDao;
import com.proyectoGozaFinanzas.gozaFinanzas.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ricardo");
        usuario.setApellido("Leon");
        usuario.setEmail("ricardo@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuario(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword().toCharArray());
        usuario.setPassword(hash);

        usuarioDao.registro(usuario);
    }

    @RequestMapping(value = "usuarios1")
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
