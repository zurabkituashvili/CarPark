package fop.w5cars;


public class Car {
    private String brand;
    private LicensePlate licensePlate;
    private int chassisNumber;
    private static int count = 1;

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.chassisNumber = count++;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getChassisNumber(){
        return this.chassisNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setChassisNumber(int newNumber){
        this.chassisNumber = newNumber;
    }
    public LicensePlate getLicensePlate(){
        return this.licensePlate;
    }
    public String toString(){
        return "Car " + this.getChassisNumber() + ": (Brand: " + this.getBrand() + ". License Plate: " + this.getLicensePlate() + ")";
    }
}
