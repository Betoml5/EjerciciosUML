public class ConciertoLugar {
    int capacidad;
    String nombreLugar;

    public ConciertoLugar(int capacidad, String nombreLugar) {
        this.capacidad = capacidad;
        this.nombreLugar = nombreLugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    @Override
    public String toString() {
        return "\nNombre del lugar: " + this.nombreLugar + "\nCapacidad del lugar: " + this.capacidad;
    }
}
