package ejercicio_herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.getNombre() + "\nApellido: " + getApellidos() + "\nCodigo Estudiante: "
                + this.codigoEstudiante + "\nNota Final: " + this.notaFinal);
    }

}
