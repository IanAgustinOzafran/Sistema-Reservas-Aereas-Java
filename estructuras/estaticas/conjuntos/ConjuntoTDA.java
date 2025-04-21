package estructuras.estaticas.conjuntos;

import modelo.Vuelo;

public interface ConjuntoTDA {
    void InicializarConjunto(); //pre: no aplica.
    void Agregar(Vuelo vuelo); //pre: conjunto inicializado
    Vuelo Elegir(); //pre: conjunto inicializado y no vacio
    boolean ConjuntoVacio(); //pre: conjunto inicializado
    void Sacar(Vuelo vuelo); //pre: conjunto inicializado
    boolean Pertenece(Vuelo vuelo); //pre: conjunto inicializado
}


