package estructuras.dinamicas.colas;

public interface ColaTDA {

    void InicializarCola(); //pre: no aplica
    void Acolar(int x); //pre: cola inicializada
    void Desacolar(); //pre: cola inicializada y no vacia
    boolean ColaVacia(); //cola inicializada
    int Primero(); //pre: cola inicializada y no vacia

}
