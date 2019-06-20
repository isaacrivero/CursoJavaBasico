package com.ejemplos.clases.herencia;

public class AppVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        System.out.println(v);
        Moto m = new Moto();
        System.out.println(m);
        v = new Moto();
        // se puede gestionar un objeto aunque se inicialice con otra
        // si el objeto hereda de la otra
        System.out.println(v);

    }
}
