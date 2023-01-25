package Java_Basics;

public class MyUtilities {
	public static void PrintJunk(String arguments) {
		System.out.println("This is second methos " + arguments);
	}
	
	public static void  SumTwoNumbers(int FirstArg, int SecondArg) {
		System.out.println(FirstArg + SecondArg);
	}
	
	public static int Add10(int  SomeArgument){
		//replaced the 'void' to 'int' for the return variable to return an integer value.
		int result= SomeArgument+10;
		return result;
	}

}
