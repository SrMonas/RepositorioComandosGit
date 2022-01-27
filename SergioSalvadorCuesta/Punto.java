/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.poo.puntos;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author macarena
 */
public class Punto {

    private double x;
    private double y;

    public Punto(){
        this.x=this.y=0;
    }
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public void desplazar(double dX, double dY) {
        this.x = this.x + dX;
        this.y = this.y + dY;
    }

    public void mover(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }
    
    public void mover(Punto otro){
        this.x=otro.getX();
        this.y=otro.getY();
    }
        
    public void alCentro(){
        Dimension tamanio=Toolkit.getDefaultToolkit().getScreenSize();        
        double xCentro=tamanio.width/2;
        double yCentro=tamanio.height/2;
        this.x=xCentro;
        this.y=yCentro;        
    }
    
    public double distancia(Punto otro){
        double a=otro.x - this.x;
        double b=otro.y - this.y;        
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));     
    }
    
    public static double distancia (Punto p1, Punto p2){
        double a=p2.x - p1.x;
        double b=p2.y - p1.y;        
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));  
    }

}
