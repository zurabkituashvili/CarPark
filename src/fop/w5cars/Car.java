package fop.w5cars;

public class Car {
    private String brand;
    LicensePlate licensePlate;
    private int chassisNumber;

    public Car(String brand) {
        this.brand = brand;
        this.chassisNumber+=1;
    }
}
