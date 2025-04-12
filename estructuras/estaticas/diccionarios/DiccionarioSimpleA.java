package estructuras.estaticas.diccionarios;

import estructuras.estaticas.conjuntos.ConjuntoA;
import estructuras.estaticas.conjuntos.ConjuntoTDA;
import modelo.Pasajero;

public class DiccionarioSimpleA implements DiccionarioSimpleTDA {

    private Elemento[] elementos;
    private int cant;

    public void InicializarDiccionario() {
        elementos = new Elemento[100];
        cant = 0;
    }

    public void Agregar(int numeroReserva, Pasajero pasajero) {
        int pos = Clave2Ind(numeroReserva);
        if (pos == -1) {
            pos = cant;
            elementos[pos] = new Elemento();
            elementos[pos].clave = numeroReserva;
            cant++;
        }
        elementos[pos].pasajero = pasajero;
    }

    private int Clave2Ind (int clave) {
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

    public Pasajero Recuperar(int clave) {
        int pos = Clave2Ind(clave);
        return elementos[pos].pasajero;
    }

    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new ConjuntoA();
        c.InicializarConjunto();
        for (int i = 0; i < cant; i++)
            c.Agregar(elementos[i].vuelo);
        return c;
    }
}

