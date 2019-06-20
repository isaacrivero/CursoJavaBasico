package com.ejemplos.datos.complejos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Concesionario implements Serializable {
    private String nombre;
    private String direccion;
    private String tlf;
    private Coche cocheGerente;
    private Set<Coche> stockCoches;

    public Concesionario() {
        this.nombre = "";
        this.direccion = "";
        this.tlf = "";
        this.cocheGerente = new Coche();
        this.stockCoches = new HashSet<Coche>();
    }

    public Concesionario(String nombre, String direccion, String tlf) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tlf = tlf;
        this.cocheGerente = new Coche();
        this.stockCoches = new HashSet<Coche>();
    }
    public Concesionario(String nombre, String direccion, String tlf, Coche coche) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tlf = tlf;
        this.cocheGerente = coche;
        this.stockCoches = new HashSet<Coche>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Coche getCocheGerente() {
        return cocheGerente;
    }

    public void setCocheGerente(Coche cocheGerente) {
        this.cocheGerente = cocheGerente;
    }

    public Set<Coche> getStockCoches() {
        return stockCoches;
    }

    public void setStockCoches(Set<Coche> stockCoches) {
        this.stockCoches = stockCoches;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tlf='" + tlf + '\'' +
                ", cocheGerente=" + cocheGerente +
                ", stockCoches=" + stockCoches +
                '}';
    }
}
