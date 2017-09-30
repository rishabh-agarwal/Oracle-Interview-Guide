/*Introduction to construction*/

public class Car {

	int maxSpeed = 100;
	int minSpeed = 0;
	
	double weight = 4079; 
	
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	int maxNumberOfPeopleInCar = 6;
	
	public Car() {
		
	}
	
	//constructor is custom initializer- if we don't want default values
	public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
	
	
	public void printVariables() {
		System.out.println("Name of Car: "+  nameOfCar);
		System.out.println("This is the MaxSpeed: "+ maxSpeed);
		System.out.println("This is the MinSpeed: "+ minSpeed);
		System.out.println("This is the Weight: "+ weight);
		System.out.println("Is the Car on: "+ isTheCarOn);
		System.out.println("Condition of the Car: "+  condition);
		System.out.println("Number Of People in Car: "+ numberOfPeopleInCar);
		System.out.println("");
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed +1;
	}
	
	public void getIn() {
		if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {
			numberOfPeopleInCar = numberOfPeopleInCar+1;
			System.out.println("SomeOne Got In : " + numberOfPeopleInCar);
		} 
		else	{
			System.out.println("The car is full!" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
		}
		
	}
	
	public void getOut() {
		if(numberOfPeopleInCar > 0) {
		numberOfPeopleInCar --;
		}
		else {
			System.out.println("No One is in the Car: " + numberOfPeopleInCar );
		}
		
	}
	
	public void turnTheCarOn() {
		if(!isTheCarOn) {
		isTheCarOn = true;
		}
		else {
			System.out.println("The Car is already on!");
		}
	}
	
	public static void main(String[] args) {
		
		Car tommyCar = new Car(); 
		tommyCar.getOut();
		tommyCar.getOut();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.turnTheCarOn();
		tommyCar.turnTheCarOn();
	}

}
