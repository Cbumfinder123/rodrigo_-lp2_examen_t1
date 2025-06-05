package model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    private int idEspecialidad;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    
    public Especialidad() {}

 
    public Especialidad(String titulo) {
        this.titulo = titulo;
    }

    // Getters y Setters
    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Especialidad [idEspecialidad=" + idEspecialidad + ", titulo=" + titulo + "]";
    }
}
