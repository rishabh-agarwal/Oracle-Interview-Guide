/*Day 1*/
public class Car {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079; 
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	public void printVariables() {
		System.out.println("This is the MaxSpeed: "+ maxSpeed);
		System.out.println("This is the MinSpeed: "+ minSpeed);
		System.out.println("This is the Weight: "+ weight);
		System.out.println("Is the Car on: "+ isTheCarOn);
		System.out.println("Condition of the Car: "+  condition);
		System.out.println("Name of Car: "+  nameOfCar);
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed +1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car familyCar = new Car();
        System.out.println("Family Car");
        familyCar.printVariables();
        /*Car aliceCar = familyCar; 
        familyCar.wreckCar(); 
        System.out.println("Alice Car");
        aliceCar.printVariables();*/
        familyCar.upradeMinSpeed();
        familyCar.printVariables(); 
	}

}
