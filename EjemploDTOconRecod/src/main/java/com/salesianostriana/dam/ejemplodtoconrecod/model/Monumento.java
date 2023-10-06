package com.salesianostriana.dam.ejemplodtoconrecod.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monumento {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre, codigoPais, ciudad, descripcion, localidad;
    private String[] imagenes;

    @ManyToOne
    private Categoria categoria;
}
