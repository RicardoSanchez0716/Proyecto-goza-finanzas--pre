package com.proyectoGozaFinanzas.gozaFinanzas.dao;

import com.proyectoGozaFinanzas.gozaFinanzas.models.Movimiento;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class MovimientoDaoImp implements MovimientoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Movimiento> getMovimientos() {
        String query = "FROM Movimiento";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Movimiento movimiento = entityManager.find(Movimiento.class, id);
        entityManager.remove(movimiento);
    }

    @Override
    public void crear(Movimiento movimiento) {
        entityManager.merge(movimiento);
    }


}
