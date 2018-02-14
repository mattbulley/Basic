
public class Chapter11 {
	public static void chapter11() {

		System.out.println("");
		
		System.out.println("			(11) -- Iteration/Arrays 2");
		System.out.println("\r\n" +
				"  ___ _                _   _            ___                          ___ \r\n" + 
				" |_ _| |_ ___ _ _ __ _| |_(_)___ _ _   / /_\\  _ _ _ _ __ _ _  _ ___ |_  )\r\n" + 
				"  | ||  _/ -_) '_/ _` |  _| / _ \\ ' \\ / / _ \\| '_| '_/ _` | || (_-<  / / \r\n" + 
				" |___|\\__\\___|_| \\__,_|\\__|_\\___/_||_/_/_/ \\_\\_| |_| \\__,_|\\_, /__/ /___|\r\n" + 
				"                                                           |__/          \r\n"
				);
		System.out.println("Create a for loop that populates an integer array with values, outputting them at\r\n" + 
				"each iteration. Then create another loop that iterates through the array, changing\r\n" + 
				"the values at each point to equal itself times 10, outputting them at each iteration.");
		System.out.println();
		int val1 = Main.returnInput();
		IterationArrays2(Main.newArray);
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
	}
	
	public static int[] IterationArrays2(int[] array)
	{
		int[] multiArray = new int[10];
		
		for(int i = 0; i <10; i++)
		{
			multiArray[i] = array[i] * 10;
			System.out.println(" 11." + (i+1) + " " + multiArray[i]);
		}
		
		return multiArray;
	}
}
