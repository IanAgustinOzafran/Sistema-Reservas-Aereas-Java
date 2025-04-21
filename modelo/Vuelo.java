package modelo;

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
    }

    //Metodos

    public boolean reservarAsiento() { //baja el contador de asientos disponibles
        if (asientosDisponibles > 0) {
            asientosDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    public void cancelarAsiento(){

    }

    //Getters

    public int getIdVuelo(){
        return idVuelo;
    }

    public String getOrigen() {
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

    public String getDestino() {
        return destino;
    }

    public String getHora() {
        return hora;
    }

    public int getAsientosDisponibles(){
        return asientosDisponibles;
    }

    //Setters

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Vuelo " + idVuelo +
                " | origen:" + origen +
                " | destino:" + destino +
                " | hora:" + hora +
                " | asientos disponibles:" + asientosDisponibles;
    }

}

