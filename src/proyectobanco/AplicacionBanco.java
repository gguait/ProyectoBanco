package proyectobanco;

import java.util.Scanner;

public class AplicacionBanco {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        int eleccion = -1;

        MetodosBanco ejemplo = new MetodosBanco();
        
        do {
            System.out.println("======= BANCO UNIVERSAL ========\n"
                + "1. Alta de cuentas\n"
                + "2. Consulta de una cuenta\n"
                + "3. Modificar cuentas\n"
                + "4. Anular cuentas\n"
                + "5. Listado de cuentas\n"
                + "0. Salir\n"
                + "Selecciona una opción:");
            eleccion = teclado.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Alta de cuentas");
                    ejemplo.NuevaCuenta();
                    break;
                case 2:
                    System.out.println("Consultar cuenta");
                    ejemplo.ConsultarCuenta();
                    break;
                case 3:
                    System.out.println("Modificar cuentas");
                    ejemplo.ModificarCuenta();
                    break;
                case 4:
                    System.out.println("Anular cuentas");
                    ejemplo.AnularCuenta();
                    break;
                case 5:
                    System.out.println("Listar cuentas");
                    ejemplo.MostrarCuentas();
                    break;
                case 0:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    
                    break;                    
            }
        } while (eleccion != 0);
    }

}
