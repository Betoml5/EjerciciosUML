import javax.swing.JOptionPane;

public class AppConcierto {
    public static void main(String[] args) {
        ConciertoMusica miNuevoConcierto = new ConciertoMusica();
        ConciertoLugar lugarDeMiConcierto = new ConciertoLugar();

        lugarDeMiConcierto.capacidad = 12;
        lugarDeMiConcierto.nombreLugar = "Gimnasio";

        miNuevoConcierto.nombreConcierto = "Mi nuevo concierto";
        miNuevoConcierto.dia = "10/12/31";
        miNuevoConcierto.hora = 18;

        miNuevoConcierto.conciertolugar = lugarDeMiConcierto;

    }
}
