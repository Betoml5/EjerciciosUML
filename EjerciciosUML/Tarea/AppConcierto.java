import javax.swing.JOptionPane;

public class AppConcierto {
    public static void main(String[] args) {
        ConciertoLugar lugarDeMiConcierto = new ConciertoLugar(3, "La casita");
        ConciertoMusica miNuevoConcierto = new ConciertoMusica("Viernes", 12, lugarDeMiConcierto,
                "El concierto de Luis");

        miNuevoConcierto.setConciertolugar(lugarDeMiConcierto);

        JOptionPane.showMessageDialog(null, miNuevoConcierto.toString());

    }
}
