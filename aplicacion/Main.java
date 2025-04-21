package aplicacion;

import estructuras.estaticas.conjuntos.ConjuntoA;
import estructuras.estaticas.diccionarios.DiccionarioSimpleA;
import modelo.Pasajero;
import modelo.Reserva;
import modelo.Vuelo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ConjuntoA conjunto = new ConjuntoA();
        conjunto.InicializarConjunto();

        DiccionarioSimpleA diccionario = new DiccionarioSimpleA();
        diccionario.InicializarDiccionario();
        int numeroReserva = 1;

        int idVuelo = 1;

        int asientosDisponibles = 300;

        int opcion;

        boolean vueloEncontrado = false;
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese su número de pasaporte: ");
        String pasaporte = sc.nextLine();

        do {
            System.out.println("\n=== Menú de Vuelos ===");
            System.out.println("1. Crear vuelo");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Cancelar asiento");
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

                    System.out.print("Dia:");
                    int dia = sc.nextInt();

                    System.out.print("Mes:");
                    int mes = sc.nextInt();

                    System.out.print("Año:");
                    int anio = sc.nextInt();

                    sc.nextLine(); // consumir enter pendiente

                    System.out.print("Hora (hh:mm): ");
                    String hora = sc.nextLine();

                    Vuelo vuelo1 = new Vuelo(idVuelo, origen, destino, dia, mes, anio, hora, asientosDisponibles);

                    conjunto.Agregar(vuelo1);

                    idVuelo++;

                    System.out.println("");

                    System.out.println("El vuelo ha sido agregado exitosamente.");
                    break;

                case 2:

                    conjunto.MostrarVuelosDisponibles(); //Listamos los vuelos disponibles

                    System.out.print("Ingrese el ID del vuelo que desea reservar: "); //Preguntamos al usuario por el id del vuelo a reservar
                    int idSeleccionado = sc.nextInt();

                    for (int i = 0; i < conjunto.getCant(); i++) { //Recorremos el conjunto
                        Vuelo vuelo = conjunto.getVuelo(i);

                        if (idSeleccionado == vuelo.getIdVuelo()) { //Preguntamos si los id son iguales
                            vueloEncontrado = true;
                            if (vuelo.getAsientosDisponibles() > 0) { //verificamos que haya disponibilidad

                                vuelo.reservarAsiento(); //baja el contador de asientos disponibles

                                Reserva reserva = new Reserva(new Pasajero(nombre, apellido, pasaporte), vuelo); //creamos una reserva, los datos del pasajero y el vuelo

                                diccionario.Agregar(numeroReserva, reserva);

                                System.out.println("Reserva hecha.");

                                System.out.println("Numero de reserva: " + numeroReserva);

                                numeroReserva++;

                                System.out.println("Vuelo de origen: " + vuelo.getOrigen() + '\n' + "destino: " + vuelo.getDestino());

                                break;
                            }
                        }

                        if (!vueloEncontrado) {
                            System.out.println("El vuelo con el ID ingresado no existe.");
                        }
                    }

                        break;

                        case 3:

                            System.out.println("Funcionalidad no implementada");

                            break;

                        case 4:
                            conjunto.MostrarTodos();
                            break;

                        case 0:
                            System.out.println("Saliendo.");
                            break;

                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
            }
            while (opcion != 0) ;

            sc.close();

        }
}



