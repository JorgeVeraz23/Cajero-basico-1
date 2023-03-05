/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cuenta {
    private String titutar;
    private double cantidad;
    
    Scanner sc = new Scanner(System.in);

    public Cuenta(String titutar) {
        this.titutar = titutar;
    }

    public Cuenta(String titutar, double cantidad) {
        this.titutar = titutar;
        this.cantidad = cantidad;
    }

    public String getTitutar() {
        return titutar;
    }

    public void setTitutar(String titutar) {
        this.titutar = titutar;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titutar=" + titutar + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(double cantidad){
        
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    
    public void retirar(double cantidad){   
            if(cantidad > 0){
                double nuevaCantidad = this.cantidad - cantidad;
                if(nuevaCantidad < 0){
                    this.cantidad = 0;
                }else{
                    this.cantidad = nuevaCantidad;
                }
    } 
}
    
    
}
