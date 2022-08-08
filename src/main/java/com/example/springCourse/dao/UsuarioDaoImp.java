package com.example.springCourse.dao;

import com.example.springCourse.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements IUsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UsuarioModel> getUsuarios() {
        String query = "from UsuarioModel";

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteUsuarios(Long id) {
        UsuarioModel usuario = entityManager.find(UsuarioModel.class, id);
        entityManager.remove(usuario);
    }


}
