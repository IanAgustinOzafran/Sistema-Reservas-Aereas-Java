package estructuras.estaticas.conjuntos;

import modelo.Vuelo;

public class ConjuntoA implements ConjuntoTDA {

    private Vuelo[] a;
    private int cant;

    public void InicializarConjunto(){
        a = new Vuelo[100];
        cant = 0;
    }

    public void Agregar(Vuelo vuelo){
        if (!Pertenece(vuelo)){
            a[cant] = vuelo;
            cant++;
        }
    }

    public boolean ConjuntoVacio(){
        return (cant == 0);
    }

    public Vuelo Elegir(){
        return a[cant - 1];
    }

    public boolean Pertenece(Vuelo vuelo){
        int i = 0;
        while (i < cant && a[i] != vuelo)
            i++;
        return (i < cant);
    }

    public void Sacar(Vuelo vuelo){
        int i = 0;
        while (i < cant && a[i] != vuelo)
            i++;
        if (i < cant){
            a[i] = a[cant - 1];
            cant--;
        }
    }

    public void MostrarVuelos() {
        if (cant == 0) {
            System.out.println("No hay vuelos disponibles.");
        } else {
            System.out.println("=== Vuelos Disponibles ===");
            for (int i = 0; i < cant; i++) {
                System.out.println(a[i]);
            }
        }
    }
}

