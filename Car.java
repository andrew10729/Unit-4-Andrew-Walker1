


public class Car{

//The Attributes of a car(instance variables)


  private String make;
  private String model;
  private double mpg;
  private double tankSize;
  private double fuel;
}

//constructor for the car. Initialized the instance variables for the Car.

  public Car(String carMake, String carModel, double carMpg, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    fuel = tankSize;


        public String toString(){
          String Result = "";
          Result += "Make: " + make + ", Model" + model + "\n";
          Result += "mpg" + mpg + ", Tank Size" + tankSize + "\n";
          Result += "Current Amount of Fuel: " + fuel;

        }





}
