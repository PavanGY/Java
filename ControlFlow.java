package Java_Basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = true;
		
		if (hungry) {
			System.out.println("I am straving");
			
		}else {
			System.out.println("I am not hungry");
			
		}
		int month = 1;
		String MonthString;
		
		switch(month) {
		case 1:MonthString="January";
			break;
		default :MonthString="Unknown";
			break;
		}
		System.out.println(MonthString);
		

	}

}
