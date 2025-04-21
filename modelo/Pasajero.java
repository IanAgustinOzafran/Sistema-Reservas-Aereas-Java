package modelo;

public class Pasajero {

    //Atributos

    private String nombre;
    private String apellido;
    private String pasaporte;

    //Constructor

    public Pasajero(String nombre, String apellido, String pasaporte) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

}




