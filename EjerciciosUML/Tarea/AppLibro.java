public class AppLibro {
    public static void main(String[] args) {
        Autor beto = new Autor("Alberto Martinez", "betoml5@hotmail.com", 'm');
        Libro miNuevoLibro = new Libro("El libro de beto", beto, 200.00);
        System.out.println(miNuevoLibro.toString());
    }
}
