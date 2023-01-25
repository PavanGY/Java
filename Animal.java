package Java_Basics;

public class Animal {

	int birth ;
	String gender;
	int weightINLbs;
	 public Animal(int age, String gender, int weightInLbs){
//		 this.age=age;
		 birth=age;
		 this.gender=gender;
		 this.weightINLbs=weightInLbs;
		 
	 }
	 public  void Sleep() {
		 System.out.println("Sleping......");
		 System.out.println("The age of animal is - " + birth);
		 
	 }
	 
	 public void eat() {
		 System.out.println("Eating....");
	 }
	 


}


