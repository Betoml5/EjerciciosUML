public class ConciertoMusica {
    String dia;
    int hora;
    ConciertoLugar conciertolugar;
    String nombreConcierto;

    public ConciertoMusica(String dia, int hora, ConciertoLugar conciertoLugar, String nombreConcierto) {
        this.dia = dia;
        this.hora = hora;
        this.conciertolugar = conciertoLugar;
        this.nombreConcierto = nombreConcierto;
    }

    public String getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public ConciertoLugar getConciertolugar() {
        return conciertolugar;
    }

    public String getNombreConcierto() {
        return nombreConcierto;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setConciertolugar(ConciertoLugar conciertolugar) {
        this.conciertolugar = conciertolugar;
    }

    public void setNombreConcierto(String nombreConcierto) {
        this.nombreConcierto = nombreConcierto;
    }

    @Override
    public String toString() {

        return "\nNombre del concierto: " + this.nombreConcierto + "\nDia del concierto: " + this.dia
                + "\nHora del concierto: " + this.hora;
    }

}
