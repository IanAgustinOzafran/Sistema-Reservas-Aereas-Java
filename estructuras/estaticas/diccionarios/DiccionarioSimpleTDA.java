package estructuras.estaticas.diccionarios;

import estructuras.estaticas.conjuntos.ConjuntoTDA;
import modelo.Reserva;

public interface DiccionarioSimpleTDA {
    void InicializarDiccionario(); //pre: no aplica
    void Agregar(int numeroReserva, Reserva reserva); //pre: diccionario inicializado
    void Eliminar(int numeroReserva); //pre: diccionario inicializado
    Reserva Recuperar(int numeroReserva); //pre: diccionario inicializado y clave existente
    ConjuntoTDA Claves(); //pre: diccionario inicializado
}




