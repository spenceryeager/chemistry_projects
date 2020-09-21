package wiensLaw;

import java.util.Scanner;

public class wienLaw {
	
	private static double h = 6.626068* Math.pow(10, -34);
	private static double c0 = 2.99792458* Math.pow(10, 8);
	private static double wienComp = 3.1 * Math.pow(10, 6);
	private static double wienNumerator = 1.19 * Math.pow(10, 16);
	private static double k = 1.380649 * Math.pow(10, -23);
	
	public static double wienCalculation (double T, double lambda) {
		double term1 = wienNumerator / (Math.pow(lambda, 5));
		double terme = (-h*c0) / ((lambda * Math.pow(10, -9))*k*T);
		return term1*Math.exp(terme);
	}

	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Please enter the temperature as K");
		double T = keyboard.nextDouble();
		System.out.println("Please enter the wavelength in nm");
		double lambda = keyboard.nextDouble();
		System.out.println("A sanity check will be performed to detemine if Wien's Law can be used for this combo");
		
		if ((T*lambda < wienComp)) {
			System.out.println("Sanity check passed");
			double wien = wienCalculation(T,lambda);
			System.out.println("Answer: "+wien+" W nm^-1 cm^-2 sr^-1");
		} else {
//			If lambda * T is greater than 3.1 * 10 ^-16, Wien's law cannot describe the system
			System.out.println("Wien's law cannot describe this combination of wavelength and temperature to 1%");
		}
	}
}
