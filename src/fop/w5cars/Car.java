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
    public int getChassisNumber(){
        return this.chassisNumber;
    }
    public void setChassisNumber(int newNumber){
        this.chassisNumber = newNumber;
    }
}
