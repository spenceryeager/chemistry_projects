package reciprocalLinearDispersion;

public class littrowPrism {

	protected static double a = 60; //angle of top of prism in degrees
	protected static double dndlam = -0.000113878; //slope of refractive index vs wavelength
	protected static double incidentAng = 65; 
	
	public static double nprism (double d) {
		double numerator = Math.sin((Math.toRadians(a)+Math.toRadians(d))/2);
		double denominator = Math.sin((Math.toRadians(a)/2));
		return (numerator/denominator);
		
	}
	
	public static double dodn (double n) {
		double numerator = 2*Math.sin((Math.toRadians(a)/2));
		double denominator = Math.pow((1-Math.pow(n, 2)*Math.pow(Math.sin(Math.toRadians(a)/2), 2)), 0.5);	
		return (numerator/denominator);
	}
	
}
