package aplicacion;

import estructuras.dinamicas.colas.ColaLD;
import estructuras.estaticas.conjuntos.ConjuntoA;
import estructuras.estaticas.diccionarios.DiccionarioSimpleA;
import modelo.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crea objeto scanner
        Scanner sc = new Scanner(System.in);

        //crea instancia de conjunto y lo inicializa
        ConjuntoA conjunto = new ConjuntoA();
        conjunto.InicializarConjunto();

        //crea instancia de diccionario y lo inicializa
        DiccionarioSimpleA diccionario = new DiccionarioSimpleA();
        diccionario.InicializarDiccionario();

        //crea instancia de cola y lo inicializa
        ColaLD cola = new ColaLD();
        cola.InicializarCola();

        //inicia contadores y banderas
        int numeroReserva = 1;
        int idVuelo = 1;
        int asientosDisponibles = 1;
        int opcion;
        boolean vueloEncontrado = true;
        boolean reservaRealizada = false;

        //precarga vuelos
        conjunto.Agregar(new Vuelo(idVuelo++, "Buenos Aires", "Madrid", 15, 5, 2025, "08:30", 50));
        conjunto.Agregar(new Vuelo(idVuelo++, "Nueva York", "Londres", 20, 6, 2025, "12:00", 30));
        conjunto.Agregar(new Vuelo(idVuelo++, "Tokio", "París", 10, 7, 2025, "23:15", 40));
        conjunto.Agregar(new Vuelo(idVuelo++, "Ciudad de México", "Roma", 5, 8, 2025, "16:45", 25));

        //solicita datos del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese su número de pasaporte: ");
        int pasaporte = sc.nextInt();

        //menu de usuario
        do {
            System.out.println("\n=== Menú de Vuelos ===");
            System.out.println("1. Crear vuelo");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Cancelar asiento");
            System.out.println("4. Mostrar vuelos");
            System.out.println("5. Consultar vuelos disponibles");
            System.out.println("6. Ver estado de reservas y cola de espera");
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

                    System.out.print("Dia: ");
                    int dia = sc.nextInt();

                    System.out.print("Mes: ");
                    int mes = sc.nextInt();

                    System.out.print("Año: ");
                    int anio = sc.nextInt();

                    sc.nextLine(); // consumir enter pendiente

                    System.out.print("Hora (hh:mm): ");
                    String hora = sc.nextLine();

                    //crea objeto vuelo
                    Vuelo vuelo1 = new Vuelo(idVuelo, origen, destino, dia, mes, anio, hora, asientosDisponibles);

                    //agrega el objeto al conjunto
                    conjunto.Agregar(vuelo1);

                    //aumenta el contador +1
                    idVuelo++;

                    System.out.println("\nEl vuelo ha sido agregado exitosamente.");

                    //finaliza la operacion
                    break;

                case 2:

                    //mostramos una lista de los vuelos
                    conjunto.MostrarTodos();

                    //solicita el id del vuelo a reservar
                    System.out.print("Ingrese el ID del vuelo que desea reservar: ");
                    int idSeleccionado = sc.nextInt();

                    sc.nextLine(); // consumir enter pendiente

                    vueloEncontrado = false;

                    for (int i = 0; i < conjunto.getCant(); i++) {
                        Vuelo vuelo = conjunto.getVuelo(i);

                        if (idSeleccionado == vuelo.getIdVuelo()) {
                            vueloEncontrado = true;

                            // Verificar si el usuario ya tiene una reserva
                            if (diccionario.Existe(pasaporte)) {
                                System.out.println("Este número de pasaporte ya tiene una reserva.");
                                reservaRealizada = true; // No se realiza reserva
                                break; // Salimos del bucle y regresamos al menú
                            }

                            if (vuelo.getAsientosDisponibles() > 0) {
                                vuelo.reservarAsiento();

                                Reserva reserva = new Reserva(new Pasajero(nombre, apellido, pasaporte), vuelo);

                                diccionario.Agregar(numeroReserva, reserva);

                                System.out.println("Reserva hecha.");
                                System.out.println("Su numero de reserva es: " + numeroReserva);
                                numeroReserva++;

                                System.out.println("Vuelo de origen " + vuelo.getOrigen() + " a destino " + vuelo.getDestino());
                            } else {
                                System.out.println("No hay asientos disponibles en ese vuelo.");
                                System.out.println("¿Desea unirse a la lista de espera? (s/n): ");
                                String respuesta = sc.nextLine();

                                if (respuesta.equalsIgnoreCase("s")) {
                                    vuelo.getCola().Acolar(numeroReserva);

                                    Reserva reserva = new Reserva(new Pasajero(nombre, apellido, pasaporte), vuelo);
                                    diccionario.Agregar(numeroReserva, reserva);

                                    System.out.println("Agregado a la lista de espera. Su número de reserva es: " + numeroReserva);
                                    numeroReserva++;
                                } else {
                                    System.out.println("No se realizó ninguna acción.");
                                }
                        }
                            //finaliza la operacion
                            break;
                    }
            }
                        if (!vueloEncontrado){
                            System.out.println("El vuelo con el ID ingresado no existe.");
                        }

                        //finaliza la operacion
                        break;

                case 3:

                    System.out.print("Ingrese su numero de reserva: ");
                    int nroDeReserva = sc.nextInt();

                    if (diccionario.Existe(nroDeReserva)) {
                        //verifica si existe la reserva
                        Reserva reservaExistente = diccionario.Recuperar(nroDeReserva);

                        if (reservaExistente != null) {
                            //si existe, obtiene el vuelo y libera un asiento
                            Vuelo vueloCancelado = reservaExistente.getVuelo();
                            vueloCancelado.cancelarReserva();

                            //elimina la reserva del diccionario
                            diccionario.Eliminar(nroDeReserva);

                            System.out.println("Reserva cancelada correctamente.");

                            if (!cola.ColaVacia()) {
                                int numeroReservaEnEspera = cola.Primero();
                                cola.Desacolar();

                                Reserva reservaEnEspera = diccionario.Recuperar(numeroReservaEnEspera);
                                if (reservaEnEspera != null) {
                                    Vuelo vueloEnEspera = reservaEnEspera.getVuelo();
                                    vueloEnEspera.reservarAsiento(); // ocupa asiento
                                    System.out.println("El pasajero en espera con número de reserva " + numeroReservaEnEspera + " fue asignado.");
                                }
                            }

                        } else {
                            System.out.println("No se encontró una reserva con ese número.");
                        }
                    }else {
                            System.out.println("No se encontró una reserva con ese número.");
                        }

                    //finaliza la operacion
                    break;

                        case 4:
                            conjunto.MostrarTodos();
                            break;

                        case 5:
                            conjunto.MostrarVuelosDisponibles();
                            break;

                        case 0:
                            System.out.println("Saliendo.");
                            break;

                        default:
                            System.out.println("Opción inválida.");

                            //finaliza la operacion
                            break;
                    }
            }
            while (opcion != 0) ;

            sc.close();

        }
}





