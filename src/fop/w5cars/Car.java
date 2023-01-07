package fop.w5cars;

public class Car {
    private String brand;
    LicensePlate licensePlate;
    private int chassisNumber;

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.chassisNumber+=1;
    }
}
