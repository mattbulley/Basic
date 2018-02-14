
public class Chapter2 {
	public static void chapter2() {
		System.out.println("");
		
		System.out.println("			(2) -- Assignment");
		System.out.println("\r\n" + 
				"    _          _                         _   \r\n" + 
				"   /_\\   _____(_)__ _ _ _  _ __  ___ _ _| |_ \r\n" + 
				"  / _ \\ (_-<_-< / _` | ' \\| '  \\/ -_) ' \\  _|\r\n" + 
				" /_/ \\_\\/__/__/_\\__, |_||_|_|_|_\\___|_||_\\__|\r\n" + 
				"                |___/                        \r\n"	   
				);
		System.out.println("Store “Hello World!” in a variable, then output it to the console via a System.out.\r\n" + 
				"println() statement in your main method.");
		System.out.println();
		int val2 = Main.returnInput();
		System.out.println(Assignment());
		System.out.println(); System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static String Assignment()
	{
		String greeting = "Hello World!"; // assigns "Hello World!" to greeting
		return greeting; // returns greeting
	}
}
