package week1.day2.assignments;

public class Car {
	public void applyBreak()
	{
	System.out.println("Apply Break");
	}
	public void applyGear()
	{
		System.out.println("Apply Gear");	
	}
	public void switchOnAc()
	{
		System.out.println("Switch on AC");
	}
	public void applyAcclerate()
	{
		System.out.println("Apply Acclerate");
	}
	public static void main(String[] args) 
	{
	Car obj =new Car();
	obj.applyBreak();
	obj.applyGear();
	obj.switchOnAc();
	obj.applyAcclerate();
	}
}

