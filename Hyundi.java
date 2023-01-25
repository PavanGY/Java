package Java_Basics;

public class Hyundi {
	String model  ;
	String color;
	int price;
	
	public Hyundi(String model, String color , int price) {
		this.model=model;
		this.color=color;
		this.price=price;
	}
	
	public void stop() {
		System.out.println("Car was stopped!!........");
		
		
		
	}
	
	public void Specifications() {
		System.out.println("Model of car is " + model);
		System.out.println("Color of car is " + color);
		System.out.println("Price of car is " + price);
	}
	public void Run() {
		System.out.println("Car was Running!!........");
	}
	
	

}
