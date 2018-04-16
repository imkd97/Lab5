/*
Name: Kushalkumar Dave
CmpSc221
Spring 2018
Professor Ganther
Lab 5
This program contains code that will calculate the Miles Per Gallon of your car
 */
package lab5_carusage_reqts;
import java.util.Scanner;
public class Lab5_CarUsage_Reqts {
    private int T_Miles;
    private double FuelPrice;
    private double T_Gallons;
    
// Starting the Calculation with 0 miles driven, 0 paid for fuel, and 0 number of gallons filled    
public Lab5_CarUsage_Reqts () {
    T_Miles = 0;
    FuelPrice = 0.00;
    T_Gallons = 0.0;
}
// This class will get the Number of Gallons the user filled with the Price Per Gallon
public void Fuel (int Num_Gallons,double PriceGallon ){
    FuelPrice = PriceGallon;
    T_Gallons = T_Gallons + PriceGallon;
    return;
}
// This Class adds the initial miles driven previously and also add new miles driven
public double Miles (int MilesDriven){
    T_Miles = T_Miles + MilesDriven;
    return T_Miles;
}
// This calss calcualtes the average of the car also known as Miles Per Gallon
public double MilesPerGallon(){
    double CarAverage;
    CarAverage = (T_Miles/T_Gallons);
    return CarAverage;
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Lab5_CarUsage_Reqts Car = new Lab5_CarUsage_Reqts();
// Local Variables
    int Distance_1, Distance_2;
    int Fuel_Stop1, Fuel_Stop2;
    double Fuel_Price1, Fuel_Price2;
    double CarAverage;
// Prompting driver to add info.
    System.out.println("Please enter the 2 distances driven");
    System.out.println("1: ");
    System.out.println("2: ");
    Distance_1 = scan.nextInt();
    Distance_2 = scan.nextInt();
    
    System.out.print("Enter Price and number of Gallons fueled");
    System.out.println("Fuel Stop 1: Number of Gallons and Price Per Gallon ");
    Fuel_Stop1 = scan.nextInt();
    Fuel_Price1 = scan.nextDouble();
    
    System.out.println("Fuel Stop 2: Number of Gallons and Price Per Gallon ");
    Fuel_Stop2 = scan.nextInt();
    Fuel_Price2 = scan.nextDouble();
   
    Car.Miles (Distance_1);
    Car.Miles (Distance_2);
    Car.Fuel(Fuel_Stop1, Fuel_Price1);
    Car.Fuel(Fuel_Stop2, Fuel_Price2);
    CarAverage = Car.MilesPerGallon();
    
    System.out.println("Your Miles Per Gallon are: " + CarAverage);
    
    
    
}
    }
    

