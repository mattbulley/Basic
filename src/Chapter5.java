
public class Chapter5 {
	public static void chapter5() {
		System.out.println("");
		
		System.out.println("			(5) -- Parameters/Operators");
		System.out.println("\r\n" +
				"  ___                         _                _____                     _              \r\n" + 
				" | _ \\__ _ _ _ __ _ _ __  ___| |_ ___ _ _ ___ / / _ \\ _ __  ___ _ _ __ _| |_ ___ _ _ ___\r\n" + 
				" |  _/ _` | '_/ _` | '  \\/ -_)  _/ -_) '_(_-</ / (_) | '_ \\/ -_) '_/ _` |  _/ _ \\ '_(_-<\r\n" + 
				" |_| \\__,_|_| \\__,_|_|_|_\\___|\\__\\___|_| /__/_/ \\___/| .__/\\___|_| \\__,_|\\__\\___/_| /__/\r\n" + 
				"                                                     |_|                                \r\n"
				);
		System.out.println("Create a method that accepts two integers as parameters, then returns an integer\r\n" + 
				"that is a sum of the two integers given, then call this method from your main method\r\n" + 
				"and output the returned result.");
		System.out.println(); System.out.println("Enter value 1:");
		int val1 = Main.returnInput();
		System.out.println("Enter value 2:");
		int val2 = Main.returnInput();
		System.out.println("5: ParametersOperators : " + val1 + " + " + val2 + " = "  + ParametersOperators(val1, val2)); 
		System.out.println(); System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static int ParametersOperators(int val1, int val2)
	{
		return val1 + val2;
	}
}
