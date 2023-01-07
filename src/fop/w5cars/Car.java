package fop.w5cars;

public class Car {
    private String brand;
    private LicensePlate licensePlate;
    private static int chassisNumber = 0;

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.chassisNumber+=1;
    }
}
