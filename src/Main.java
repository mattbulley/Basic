import java.util.Random;
import java.util.Scanner;

public class Main {
	

	static Scanner scanner = new Scanner(System.in);
	static int[] newArray = Chapter10.Arrays(); 
	
	public static void main(String[] args) {
		
		ident();
		selectChapter();
		scanner.close();
		
	}

	public static void ident() {
		System.out.println("\r\n" + 
				" _______       __        ________  __     ______   \r\n" + 
				"|   _  \"\\     /\"\"\\      /\"       )|\" \\   /\" _  \"\\  \r\n" + 
				"(. |_)  :)   /    \\    (:   \\___/ ||  | (: ( \\___) \r\n" + 
				"|:     \\/   /' /\\  \\    \\___  \\   |:  |  \\/ \\      \r\n" + 
				"(|  _  \\\\  //  __'  \\    __/  \\\\  |.  |  //  \\ _   \r\n" + 
				"|: |_)  :)/   /  \\\\  \\  /\" \\   :) /\\  |\\(:   _) \\  \r\n" + 
				"(_______/(___/    \\___)(_______/ (__\\_|_)\\_______) \r\n" + 
				"                                                   \r\n" + 
				"");
		
		System.out.println("Created by Matt Bulley : Thursday, 8 February 2018");
		System.out.println("");
		contents();
	
	}
	
	public static void contents()
	{
		System.out.println("  Contents:");
		System.out.println("");
		System.out.println("	1  Hello World!");
		System.out.println("	2  Assignment");
		System.out.println("	3  Parameters");
		System.out.println("	4  Return Types");
		System.out.println("	5  Parameters/Operators");
		System.out.println("	6  Conditionals");
		System.out.println("	7  Conditionals 2");
		System.out.println("	8  Iteration");
		System.out.println("	9  Arrays");
		System.out.println("	10  Iteration/Arrays");
		System.out.println("	11  Iteration/Arrays 2");
		System.out.println("");
		System.out.println("  Please enter a number (0 to quit program):");
	}
	
	public static void selectChapter() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid difficulty");
					
					
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid difficulty");
			}
			
		} while (incorrectInput);
		
		switch(any) {
			case 1:
				Chapter1.chapter1();
				break;
			case 2:
				Chapter2.chapter2();
				break;
			case 3:
				Chapter3.chapter3();
				break;
			case 4:
				Chapter4.chapter4();
				break;
			case 5:
				Chapter5.chapter5();
				break;
			case 6:
				Chapter6.chapter6();
				break;
			case 7:
				Chapter7.chapter7();
				break;
			case 8:
				Chapter8.chapter8();
				break;
			case 9:
				Chapter9.chapter9();
				break;
			case 10:
				Chapter10.chapter10();
				break;
			case 11:
				Chapter11.chapter11();
				break;
			case 0:
				System.out.println("Goodbye");
				System.exit(0);
				break;
		}
	}
	
	public static int returnInput() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid difficulty");
					
					
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid difficulty");
			}
			
		} while (incorrectInput);
		
		return any;
	}

}