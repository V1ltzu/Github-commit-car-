
public class car_exercise_github {

	//These are the car's attributes
	public String brand;
	public int model;
	public int amountOfFuel;
	//All methods under main
	public car_exercise_github(String brand, int model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
	}
	//The methods
	public void brake() {

		System.out.println("Car is braking");
	}

	public void accelerate() {

		System.out.println("Car is accelerating");
	}

	public void printData() {

		System.out.println(
				"The brand is" + brand + ", the model is " + model + " and the amount of fuel is " + amountOfFuel);
	}

	public void refuel(int amount) {

		System.out.println("Fuel on tank:" + amount);

		System.out.println("Refuel: 5");

		amount += 5;

		System.out.println("Fuel on tank after the refuel:" + amount);

	}

	car_exercise_github car1 = new car_exercise_github("Fiat", 500, 50);
}