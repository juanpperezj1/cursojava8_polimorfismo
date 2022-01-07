package canada.karla.tercero;

public class Circulo implements FiguraGeometrica {
	@Override
	public double Area(double param) {
		return (Math.PI*(param*param));
	}

	@Override
	public double Perimetro(double param) {
		return (Math.PI*(2*param));
	}
	@Override
	public String toString() {
		String className = this.getClass().getSimpleName();
		Class[] interfaces = this.getClass().getInterfaces();
		StringBuilder typename = new StringBuilder();
		for(int i=0; i<interfaces.length; i++) {
			typename.append(interfaces[i].getSimpleName());
		}
		return typename.toString() + " " + className;
	}
}
