package modelo;

public class Vuelo {

    //Atributos
    String origen;
    String destino;
    String fecha;
    String hora;
    // cantidad de asientos
    // asientosDisponibles

    //Constructor
    public Vuelo(String origen, String destino, String fecha, String hora) {
        super();
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
    }

    //Getters

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    //Setters

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }

}

