package modelo;

public class Reserva {

    //Atributos

    private Pasajero pasajero;
    private Vuelo vuelo;

    public Reserva(Pasajero pasajero, Vuelo vuelo) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    //metodos

    public void hacerReserva(int numeroReserva, Pasajero pasajero){


    }

    //Getters

    public Pasajero getPasajero(){
        return pasajero;
    }

    public Vuelo getVuelo(){
        return vuelo;
    }

    //Setters . . .



}


