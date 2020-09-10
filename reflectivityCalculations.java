package refractiveIndexReflectivity;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



//Started 08Sep2020 as practice for my CHEM 526b - Analytical Spectroscopy course

public class reflectivityCalculations {
	public static double reflectivity(double n1, double n2) {
		//this calculation assumes the incident angle = 0 degrees
		
		double n12 = n1/n2;
		double numerator = Math.pow((n12-1), 2);
		double denominator = Math.pow((n12+1), 2);
		return (numerator/denominator);
	}
	
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the number of interfaces as an int");
		int faces = keyboard.nextInt();
		
		//face int check
		//System.out.println(faces);
		
		//array of length faces, with a subarray containing two values: {interface #, refractive index}
		
		
		ArrayList<ArrayList<Double>> faceInfo = new ArrayList<ArrayList<Double>>();
		
		for (int i=0; i<faces; i++) {
			//for loop to associate refractive index with face #
			ArrayList<Double> faceIndex = new ArrayList<Double>();
			double d = i+1;
			faceIndex.add(d);
			System.out.println("Enter refractive index of Interface " + d);
			double refractiveIndex = keyboard.nextDouble();
			faceIndex.add(refractiveIndex);
			faceInfo.add(faceIndex);
		}
		
		
//		testing array list
//		for (int i = 0; i<faceInfo.size(); i++) {
//			System.out.println("Interface "+ faceInfo.get(i).get(0) +" has a refractive index of "+ faceInfo.get(i).get(1));
//			
//		}
		ArrayList<Double> reflectivityValues = new ArrayList<Double>();
		
		for (int i = 1; i<faceInfo.size(); i++) {
			double reflectivity = reflectivity(faceInfo.get(i-1).get(1),faceInfo.get(i).get(1));
			//System.out.println(reflectivity);
			reflectivityValues.add(reflectivity);
		}
		
//		checking reflectivity values:
		for (int i = 0; i<reflectivityValues.size(); i++) {
			System.out.println("reflectivity equals " + reflectivityValues.get(i));
		}


		
	}
}
