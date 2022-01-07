package canada.karla.tercero;

public class Rectangulo {
	public double Area(double base, double altura) {
		return (base*altura);
	}
	public double Perimetro(double base, double altura) {
		return ((2*base)*(2*altura));
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
