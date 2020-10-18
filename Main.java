package reciprocalLinearDispersion;

import java.io.FileWriter;
import com.opencsv.*;

public class Main {
	
	protected static double wavelength1 = 225; //nm
	protected static double wavelength2 = 800; //nm
	
	
	public static void main(String[] args) throws Exception {
//		CSV Builder
		String csv = "526b_PS2_4_DG.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv));
		String[] titles = ("Wavelength (nm),Rd (nm mm^-1)").split(",");
		writer.writeNext(titles);
		for (double i=wavelength1; i <= wavelength2; i++) {
			double wavelength = i;
			double rld = diffractionGrating.reciprocalCalc(wavelength);
			String[] item = (wavelength+","+rld).split(",");
			writer.writeNext(item);
		}
		writer.close();
		
//		String csv2 = "526b_PS2_4_LP";
//		CSVWriter writer2 = new CSVWriter(new FileWriter(csv2));
//		String[] titles2 = ("Wavelength (nm), Rd (nm mm^-1)").split(",");
//		writer2.writeNext(titles2);
//		
		
//		this is a test to write files using open csv
//		String [] record = "1,2,3,4,5".split(",");
//		String [] record2 = "a,b,c,d,e".split(",");
//		writer.writeNext(record);
//		writer.writeNext(record2);
//		writer.close();
		
		
//		this is a second test using actual values
//		int wavelength = 500;
//		double rld = 24.5;
//		String[] item = (wavelength+","+rld).split(",");
//		writer.writeNext(item);
//		writer.close();
	}
}
