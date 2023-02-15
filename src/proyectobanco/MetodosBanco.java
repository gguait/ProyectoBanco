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

    ArrayList<Cuenta> cuentas = new ArrayList();
    private int total = 0;

    public MetodosBanco() {
        cuentas = new ArrayList();

    }

    Scanner teclado = new Scanner(System.in);
//    En una primera versión para almacenar en memoria los clientes
//    construiremos un array de Cuenta

//    (En una segunda versión para almacenar en memoria los clientes
//    construiremos una lista de Cuenta)
    public Cuenta buscarCuenta() {
        System.out.println("1. Buscar por nombre\n2. Buscar por numero");
        int eleccion = teclado.nextInt();

        switch (eleccion) {
            case 1:
                teclado.nextLine();
                System.out.println("Introduce el nombre de la cuenta: ");
                String nombreCuenta = teclado.nextLine();
                poscuentanombre(nombreCuenta);
                break;
            case 2:
                teclado.nextLine();
                System.out.println("Introduce el numero de cuenta");
                String numcta = teclado.nextLine();
                poscuenta(numcta);
                break;
            default:
                break;
        }
        return null;
    }

    public Cuenta poscuentanombre(String nombre) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNombre().equals(nombre)) {
                return cuentas.get(i);
            }
        }
        return null;
    }

    public Cuenta poscuenta(String numcta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(numcta)) {
                return cuentas.get(i);
            }
        }
        return null;
    }

    public void NuevaCuenta() {
        boolean repetida = false, control = true;
        Cuenta nueva = new Cuenta();

        do {
            try {
                String nombreCuenta = "";
                control = true;
                do {
                    System.out.println("Introduce el nombre de la cuenta");
                    nombreCuenta = teclado.nextLine();
                    nueva.setNombre(nombreCuenta);
                } while (nombreCuenta == null);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                control = false;
            }
        } while (!control);

        do {
            do {
                try {
                    String numeroCuenta = "";
                    control = true;
                    do {
                        System.out.println("Introduce el numero de cuenta");
                        numeroCuenta = teclado.nextLine();
                        nueva.setCuenta(numeroCuenta);
                    } while (numeroCuenta == null);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    control = false;
                }
            } while (!control);
            for (int i = 0; i < cuentas.size(); i++) {
                if (cuentas.get(i).getCuenta().equals(nueva.getCuenta())) {
                    System.out.println("Cuenta repetida");
                    repetida = true;
                    i = cuentas.size();
                } else {
                    repetida = false;
                }
            }
        } while (repetida);
        do {
            try {
                double saldo = 0;
                control = true;
                do {
                    System.out.println("Introduce el saldo");
                    saldo = teclado.nextDouble();
                    nueva.setSaldo(saldo);
                } while (saldo == 0);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                control = false;
            }
        } while (!control);

        do {
            try {
                double interes = 0;
                control = true;
                do {
                    System.out.println("Introduce el tipo de interes");
                    interes = teclado.nextDouble();
                    nueva.setTipoDeInteres(interes);
                } while (interes == 0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                control = false;
            }
        } while (!control);

        cuentas.add(nueva);

        System.out.println("Cuenta añadida");

        total = total + 1;
    }

    public void ModificarCuenta() {

        int posicion = cuentas.indexOf(buscarCuenta());

//        Cambiar nombre
        System.out.println("Introduce el nuevo Nombre (0 si quiere mantener el nombre actual)");
        try {
            String nuevoNombre = teclado.nextLine();
            if (nuevoNombre == null) {
                cuentas.get(posicion).setNombre(cuentas.get(posicion).getNombre());
            } else {
                cuentas.get(posicion).setNombre(nuevoNombre);
            }
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

//        Cambiar numero
        System.out.println("Introduce el nuevo Numero de cuenta: ");
        try {
            String nuevoNumero = teclado.nextLine();
            if (nuevoNumero == null) {
                cuentas.get(posicion).setCuenta(cuentas.get(posicion).getCuenta());
            } else {
                cuentas.get(posicion).setCuenta(nuevoNumero);
            }
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

//        Cambiar Saldo
        System.out.println("Introduce el nuevo Saldo: ");
        try {
            Double nuevoSaldo = teclado.nextDouble();
            if (nuevoSaldo == null) {
                cuentas.get(posicion).setSaldo(cuentas.get(posicion).getSaldo());
            } else {
                cuentas.get(posicion).setSaldo(nuevoSaldo);
            }
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

//        Cambiar Interes
        System.out.println("Introduce el nuevo Interes: ");
        try {
            Double nuevoInteres = teclado.nextDouble();
            if (nuevoInteres == null) {
                cuentas.get(posicion).setTipoDeInteres(cuentas.get(posicion).getTipoDeInteres());
            } else {
                cuentas.get(posicion).setTipoDeInteres(nuevoInteres);
            }
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

    }

}
