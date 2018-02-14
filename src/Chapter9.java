
public class Chapter9 {
	public static void chapter9() {

		System.out.println("");
		
		System.out.println("			(9) -- Arrays");
		System.out.println("\r\n" +
				"    _                        \r\n" + 
				"   /_\\  _ _ _ _ __ _ _  _ ___\r\n" + 
				"  / _ \\| '_| '_/ _` | || (_-<\r\n" + 
				" /_/ \\_\\_| |_| \\__,_|\\_, /__/\r\n" + 
				"                     |__/    \r\n"
				);
		System.out.println("Create an array that will hold 10 integer values, populate the array with values,\r\n" + 
				"then call and output the result of your method from Conditionals 2, passing values\r\n" + 
				"that are stored in the array as arguments to the method.");
		System.out.println();
		int val1 = Main.returnInput();
		for(int i = 0, j = Main.newArray.length - 1; i < Main.newArray.length; i++, j--) {
			System.out.print( Main.newArray[i] + " + " + Main.newArray[j] + " = ");
			System.out.println(Chapter7.Conditionals2(Main.newArray[i], Main.newArray[j]));
		}
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
	}
}
