import javax.swing.JOptionPane;

public class AppConcierto {
    public static void main(String[] args) {
        ConciertoLugar lugarDeMiConcierto = new ConciertoLugar(100, "La casona");
        ConciertoMusica miNuevoConcierto = new ConciertoMusica("Viernes", 17, lugarDeMiConcierto,
                "El concierto de beto");

        miNuevoConcierto.setConciertolugar(lugarDeMiConcierto);

        JOptionPane.showMessageDialog(null, miNuevoConcierto.toString());

    }
}
