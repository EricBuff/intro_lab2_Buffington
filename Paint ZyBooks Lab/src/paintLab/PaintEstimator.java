package paintLab;

import java.util.Scanner;
import java.lang.Math;  

public class PaintEstimator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double gallonPaint;
	      double cansNeeded;
	      int wholeCansNeeded;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextInt();
	      //System.out.println(wallHeight);
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextInt();   
	      //System.out.println(wallWidth);                                                   // FIXME (1): Prompt user to input wall's width
	      
	      // Calculate and output wall area
	      wallArea = wallWidth * wallHeight;                        // FIXME (1): Calculate the wall's area
	      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
	      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
	      gallonPaint = wallArea / 350;
	      System.out.println("Paint needed: " + gallonPaint + " gallons");
	      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	      cansNeeded = Math.ceil(gallonPaint);
	      wholeCansNeeded = (int)cansNeeded;
	      System.out.println("Cans needed: " + wholeCansNeeded + " can(s)");
	}

}
