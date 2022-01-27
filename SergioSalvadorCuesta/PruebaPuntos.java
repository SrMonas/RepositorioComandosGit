/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.poo.puntos;

import com.gf.poo.personas.Persona;

/**
 *
 * @author macarena
 */
public class PruebaPuntos {

    public static void main(String[] args) {

        Punto p1 = new Punto();
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1.toString());

        Punto p2 = new Punto(-5, 50);
        System.out.println(p2.toString());

        System.out.println("Movemos el punto P1...");
        System.out.println("\tOriginalmente: " + p1.toString());
        p1.mover(-8, -3.5);
        System.out.println("\tDespués del movimiento: " + p1.toString());

        System.out.println("Movemos el punto P2...");
        System.out.println("\tOriginalmente: " + p2.toString());
        p2.mover(p1);
        System.out.println("\tDespués del movimiento: " + p2.toString());
        
        System.out.println("Desplazamos el punto P1...");
        System.out.println("\tOriginalmente: " + p1.toString());
        p1.desplazar(-1, 1);
        System.out.println("\tDespués del desplazamiento: " + p1.toString());
        
        System.out.println("Calculamos la distancia entre los puntos...");
        System.out.println("\t" + p1.toString());
        System.out.println("\t" + p2.toString());
        double distancia=p1.distancia(p2);
        System.out.println("\tDistancia metodo dinámico: " + distancia);        
        System.out.println("\tDistancia método estático: " + Punto.distancia(p1, p2));
        
        System.out.println("Movemos los puntos al centro de la pantalla...");
        p1.alCentro();
        p2.alCentro();
        System.out.println("\t" + p1.toString());
        System.out.println("\t" + p2.toString());       
       
    }

}
