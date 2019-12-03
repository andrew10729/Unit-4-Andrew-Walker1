


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
double finalMiles;
  public void drive(double miles){
    double totalMiles = mpg * tankSize;
    double drivenMiles = miles/mpg;
    System.out.println("                     ");
    System.out.println("You want to drive "+miles+"miles");
    System.out.println(drivenMiles+ " gallons used");
    if(drivenMiles>tankSize) {
        System.out.println("You cant! You will run out of gas!");
    }
    else{
      tankSize = tankSize - drivenMiles;
     System.out.println("Current Fuel: "+tankSize);
      }
    finalMiles = miles;

  }
  public void addFuel(double addGallons){
System.out.println("                              ");
System.out.println("You went to a gas station and got "+addGallons+" gallons of fuel");
double totalFuel = addGallons + tankSize;

if(totalFuel>13){
    totalFuel = 13;
    System.out.println("You wanted to get too much fuel, capped at 13 gallons!");
    System.out.println("You now have "+totalFuel+ " gallons of fuel!");
}else{
    System.out.println("You now have "+totalFuel+ " gallons of fuel!");
}




  }
public void odo(){
        System.out.println("                                               ");
      System.out.println("You Have Driven a Total of "+finalMiles+ " miles");





}







}
