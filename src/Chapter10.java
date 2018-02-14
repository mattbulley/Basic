import java.util.Random;

public class Chapter10 {
	public static void chapter10() {

		System.out.println("");
		
		System.out.println("			(10) -- Iteration/Arrays");
		System.out.println("\r\n" +
				"  ___ _                _   _            ___                        \r\n" + 
				" |_ _| |_ ___ _ _ __ _| |_(_)___ _ _   / /_\\  _ _ _ _ __ _ _  _ ___\r\n" + 
				"  | ||  _/ -_) '_/ _` |  _| / _ \\ ' \\ / / _ \\| '_| '_/ _` | || (_-<\r\n" + 
				" |___|\\__\\___|_| \\__,_|\\__|_\\___/_||_/_/_/ \\_\\_| |_| \\__,_|\\_, /__/\r\n" + 
				"                                                           |__/    \r\n"
				);
		System.out.println("Using your array that you created in Task 9, create a for loop that iterates through\r\n" + 
				"your array, outputting the values contained within it.");
		System.out.println();
		int val1 = Main.returnInput();
		for(int i = 0; i < 10; i++)
			System.out.println(" 10." + (i+1) + " " + Main.newArray[i]);
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static int[] Arrays()
	{
		Random rand = new Random();
		int[] myArray = new int[10];
		for(int i = 0; i < 10; i++) {
			myArray[i] = rand.nextInt(50) + 1; // 50 is the max, 1 is the min
		//	System.out.println(myArray[i]);
		}
		return myArray;
	}
}
