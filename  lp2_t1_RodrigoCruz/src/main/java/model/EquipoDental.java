package model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "tbl_equipo_dental")
public class EquipoDental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    private int nroEquipo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "fecha_adquisicion", nullable = false, insertable = false, updatable = false)
    private LocalDateTime fechaAdquisicion;

    @Column(name = "estado", nullable = false)
    private char estado;

    @ManyToOne
    @JoinColumn(name = "id_dentista", nullable = true)
    private Dentista dentista;


    public EquipoDental() {}

    public EquipoDental(String nombre, double costo, char estado, Dentista dentista) {
        this.nombre = nombre;
        this.costo = costo;
        this.estado = estado;
        this.dentista = dentista;
    }

    // Getters y Setters
    public int getNroEquipo() {
        return nroEquipo;
    }

    public void setNroEquipo(int nroEquipo) {
        this.nroEquipo = nroEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDateTime getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    @Override
    public String toString() {
        return "EquipoDental [nroEquipo=" + nroEquipo + ", nombre=" + nombre + ", costo=" + costo +
               ", estado=" + estado + ", dentista=" + (dentista != null ? dentista.getNombreCompleto() : "Sin asignar") + "]";
    }
}
