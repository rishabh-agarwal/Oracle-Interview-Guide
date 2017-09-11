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
	
	//constructor is custom initializer- if we don't want default values
	public Car(int customMinSpeed, String customCarName) {
		minSpeed = customMinSpeed ;
		nameOfCar = customCarName;
	}
	
	
	public void printVariables() {
		System.out.println("This is the MaxSpeed: "+ maxSpeed);
		System.out.println("This is the MinSpeed: "+ minSpeed);
		System.out.println("This is the Weight: "+ weight);
		System.out.println("Is the Car on: "+ isTheCarOn);
		System.out.println("Condition of the Car: "+  condition);
		System.out.println("Name of Car: "+  nameOfCar);
		System.out.println("Number Of People in Car: "+ numberOfPeopleInCar);
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed +1;
	}
	
	public void getIn() {
		numberOfPeopleInCar = numberOfPeopleInCar+1;
	}
	
	public void getOut() {
		numberOfPeopleInCar --;
	}
	
	public static void main(String[] args) {
		
		Car BirthdayPresent  = new Car(10, "BirthdayPresent");
		BirthdayPresent.getIn();
		BirthdayPresent.getIn();
		BirthdayPresent.printVariables();
		Car christmasPresent = new Car(550,"christmasPresent");
		christmasPresent.getOut();
		christmasPresent.printVariables();
		
	}

}
