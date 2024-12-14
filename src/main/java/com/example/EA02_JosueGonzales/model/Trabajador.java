package com.example.EA02_JosueGonzales.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "trabajadores") // Define la tabla "trabajadores" en la base de datos

public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Variables
    private Integer id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroDocumento;
    private LocalDate fechaNacimiento;
    private String direccion;
    private Integer mesesTrabajados;
    private String tipoSeguro;
    private Double sueldo;

    //Getter y Setter:
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getMesesTrabajados() {
        return mesesTrabajados;
    }

    public void setMesesTrabajados(Integer mesesTrabajados) {
        this.mesesTrabajados = mesesTrabajados;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

   
}
