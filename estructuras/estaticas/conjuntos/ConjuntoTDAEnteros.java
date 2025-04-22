package estructuras.estaticas.conjuntos;

public interface ConjuntoTDAEnteros {
    void InicializarConjunto();
    void Agregar(int x);
    int Elegir();
    boolean ConjuntoVacio();
    void Sacar(int x);
    boolean Pertenece(int x);
}

