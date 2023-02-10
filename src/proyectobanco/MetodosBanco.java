/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobanco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pabmar
 */
public class MetodosBanco {
    ArrayList <Cuenta> cuentas= new ArrayList();
    private int total = 0;
    public MetodosBanco(){
        cuentas = new ArrayList();
        
    }
    
    Scanner teclado = new Scanner(System.in);
//    En una primera versión para almacenar en memoria los clientes
//    construiremos un array de Cuenta
    
//    (En una segunda versión para almacenar en memoria los clientes
//    construiremos una lista de Cuenta)
    
    
    
    public Cuenta buscarCuenta(){
        System.out.println("1. Buscar por nombre\n2. Buscar por numero");
        int eleccion = teclado.nextInt();
        
        switch(eleccion){
            case 1:
                System.out.println("Introduce el nombre de la cuenta: ");
                String nombreCuenta = teclado.nextLine();
                poscuentanombre(nombreCuenta);
                
            case 2:
                System.out.println("Introduce el numero de cuenta");
                String numcta = teclado.nextLine();
                poscuenta(numcta);
        }
        return null;
    }
    
    public Cuenta poscuentanombre(String nombre){
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNombre().equals(nombre)) {
                return cuentas.get(i);
            }
        }
        return null;
    }
    
    public Cuenta poscuenta(String numcta){
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(numcta)) {
                return cuentas.get(i);
            }
        }
        return null;
    }
    
    
    
    public void NuevaCuenta(){
        boolean repetida = false, control = true;
        Cuenta nueva = new Cuenta();
        
        do {
            try{
                control = true;
                System.out.println("Introduce el nombre: ");
                nueva.setNombre(teclado.nextLine());
            } catch(Exception e){
                System.out.println(e.getMessage());
                control = false;
            }
        } while (!control);
        
        do {
            do {
                try{
                    control = true;
                    System.out.println("Introduce el numero de cuenta");
                    nueva.setCuenta(teclado.nextLine());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                    control = false;
                }
            } while (!control);
            for (int i = 0; i < cuentas.size(); i++) {
                if (cuentas.get(i).getCuenta().equals(nueva.getCuenta())) {
                    System.out.println("Cuenta repetida");
                    repetida = true;
                    i=cuentas.size();
                } else{
                    repetida = false;
                }
            }
        } while (repetida);
        do {
            try{
                control = true;
                System.out.println("Introduce el saldo");
                nueva.setSaldo(teclado.nextDouble());
            } catch (Exception e){
                System.out.println(e.getMessage());
                control = false;
            }
        } while (!control);
        
        do{
            try{
                control = true;
                System.out.println("Introduce el tipo de interes");
                nueva.setTipoDeInteres(teclado.nextDouble());
            } catch(Exception e){
                System.out.println(e.getMessage());
                control = false;
            }
        } while(!control);
        
        cuentas.add(nueva);
        
        System.out.println("Cuenta añadida");
        
        total = total + 1;
    }
    
    
}
