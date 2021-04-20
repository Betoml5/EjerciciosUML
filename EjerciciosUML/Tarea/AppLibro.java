
import javax.swing.JOptionPane;

public class AppLibro {
    public static void main(String[] args) {

        String nombreLibro;
        int cantidadLibros;
        double precioLibro;

        String nombreAutor;
        String correo;
        char genero;

        System.out.println("Crea un libro!!");

        nombreLibro = JOptionPane.showInputDialog(null, "Ingresa el nombre del libro");

        precioLibro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el precio del libro"));

        cantidadLibros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de libros"));

        nombreAutor = JOptionPane.showInputDialog(null, "Ingresa el nombre del autor");

        correo = JOptionPane.showInputDialog(null, "Ingresa el correo del autor");

        genero = (JOptionPane.showInputDialog(null, "Ingresa el genero del autor")).charAt(0);

        Autor miNuevoAutor = new Autor(nombreAutor, correo, genero);
        Libro miNuevoLibro = new Libro(nombreLibro, miNuevoAutor, precioLibro, cantidadLibros);

        JOptionPane.showMessageDialog(null, miNuevoLibro.toString());

    }
}
