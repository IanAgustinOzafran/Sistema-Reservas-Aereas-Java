package aplicacion;

import estructuras.estaticas.conjuntos.ConjuntoA;
import modelo.Vuelo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConjuntoA conjunto = new ConjuntoA();
        conjunto.InicializarConjunto();

        int opcion;


        do {
            System.out.println("\n=== Menú de Vuelos ===");
            System.out.println("1. Crear vuelo");
            System.out.println("2. Reservar asiento (no implementado aún)");
            System.out.println("3. Cancelar asiento (no implementado aún)");
            System.out.println("4. Mostrar vuelos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // consumir enter pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = sc.nextLine();
                    System.out.print("Hora (hh:mm): ");
                    String hora = sc.nextLine();

                    Vuelo vuelo1 = new Vuelo(origen, destino, fecha, hora);
                    conjunto.Agregar(vuelo1);
                    System.out.println("El vuelo ha sido agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("Funcionalidad no implementada");
                    break;

                case 3:
                    System.out.println("Funcionalidad no implementada");
                    break;

                case 4:
                    conjunto.MostrarVuelos();
                    break;

                case 0:
                    System.out.println("Saliendo.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);

        sc.close();


    }

}

