package com.proyectoGozaFinanzas.gozaFinanzas.dao;

import com.proyectoGozaFinanzas.gozaFinanzas.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void registro(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
