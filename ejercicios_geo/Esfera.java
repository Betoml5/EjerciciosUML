package ejercicios_geo;

public class Esfera extends FiguraGeometrica{

	private double r;
	
	Esfera(double r){
		this.r = r;
	}
	
	public void calcularVolumen() {
		this.volumen = 1.3 * (Math.PI * Math.pow(r, 3));
	}

}
