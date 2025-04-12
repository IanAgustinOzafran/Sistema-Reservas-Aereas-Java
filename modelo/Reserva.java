package modelo;

    public class Reserva {

        //Atributos

        private int numeroReserva;
        private String pasaporte;
        private String origen;
        private String destino;
        private String fecha;
        private String hora;

        //Constructor

        public Reserva(int numeroReserva, String pasaporte, String origen, String destino, String fecha, String hora){
            this.numeroReserva = numeroReserva;
            this.pasaporte = pasaporte;
            this.origen = origen;
            this.destino = destino;
            this.fecha = fecha;
            this.hora = hora;
        }

        //Getters

        public int getNumeroReserva() {
            return numeroReserva;
        }

        public String getPasaporte() {
            return pasaporte;
        }

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

        public int setNumeroreserva(int numeroreserva) {
            return this.numeroReserva = numeroreserva;
        }

        public void setPasaporte(String pasaporte) {
            this.pasaporte = pasaporte;
        }

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
}

