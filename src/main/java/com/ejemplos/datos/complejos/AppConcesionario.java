package com.ejemplos.datos.complejos;


import java.util.Set;

public class AppConcesionario {
    public static void main(String[] args) {
        Concesionario c = new Concesionario();
        c.setNombre("Comauto Sur");
        c.setDireccion("Leganes");
        c.setTlf("91COMPRACOCHE");
        Coche coche = new Coche();
        coche.setMarca("Toyota");
        coche.setModelo("Auris");
        c.setCocheGerente(coche);
        System.out.println(c);
        Coche c1= new Coche("Mercedes", "Clase E");
        Coche c2 = new Coche("BMW", "Serie 3");
        Set<Coche> listadoCoches= c.getStockCoches();
        listadoCoches.add(c1);
        listadoCoches.add(c2);
        System.out.println(c);
    }
}
