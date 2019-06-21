package com.ejemplos.datos.complejos.observadores;

public class AppBiblioteca {
    public static void main(String[] args) {
        Autor a= new Autor();
        a.setNombre("Terry Prattchet");

        Libro l = new Libro();
        l.setTitulo("El color de la magia");
        l.setAutor(a);
        a.getLibrosEscritos().add(l);
        l=new Libro();
        l.setTitulo("Guardias!!! Guardias???");
        l.setAutor(a);
        a.getLibrosEscritos().add(l);
        System.out.println(a.toString());
    }
}
