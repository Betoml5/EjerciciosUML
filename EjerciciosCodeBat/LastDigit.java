import java.util.Scanner;

/**
 * lastDigit
 */
public class LastDigit {

    static boolean startHi(String str) {
        if (str.split(" ")[0] == "hi") {
            System.out.println("True");
            return true;
        }

        System.out.println("False");
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String str;

        System.out.println("Ingresa tu frase");
        str = entrada.next();

        startHi(str);

        // System.out.println(str.split(" ")[0]);
        // if (str.split(" ")[0] == "hi") {
        // System.out.println("Primera posicion " + str.split(" ")[0]);
        // System.out.println(true);
        // } else {
        // System.out.println("Primera posicion " + str.split(" ")[0]);
        // System.out.println(false);
        // }
    }
}