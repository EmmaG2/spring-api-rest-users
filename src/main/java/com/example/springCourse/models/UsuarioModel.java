package com.example.springCourse.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@ToString @EqualsAndHashCode
public class UsuarioModel {

    @Column(name = "nombre", nullable = false)
    @Getter @Setter
    private String nombre;

    @Getter @Setter @Column(name = "apellido", nullable = false)
    private String apellido;

    @Getter @Setter @Column(name = "email", nullable = false)
    private String email;

    @Getter @Setter @Column(name = "telefono", nullable = false)
    private String telefono;

    @Getter @Setter @Column(name = "image", nullable = false)
    private String image;


    @Id
    @Column(name = "id", nullable = false, unique = true)
    @Getter @Setter
    private Long id;

}
