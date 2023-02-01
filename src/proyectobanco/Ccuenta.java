/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobanco;

/**
 *
 * @author pabmar
 */
public class Ccuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    //    Constructor con parametros
    public Ccuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception{
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
        
//        Se debe impedir tipoDeInteres menor que cero
        if (tipoDeInteres <= 0) {
            throw new Exception("El tipo de interes debe ser mayor que 0");
        }
        
//        Se debe impedir que la cuenta y el nombre estén vacios
        if (nombre.equals("")) {
            throw new Exception("Nombre vacio");
        }
        if (cuenta.equals("")) {
            throw new Exception("Cuenta vacia");
        }
        
//        Se debe impedir que el ingreso sea una cantidad negativa
        if (saldo < 0) {
            throw new Exception("Saldo negativo");
        }
        
    }
    
    
//    Constructor sin parametros
    public Ccuenta() {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
        
}
    
//    Setters y getters para todos los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }
    

    
    
}
