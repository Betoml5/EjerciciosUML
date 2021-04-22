package practica_1;

import javax.swing.JOptionPane;

public class AppFraccion {
    public static void main(String[] args) {
        // Fraccion miFraccion = new Fraccion(1, 8);
        // Fraccion miFraccion2 = new Fraccion(2, 3);
        // JOptionPane.showMessageDialog(null, miFraccion.sum(miFraccion2));
        int numeroFracciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas fracciones quieres crear?"));
        Fraccion[] arregloFracciones = new Fraccion[numeroFracciones];
        for (int i = 0; i < arregloFracciones.length; i++) {
            int numerador = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Ingresa el numerador de la fraccion " + (i + 1)));
            int denominador = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Ingresa el denominador de la fraccion " + (i + 1)));
            Fraccion nuevaFraccion = new Fraccion(numerador, denominador);
            arregloFracciones[i] = nuevaFraccion;
        }

        String result = "";
        for (int i = 0; i < arregloFracciones.length; i++) {
            result += arregloFracciones[i].getNumerador() + "/" + arregloFracciones[i].getDenominador() + "\n";
        }

        Fraccion resultado = new Fraccion(arregloFracciones[0].getNumerador(), arregloFracciones[0].getDenominador());
        for (int i = 1; i < arregloFracciones.length; i++) {
            resultado.sum(arregloFracciones[i]);
        }

        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, resultado.toString(), "La suma de las fracciones es", numeroFracciones);
    }
}
