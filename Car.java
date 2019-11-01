


public class Car{

  //The Attributes of a car(instance variables)


  private String make;
  private String model;
  private double mpg;
  private double tankSize;
  private double fuel;


  //constructor for the car. Initialized the instance variables for the Car.

  public Car(String carMake, String carModel, double carMpg, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    fuel = tankSize;
  }

  public String toString(){
    String result = "";
    result += "Make: " + make + ", Model" + model + "\n";
    result += "mpg: " + mpg + ", Tank Size: " + tankSize + "\n";
    result += "Current Amount of Fuel: " + fuel;
    return result;
  }

  public void drive(double miles){
    double totalMiles = mpg * tankSize;
    double drivenMiles = miles/mpg;
    System.out.println(drivenMiles);
    if(drivenMiles>tankSize){
    System.out.println("Not Enough Fuel");

    System.out.println("Car drove " + miles + " miles");
    }
  }
}
