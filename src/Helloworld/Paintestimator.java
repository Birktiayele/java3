package Helloworld;

import java.lang.Math;
import java.util.Scanner;
public class Paintestimator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double wallHeight;
	    double wallWidth;
	    double wallArea;
	    double paintNeed;
	    final double gallonOfpaint = 350;
	    
	    
	    System.out.println("Enter wall height (feet):");
	    wallHeight = scnr.nextDouble();
	    System.out.println("Enter wall width (feet):");
	    wallWidth = scnr.nextDouble();
	    wallArea = wallHeight * wallWidth; 
	    System.out.println("Wall area: "+wallArea+" square feet"); 
	    paintNeed = wallArea / gallonOfpaint; 
	    System.out.println("Paint needed: "+paintNeed+" gallons"); 
	    System.out.println("Cans needed: "+Math.round(paintNeed)+" can(s)");
	      
		
	}

}
