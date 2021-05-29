package day46_encapsulationToday;

public class Car {

    private String model;
    private int year;
    private int mileage;
// setter method for model:

    public void setModel(String carModel ) {
model = carModel;
    }
    // getter method for model
    public String  getModel() {

        return model;
    }
    public void setYear(int year) {
      this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void  setMileage(int mileage) {
         this.mileage=mileage;
    }

    public int getMileage(int mile) {
        return mile;
    }

    @Override
    public String toString() {
        return "Car{" +
                " model ='" + model + '\'' +
                ", year = " + year +
                ", mileage = " + mileage +
                '}';

    }
}
