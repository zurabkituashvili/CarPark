package fop.w5cars;

public class Car {
    private String brand;
    private LicensePlate licensePlate;
    private int count = 0;
    private int chassisNumber;

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.chassisNumber = count++;
    }
}
