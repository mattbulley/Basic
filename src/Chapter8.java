
public class Chapter8 {
	public static void chapter8() {

		System.out.println("");
		
		System.out.println("			(8) -- Iteration");
		System.out.println("\r\n" +
				"  ___ _                _   _          \r\n" + 
				" |_ _| |_ ___ _ _ __ _| |_(_)___ _ _  \r\n" + 
				"  | ||  _/ -_) '_/ _` |  _| / _ \\ ' \\ \r\n" + 
				" |___|\\__\\___|_| \\__,_|\\__|_\\___/_||_|\r\n" + 
				"                                      \r\n"
				);
		System.out.println("Create a for loop that will call and output the result of your method from Conditionals\r\n" + 
				"2 10 times, using the current iteration as one of the parameters you pass to it.");
		System.out.println();
		int val1 = Main.returnInput();
		Iteration();
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static void Iteration()
	{
		int currentVal = 564;
		
		for(int i = 0; i < 10; i++)
		{
			currentVal = Chapter7.Conditionals2(currentVal, 50);
			System.out.println(" 8." + (i+1) + " " + currentVal);
		}
		return;
	}
}
