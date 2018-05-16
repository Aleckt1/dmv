//
// Aleck Thompson
// 6-29-2013
// Final Project
// DMV Application
//


// This is where import statements go
import java.util.Scanner; //program uses class Scanner
import java.util.ArrayList;
import java.io.*;

//  all Java programs start with public class and the name of the class) 
public class DMV
{
 
// all Java programs must have the following statement
	public static void main(String[] args)
	 {
      ArrayList< Vehicle> vehicles = new ArrayList<Vehicle>();//initialize ArrayList
      Scanner input = new Scanner( System.in );// prepare for a user input
      System.out.print(
              "\nDMV Vehicle Database\n0 Exit\n1 List Vehicles\n2 Display Vehicle Record\n3 Add Vehicle\n"
              + "4 Remove Vehicle\n5 Load Database from File\n6 Save Database to File\nChoice> ");
      int choice = input.nextInt();
      		//loop until sentinel value read from user
		while (choice != 0)
		{
if (choice == 1){
boolean result = vehicles.isEmpty();
if (result == false){
	for(Vehicle item: vehicles){
	System.out.println("Vehicle " + item);
	}//end for
}
else System.out.println("*** No Records In Database ***");


}//end if choice 1

if (choice == 2){
	input.nextLine();
	System.out.print("Enter License Plate>");
	String search = input.nextLine();
	      // list contains element
	//generically process each element in array vehicles
	for (Vehicle currentVehicle : vehicles){
		
		//determine whether element contains license search
		if (currentVehicle.getLicense().contains( search))
		{
		System.out.println(currentVehicle); //invokes toString
		}//end if
		else System.out.printf("*** Plate %s Not Found ***\n", search);
		}
}//end if choice 2

if (choice == 3){
            input.nextLine();
          System.out.print("Enter License Plate>");
            String license  = input.nextLine();  
           System.out.print("Enter Owner>");
           String owner  = input.nextLine();
			  
          System.out.print("Enter Phone Number>");
				String phone  = input.nextLine();
         Vehicle vehicle = new Vehicle(license, owner, phone);
			vehicles.add(vehicle);
}//end if choice 3


if (choice == 4){
	input.nextLine();
	System.out.print("Enter License Plate>");
	String search = input.nextLine();
	  // list contains element
	//generically process each element in arrayList vehicles
	for (Vehicle currentVehicle :new ArrayList<Vehicle>(vehicles)){	
		//determine whether element contains license search
		if (currentVehicle.getLicense().contains( search))
		{
		vehicles.remove(currentVehicle); //remove current
		}//end if
			else {System.out.printf("*** Plate %s Not Found ***\n", search);}
		}
}//end if choice 4

if (choice == 5){
	input.nextLine();
	System.out.print("Enter Filename>");
	String search = input.nextLine();
	try{
	String fileName = search +".txt";
	Scanner open = new Scanner(new File(fileName));
	 while (open.hasNext()){

         Vehicle vehicle = new Vehicle(open.next(), open.next(), open.next());
			vehicles.add(vehicle);}

		open.close();
	}catch(Exception exc) {//Catch problems
	System.out.print("I cannot open that file.");
     		  } 
}//end if choice 5

if (choice ==6){
input.nextLine();
System.out.print("Enter Filename>");
String search = input.nextLine();
try{
String fileName = search +".txt";
FileOutputStream saveFile=new FileOutputStream(fileName);
// Create an ObjectOutputStream to put objects into save file.
PrintWriter save = new PrintWriter(new FileOutputStream(fileName));
for (Vehicle currentVehicle: vehicles)
{
	save.println(currentVehicle.getLicense());
	save.println(currentVehicle.getOwnerName());
	save.println(currentVehicle.getPhoneNumber());
}
		save.close();
	}catch (Exception exc) {//Catch problems
	System.out.print("I cannot create that file.");
     		  }                  
								}//end choice 6

        System.out.print(
              "\nDMV Vehicle Database\n0 Exit\n1 List Vehicles\n2 Display Vehicle Record\n3 Add Vehicle\n"
              + "4 Remove Vehicle\n5 Load Database from File\n6 Save Database to File\nChoice> ");
      choice = input.nextInt();
             }//end while   
   }// end main

} // end class