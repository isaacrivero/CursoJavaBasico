package com.ejemplos.clases.herencia;

/**
 * Created by pepesan on 28/04/2016.
 */
public class ProgramaAnimal {
    public static void main(String[] args) {
        Gato misifu=new Gato();
        misifu.raza="siamés";
        Perro fluky=new Perro();
        fluky.raza="Pastor Alemán";
        fluky.ladrar();
        fluky.ruido();
        fluky.setLealtad(15);
        System.out.println(fluky.getLealtad());
        Perro toby=new Perro("negro","Collie"
                ,35.0f,0.60f,"Toby",16);
    }
}
