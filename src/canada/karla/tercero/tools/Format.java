package canada.karla.tercero.tools;

import java.text.DecimalFormat;

public class Format {
	public static String decimal(double dec, int numdec) {
		StringBuilder numPunto = new StringBuilder("#.");
		for(int i=0; i<numdec; i++) {
			numPunto.append("0");
		}
		DecimalFormat df = new DecimalFormat(numPunto.toString());
		return df.format(dec);
	}
}
