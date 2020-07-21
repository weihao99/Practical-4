public class Car {
   private String plateNum;
   private String colour;
   private int year;
   
   
   public Car(String plateNum, String colour, int year){
       this.plateNum = plateNum;
       this.colour = colour;
       this.year = year;
   }
   
   public String toString(){
       return String.format ("%-10s %-8s %-6d", plateNum, colour, year);
       
   }
}
