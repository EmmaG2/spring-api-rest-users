package com.example.springCourse.dao;

import com.example.springCourse.models.UsuarioModel;

import java.util.List;

public interface IUsuarioDao {
    List<UsuarioModel> getUsuarios();
    void deleteUsuarios(Long id);
}
