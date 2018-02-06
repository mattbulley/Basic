import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int val1 = 30;
		int val2 = 0;
		boolean add = false;
		
		// TODO Auto-generated method stub
		System.out.println("1: Hello World! = " + "Hello World!"); // output "Hello World!"
		System.out.println("2: Assignment = " + Assignment()); // output with variable via method call
		System.out.println("3: Parameters = " + Parameters("Hello!")); // outputs via parameters
		System.out.println("4: ReturnTypes = " + ReturnTypes()); // output "Hello World!" via method call
		System.out.println("5: ParametersOperators : " + val1 + " + " + val2 + " = "  + ParametersOperators(val1, val2)); 
		
		if(add) // Conditional to write out the correct calculation
			System.out.print("6: Conditionals : " + val1 + " + " + val2 + " = ");
		else
			System.out.print("6: Conditionals : " + val1 + " * " + val2 + " = ");
		System.out.println(Conditionals(val1, val2, add)); // prints out the answer
	
		System.out.println("7: Conditionals2 : " + val1 + " + " + val2 + " = "  + Conditionals2(val1, val2)); 
		System.out.println("8: Iteration...");
		Iteration();
		
		int[] newArray = Arrays(); 
		System.out.print("9: Arrays : " + newArray[2] + " + " + newArray[4] + " = ");
		System.out.println(Conditionals2(newArray[2], newArray[4]));
		
		System.out.println("10: Iteration/Arrays...");
		
		for(int i = 0; i < 10; i++)
			System.out.println(" 10." + (i+1) + " " + newArray[i]);
		
		System.out.println("11: Iteration/Arrays2...");
		IterationArrays2(newArray);
		
	}
	
	public static String Assignment() // Stores "Hello World!" in a variable
	{
		String greeting = "Hello World!"; // assigns "Hello World!" to greeting
		return greeting; // returns greeting
	}
	
	public static String Parameters(String toConsole)
	{
		return toConsole;
	}
	
	public static String ReturnTypes()
	{
		return "Hello World!";
	}
	
	public static int ParametersOperators(int val1, int val2) // takes in two values and returns their sum
	{
		return val1 + val2;
	}
	
	public static int Conditionals(int val1, int val2, boolean add) // takes in two values and returns either their sum or multiplies them depending on inputed bool
	{
		int calc = 0; // create temporary int variable to store calculation
		if(add == true) // if we have selected add to be true
			calc = val1 + val2; // we add the numbers
		else // otherwise
			calc = val1 * val2; // we multiply them
		return calc; // and then return the calculation
	}
	
	public static int Conditionals2(int val1, int val2)
	{
		int val = 0; // create temporary value
		if(val1 == 0) // if val1 is zero
			val = val2; // set return value to val2
		else if(val2 == 0) // else if val 2 is zero
			val = val1; // set return value to val1
		else // if neither is zero
			val = val1 + val2; // set return val to the sum
		
		return val; // finally return the temporary value
	}
	
	public static void Iteration()
	{
		int currentVal = 564;
		
		for(int i = 0; i < 10; i++)
		{
			currentVal = Conditionals2(currentVal, 50);
			System.out.println(" 8." + (i+1) + " " + currentVal);
		}
		return;
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
