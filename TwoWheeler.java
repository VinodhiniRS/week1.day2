package week1.day2.assignments;

public class TwoWheeler {
	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=2435457876L;
	boolean isPunctured=false;
	String bikeName="R15";
	double runningKM=25000.0776;
public static void main(String[] args) {
		TwoWheeler obj= new TwoWheeler();
		System.out.println("Numer of Wheels in the car:" +obj.noOfWheels);
		System.out.println("Numer of Mirrors in the car:" +obj.noOfMirrors);
		System.out.println("ChasisNumber:" +obj.chassisNumber);
		System.out.println("Car isPunctured" +obj.isPunctured);
		System.out.println("Name of the bike:" +obj.bikeName);
		System.out.println("Running Kilometer:" +obj.runningKM);
	}
}
