
public class Chapter6 {
	public static void chapter6() {
		boolean add = false;
		System.out.println("");
		
		System.out.println("			(6) -- Conditionals");
		System.out.println("\r\n" +
				"   ___             _ _ _   _               _    \r\n" + 
				"  / __|___ _ _  __| (_) |_(_)___ _ _  __ _| |___\r\n" + 
				" | (__/ _ \\ ' \\/ _` | |  _| / _ \\ ' \\/ _` | (_-<\r\n" + 
				"  \\___\\___/_||_\\__,_|_|\\__|_\\___/_||_\\__,_|_/__/\r\n" + 
				"                                                \r\n"
				);
		System.out.println("Modify your method from the previous task to accept another parameter, a\r\n" + 
				"Boolean, which if it is true, the method will return a sum of the two numbers, and if\r\n" + 
				"it is false it will return the multiplication of the two numbers.");
		System.out.println(); System.out.println("Enter value 1:");
		int val1 = Main.returnInput();
		System.out.println("Enter value 2:");
		int val2 = Main.returnInput();
		System.out.println("Enter boolean(1/0):");
		int val3 = Main.returnInput();
		
		if(val3==1)
			add = true;
		
		if(val3==0)
			add=false;
		
		if(add) // Conditional to write out the correct calculation
			System.out.print(val1 + " + " + val2 + " = ");
		else
			System.out.print(val1 + " * " + val2 + " = ");
		System.out.println(Conditionals(val1, val2, add)); // prints out the answer
		System.out.println(); System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static int Conditionals(int val1, int val2, boolean add) 
	{
		int calc = 0; // create temporary int variable to store calculation
		if(add == true) // if we have selected add to be true
			calc = val1 + val2; // we add the numbers
		else // otherwise
			calc = val1 * val2; // we multiply them
		return calc; // and then return the calculation
	}
}
