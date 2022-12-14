package com.proyectoGozaFinanzas.gozaFinanzas.dao;

import com.proyectoGozaFinanzas.gozaFinanzas.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void registro(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean verificarCredenciales(Usuario usuario) {
    String query = "FROM Usuario WHERE email = :email";
    List<Usuario> lista = entityManager.createQuery(query)
            .setParameter("email", usuario.getEmail())
            .getResultList();

        if (lista.isEmpty()){
            return false;
        }

        String passwordHashed = lista.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.verify(passwordHashed, usuario.getPassword().toCharArray());

    }
}
