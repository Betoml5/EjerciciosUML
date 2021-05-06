package ejercicios_geo;

public abstract class FiguraGeometrica {
		
	protected double volumen;
	
	public abstract void calcularVolumen();
	
	public double getVolumen() {
		return this.volumen;
	}
	
}
