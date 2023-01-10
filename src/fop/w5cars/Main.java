package fop.w5cars;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LicensePlate car1 = new LicensePlate("GE", "ABC", 123);
        LicensePlate car2 = new LicensePlate("GE", "ABC", 123);
        LicensePlate car3 = new LicensePlate("USA", "UUU", 321);
        System.out.println(car1.isEqual(car2));
        System.out.println();
        System.out.println();


        Car car = new Car("BMW", car1);
        Car carr = new Car("MRC", car2);
        Car carrr = new Car("USA", car3);
        System.out.println(car.getChassisNumber());
        System.out.println(carr.getChassisNumber());
        System.out.println(carrr.getChassisNumber());
        System.out.println();
        System.out.println("park the cars:");

        CarPark park = new CarPark(3);
        System.out.println(park.park(car));
        System.out.println(park.park(carr));
        System.out.println(park.park(carrr));
        System.out.println("search:");
        System.out.println(park.search(car2));

        System.out.println();
        System.out.println("driveOff:");

        System.out.println(park.driveOff(car1));
        System.out.println(park.search(car1));
        System.out.println();
        System.out.println("view the taken spaces: ");

        System.out.println(Arrays.toString(park.getSpaces()));


    }
}
