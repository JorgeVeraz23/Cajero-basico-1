/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String args[]){
        Cuenta cuenta1 = new Cuenta("Jorge Vera", 1000);
        System.out.println(cuenta1.toString());
        
        cuenta1.ingresar(500);
        System.out.println(cuenta1.toString());
        
        cuenta1.retirar(600);
        System.out.println(cuenta1.toString());
        
        
        
    }
}
