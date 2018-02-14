
public class Chapter4 {
	public static void chapter4() {
		System.out.println("");
		
		System.out.println("			(4) -- Return Types");
		System.out.println("\r\n" +
				"  ___     _                   _____                  \r\n" + 
				" | _ \\___| |_ _  _ _ _ _ _   |_   _|  _ _ __  ___ ___\r\n" + 
				" |   / -_)  _| || | '_| ' \\    | || || | '_ \\/ -_|_-<\r\n" + 
				" |_|_\\___|\\__|\\_,_|_| |_||_|   |_| \\_, | .__/\\___/__/\r\n" + 
				"                                   |__/|_|           \r\n"
				);
		System.out.println("Create a method to return “Hello World!” once called, which you call from your\r\n" + 
				"main method, to then output the text to the screen.");
		System.out.println();
		int val2 = Main.returnInput();
		System.out.println(ReturnTypes());
		System.out.println(); System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static String ReturnTypes()
	{
		return "Hello World!";
	}
}
