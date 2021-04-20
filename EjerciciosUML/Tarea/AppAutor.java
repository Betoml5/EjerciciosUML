import javax.swing.JOptionPane;

/**
 * AppAutor
 */
public class AppAutor {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del autor");
        String correo = JOptionPane.showInputDialog(null, "Ingresa el correo del autor");
        char genero = (JOptionPane.showInputDialog(null, "Ingresa el genero del autor")).charAt(0);

        Autor nuevoAutor = new Autor(nombre, correo, genero);

        JOptionPane.showMessageDialog(null, nuevoAutor.toString());
    }

}