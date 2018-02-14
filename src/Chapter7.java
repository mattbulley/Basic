
public class Chapter7 {
	public static void chapter7() {
		boolean add = false;
		System.out.println("");
		
		System.out.println("			(7) -- Conditionals 2");
		System.out.println("\r\n" +
				"   ___             _ _ _   _               _    ___ \r\n" + 
				"  / __|___ _ _  __| (_) |_(_)___ _ _  __ _| |__|_  )\r\n" + 
				" | (__/ _ \\ ' \\/ _` | |  _| / _ \\ ' \\/ _` | (_-</ / \r\n" + 
				"  \\___\\___/_||_\\__,_|_|\\__|_\\___/_||_\\__,_|_/__/___|\r\n" + 
				"                                                    \r\n"
				);
		System.out.println("Modify your method from the previous task to have another if statement that checks\r\n" + 
				"if one of the numbers is 0, if this is true then return the other non-0 number.");
		System.out.println(); System.out.println("Enter value 1:");
		int val1 = Main.returnInput();
		System.out.println("Enter value 2:");
		int val2 = Main.returnInput();
		if(val1 != 0 && val2 != 0)
			System.out.println(val1 + " + " + val2 + " = "  + Conditionals2(val1, val2));
		else
			System.out.println(Conditionals2(val1, val2));
		System.out.println(); System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static int Conditionals2(int val1, int val2)
	{
		int val = 0; // create temporary value
		if(val1 == 0) // if val1 is zero
			val = val2; // set return value to val2
		else if(val2 == 0) // else if val 2 is zero
			val = val1; // set return value to val1
		else // if neither is zero
			val = val1 + val2; // set return val to the sum
		
		return val; // finally return the temporary value
	}
}
