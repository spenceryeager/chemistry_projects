package reciprocalLinearDispersion;

public class diffractionGrating {
	protected static double grooves = 150; //in units of grooves/mm
	protected static double alpha = 30; //degrees incident on monochromator
	protected static double order = 1;
	protected static double focallength = 0.25; //m
	
	
	public static double reciprocalCalc(double wavelength) {
		double b = diffractedAngle(wavelength); // b in degrees
		double numerator = wavelength * (Math.cos(Math.toRadians(b)));
		double adjf = focallength *1000; //adjust focal length from m to mm
		double denominator = adjf*(Math.sin(Math.toRadians(alpha))+Math.sin(Math.toRadians(b)));
		double rld = (numerator/denominator);
		//System.out.println(rld);
		return rld;
	}
	
	public static double diffractedAngle(double wavelength) {
		double nmgroove = Math.pow(10,6) /grooves; //converting grooves/mm to nm/groove. 10^6 is a conversion factor nm/mm
		//System.out.println(nmgroove);
		double sinb = ((order*wavelength)/nmgroove) - Math.sin(Math.toRadians(alpha));
		//System.out.println(Math.toRadians(alpha));
		double b = Math.asin(sinb);
		//System.out.println(Math.toDegrees(b));
		return Math.toDegrees(b);
	}
	

}
