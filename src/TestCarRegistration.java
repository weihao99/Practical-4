import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //todo:: By using array, create 3 CarType objects
        CarType []carList = {new CarType("Toyota", "Vios", 1.5), new CarType("Nissan","Teanna",2.0), new CarType("Honda", "City", 1.6)};
               
        //todo:: create an array that will able to store 6 registrations
        Registration []reg = new Registration[6];
        
  	
        for (int i = 0; i < reg.length; ++i) {

            System.out.println("\nRegistration number: " + Registration.nextRegNo);
  		
            //todo:: request and read the owner detail
            System.out.print("Name :");
            String name = scan.nextLine();
                
            System.out.print("IC no. :");
            String icNo = scan.nextLine();
                
            Owner owner = new Owner(name, icNo);
                 		
            //todo:: request and read car detail
            System.out.print("Plate No :");
            String plateNo = scan.next();
        
            System.out.print("Colour :");
            String colour = scan.next();
    
            System.out.print("Year :");
            int year = scan.nextInt();
                
            Car car = new Car(plateNo, colour, year);
                
            System.out.println("\nCar Types: ");
  		
            for (int x = 0; x <carList.length ; x++){
                System.out.println((x+1)+". "+carList[x].toString());
            }
                
            System.out.print("\nSelect car type [1.." + "3" + "]: ");
            int selection = scan.nextInt();
  		
            //todo:: get cartype from array (based on selection)
            CarType selectedCar = carList[selection - 1];
                    
            //todo:: register the car\
            Registration newReg = new Registration(car, selectedCar, owner);
            reg[i] = newReg; 
                        
        }  
        //todo:: display all registration detail}    
        displayListing(reg);
    }
    
    public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-7s %-13s %-14s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No.", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
    }
}
