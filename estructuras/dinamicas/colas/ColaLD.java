package estructuras.dinamicas.colas;

public class ColaLD implements ColaTDA {

    class Nodo {
        int info; //el valor almacenado
        Nodo sig; //la referencia al siguiente nodo
    }

    Nodo primero; //primer elemento (mas antiguo)
    Nodo ultimo; //ultimo elemento (mas reciente)

    public void InicializarCola(){
        primero = null;
        ultimo = null;
    }

    public void Acolar(int x){
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = null;
        if (ultimo != null) //cola no vacia
            ultimo.sig = nuevo;
        ultimo = nuevo;
        if (primero == null) //la cola estaba vacia
            primero = ultimo;
    }

    public void Desacolar(){
        primero = primero.sig; //nueva referencia a la estructura
        if (primero == null) //la cola quedo vacia
            ultimo = null;
    }

    public boolean ColaVacia(){
        return (ultimo == null);
    }

    public int Primero() {
        return primero.info;
    }
}

