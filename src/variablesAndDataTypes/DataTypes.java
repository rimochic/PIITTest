package variablesAndDataTypes;

public class DataTypes {

   static String model = "Toyota";
   static String make = "\"Camry\"";
   static int year = 2016;
   static int door = 4;
   public static void main(String[] args) {
       start();
   }

   static void start(){
       System.out.println(year + " " + model + " " + make + " " + "is starting");
       System.out.println("This car has" + " " + door + " " + "doors");
       System.out.println(year + " " + model.toUpperCase() + " " + make.toUpperCase() + " " + "is starting");
   }


}
