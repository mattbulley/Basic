
public class Chapter1 {
	public static void chapter1() {
		System.out.println("");
		
		System.out.println("			(1) -- Hello World!");
		System.out.println("\r\n" + 
				"  _  _     _ _      __      __       _    _ _ \r\n" + 
				" | || |___| | |___  \\ \\    / /__ _ _| |__| | |\r\n" + 
				" | __ / -_) | / _ \\  \\ \\/\\/ / _ \\ '_| / _` |_|\r\n" + 
				" |_||_\\___|_|_\\___/   \\_/\\_/\\___/_| |_\\__,_(_)\r\n" + 
				"                                              \r\n"   
				);
		System.out.println("Output “Hello World!” to the console via a System.out.println() statement in\r\n" + 
				"your main method.");
		System.out.println();
		int val2 = Main.returnInput();
		
		System.out.println("Hello World!");
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
	}
}
