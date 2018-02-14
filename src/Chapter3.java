
public class Chapter3 {
	public static void chapter3() {
		System.out.println("");
		
		System.out.println("			(3) -- Parameters");
		System.out.println("\r\n" +
				"  ___                         _              \r\n" + 
				" | _ \\__ _ _ _ __ _ _ __  ___| |_ ___ _ _ ___\r\n" + 
				" |  _/ _` | '_/ _` | '  \\/ -_)  _/ -_) '_(_-<\r\n" + 
				" |_| \\__,_|_| \\__,_|_|_|_\\___|\\__\\___|_| /__/\r\n" + 
				"                                             \r\n" 
				);
		System.out.println("Create a method that accepts a string as a parameter, and then outputs that string\r\n" + 
				"to the console via a System.out.println(), then call that method from your\r\n" + 
				"main method.");
		System.out.println();
		int val2 = Main.returnInput();
		System.out.println(Parameters("Hello!"));
		System.out.println(); System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static String Parameters(String toConsole)
	{
		return toConsole;
	}
}
