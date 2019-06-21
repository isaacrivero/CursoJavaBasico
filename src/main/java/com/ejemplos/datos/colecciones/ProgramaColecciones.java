package com.ejemplos.datos.colecciones;

import java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {

        Pieza p = new Pieza("teclado gamer","Teclado");
        Ordenador o = new Ordenador();
        o.setMarca("Dell");
        o.setModelo("Latitude");

        Set<Pieza> listado =new HashSet<Pieza>();
        for (int i =0;i<4;i++){
            p= new Pieza("Pieza","placa base" + i);
            listado.add(p);
        }
        o.setPiezas(listado);
        System.out.println(o);
        p= new Pieza("Pieza","placa base" + 1);
        o.getPiezas().add(p);
        System.out.println(o);

        Map<String,String> cliente = new HashMap<String, String>();
        cliente.put("nombre","pepe");
        cliente.put("direccion","micalle");
        cliente.put("tlf","9178667778");
        cliente.put("email","super@gtmail.com");
        System.out.println(cliente);

        List<Map<String,String>> listadoMapa=
                new ArrayList<Map<String, String>>();
        System.out.println(listadoMapa);
    }
}
