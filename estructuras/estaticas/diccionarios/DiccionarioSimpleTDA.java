package estructuras.estaticas.diccionarios;

import estructuras.estaticas.conjuntos.ConjuntoTDA;
import modelo.Pasajero;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionario(); //pre: no aplica
    void Agregar(int numeroReserva, Pasajero pasajero); //pre: diccionario inicializado
    void Eliminar(int numeroReserva); //pre: diccionario inicializado
    Pasajero Recuperar(int numeroReserva); //pre: diccionario inicializado y clave existente
    ConjuntoTDA Claves(); //pre: diccionario inicializado
}

