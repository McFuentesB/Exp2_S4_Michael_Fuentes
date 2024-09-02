package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id")
    private long id;
    @Column (name ="nombre")
    private String nombre;
    @Column (name ="agno")
    private int agno;
    @Column (name ="director")
    private String director;
    @Column (name ="genero")
    private String genero;
    @Column (name ="sinopsis")
    private String sinopsis;

    public long getId() {
        return id;
}

public String getNombre() {
    return nombre;
}


public int getAgno() {
    return agno;
}

public String getDirector() {
return director;
}

public String getGenero() {
return genero;
}

public String getSinopsis() {
return sinopsis;
}
}
