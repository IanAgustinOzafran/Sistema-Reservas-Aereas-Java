package estructuras.estaticas.diccionarios;

import estructuras.estaticas.conjuntos.ConjuntoTDA;
import modelo.Pasajero;
import estructuras.estaticas.conjuntos.ConjuntoA;
import modelo.Reserva;
import modelo.Vuelo;

public class DiccionarioSimpleA implements DiccionarioSimpleTDA {

    private Elemento[] elementos;
    private int cant;

    public void InicializarDiccionario() {
        elementos = new Elemento[100];
        cant = 0;
    }

    public void Agregar(int numeroReserva, Reserva reserva) {
        int pos = Clave2Ind(numeroReserva);
        if (pos == -1) {
            pos = cant;
            elementos[pos] = new Elemento();
            elementos[pos].clave = numeroReserva;
            cant++;
        }
        elementos[pos].reserva = reserva;
    }

    private int Clave2Ind(int clave) {
        int i = cant - 1;
        while (i >= 0 && elementos[i].clave != clave)
            i--;
        return i;
    }

    public void Eliminar(int clave) {
        int pos = Clave2Ind(clave);

        if (pos != -1) {
            elementos[pos] = elementos[cant - 1];
            cant--;
        }
    }

    public Reserva Recuperar(int clave) {
        int pos = Clave2Ind(clave);
        return elementos[pos].reserva;
    }

    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new ConjuntoA();
        c.InicializarConjunto();
        for (int i = 0; i < cant; i++)
            c.Agregar(elementos[i].vuelo);
        return c;
    }

    public void MostrarDiccionario() {
        if (cant == 0) {
            System.out.println("No hay reservas registradas.");
        } else {
            System.out.println("=== Reservas registradas ===");
            for (int i = 0; i < cant; i++) {
                Elemento elem = elementos[i];
                Reserva reserva = elem.reserva;
                Pasajero pasajero = reserva.getPasajero();
                Vuelo vuelo = reserva.getVuelo();

                System.out.println("Número de reserva: " + elem.clave);
                System.out.println("Pasajero: " + pasajero.getNombre() + " " + pasajero.getApellido());
                System.out.println("Pasaporte: " + pasajero.getPasaporte());
                System.out.println("Vuelo: " + vuelo.getOrigen() + " -> " + vuelo.getDestino() +
                        " | Fecha: " + vuelo.getDia() + "/" + vuelo.getMes() + "/" + vuelo.getAnio() +
                        " | Hora: " + vuelo.getHora());
                System.out.println("--------------------------------------");
            }
        }
    }
}