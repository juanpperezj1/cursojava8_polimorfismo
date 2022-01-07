package canada.karla.tercero;

import java.util.ArrayList;

import canada.karla.tercero.tools.Format;

public class Juego {
	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		Rombo rombo = new Rombo();
		Rectangulo rectangulo = new Rectangulo();
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(rombo);
		//figuras.add(rectangulo);
		for(FiguraGeometrica figura: figuras) {
			System.out.print(figura);
			System.out.print(" Area: " + Format.decimal(figura.Area(4), 2));
			System.out.println(" Perimetro: " + Format.decimal(figura.Perimetro(4), 5));
		}
	}
}
