package edu.mc.cwh;

public class StringAlong {

	public static void main(String[] args) {
		
		//Declare integer variables length and width
		//Assign values to the variables
		int length = 20;
		int width = 10;
		
		//Declare an integer variable for area
		int area;
		
		//Assign area the value of length times width
		area = length * width;
		
		//Declare a String variable named printOut
		String printOut;
		
		//Load printOut with a table of values
		printOut = "Length:\t" + length;
		printOut += "\nWidth:\t" + width;
		printOut += "\nArea:\t" + area;
		
		//Display printOut on the console
		System.out.println(printOut);

	}

}
