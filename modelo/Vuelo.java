package modelo;

import estructuras.dinamicas.colas.ColaLD;

public class Vuelo {
    //Atributos
    private int idVuelo;
    private String origen;
    private String destino;
    private int dia;
    private int mes;
    private int anio;
    private String hora;
    private int asientosDisponibles;
    private ColaLD cola;

    //Constructor
    public Vuelo(int idVuelo, String origen, String destino, int dia, int mes, int anio, String hora, int asientosDisponibles) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.mes = mes;
        this.anio  = anio;
        this.hora = hora;
        this.asientosDisponibles = asientosDisponibles;
        cola = new ColaLD();
        cola.InicializarCola();
    }

    //Metodos
    public boolean reservarAsiento() { //baja el contador de asientos disponibles
        if (asientosDisponibles > 0){
            asientosDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    public void cancelarReserva() {
        this.asientosDisponibles++;
    }

    //Getters
    public int getIdVuelo(){
        return idVuelo;
    }

    public String getOrigen(){
        return origen;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAnio(){
        return anio;
    }

    public String getDestino(){
        return destino;
    }

    public String getHora(){
        return hora;
    }

    public int getAsientosDisponibles(){
        return asientosDisponibles;
    }

    public ColaLD getCola() {
        return cola;
    }

    //Setters
    public void setIdVuelo(int idVuelo){
        this.idVuelo = idVuelo;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public void setAsientosDisponibles(int asientosDisponibles){
        this.asientosDisponibles = asientosDisponibles;
    }

    /*
    @Override
    public String toString(){
        return "Vuelo " + idVuelo +
                " | origen:" + origen +
                " | destino:" + destino +
                " | fecha:" + dia + "/" + mes + "/" + anio +
                " | hora:" + hora +
                " | asientos disponibles:" + asientosDisponibles;
    }
     */

    @Override
    public String toString() {

        String mensajeExtra = "";
        if (asientosDisponibles == 0) {
            mensajeExtra = " (añadirse a la cola de espera)";
        }

        String texto = String.format(
                "Vuelo %3d | origen: %-20s | destino: %-20s | fecha: %02d/%02d/%4d | hora: %5s | asientos disponibles: %2d%s",
                idVuelo, origen, destino, dia, mes, anio, hora, asientosDisponibles, mensajeExtra
        );

        return texto;
    }

}



