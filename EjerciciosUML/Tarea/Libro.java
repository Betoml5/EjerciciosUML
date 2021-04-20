
public class Libro {
    String nombre;
    Autor autor;
    double precio;
    int cantidad;

    public Libro(String nombre, Autor autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public Libro(String nombre, Autor autor, double precio, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\nNombre del libro: " + this.nombre + this.autor.toString() + "\nPrecio del libro : $" + this.precio
                + "\nCantidad de libros: " + this.cantidad;
    }
}
