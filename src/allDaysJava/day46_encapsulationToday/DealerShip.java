package allDaysJava.day46_encapsulationToday;

public class DealerShip {
    public static void main(String[] args) {
     Car car1 = new Car();
     car1.setModel("Toyota Highlander");
     System.out.println(car1.getModel());

      car1.setYear(2020);
      System.out.println(car1.getYear());

      car1.setMileage(92100);
      System.out.println(car1.getMileage(92100));

      System.out.println(car1);
      
      Car alfaRomeo = new Car();
      alfaRomeo.setModel("Alfa Romeo TWI");
      alfaRomeo.setYear(2020);
      alfaRomeo.setMileage(15000);
        System.out.println(alfaRomeo);



    }
}
