package com.example.springCourse.controllers;

import com.example.springCourse.dao.IUsuarioDao;
import com.example.springCourse.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    public static final String API = "api/v1/user";
    @Autowired
    private IUsuarioDao usuarioDao;

    @RequestMapping(value = API, method = RequestMethod.GET)
    public List<UsuarioModel> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = API + "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        usuarioDao.deleteUsuarios(id);
    }

    @RequestMapping(value = API, method = RequestMethod.POST)
    public void createUser() {

    }

}
