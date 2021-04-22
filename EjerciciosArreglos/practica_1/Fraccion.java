package practica_1;

/**
 * Fraccion
 */
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void sum(Fraccion fraccionParametro) {
        if (this.denominador == fraccionParametro.denominador) {
            this.numerador = this.numerador + fraccionParametro.numerador;
            this.denominador = this.denominador | fraccionParametro.denominador;
        } else {
            int nuevoDenominador = this.denominador * fraccionParametro.denominador;
            int multi1 = this.numerador * fraccionParametro.denominador;
            int multi2 = fraccionParametro.numerador * this.denominador;
            int nuevoNumerador = multi1 + multi2;

            this.numerador = nuevoNumerador;
            this.denominador = nuevoDenominador;

        }

    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Fraccion) {
                Fraccion foo = (Fraccion) obj;
                if (this.numerador == foo.numerador && this.denominador == foo.denominador) {
                    return true;
                }
            }
        }
        return false;
    }

    
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}