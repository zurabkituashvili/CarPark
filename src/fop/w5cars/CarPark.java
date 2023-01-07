package fop.w5cars;

public class CarPark {

    private Car[] spaces;
//    private Car car;
//
//    public Car getCar(){
//        return this.car;
//    }

    public CarPark(int n) {
        spaces = new Car[n];
    }

    public Car[] getSpaces(){
        return this.spaces;
    }

    public void setSpaces(Car[] spaces){
        this.spaces = spaces;
    }

    int park(Car c){
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i] == null){
                spaces[i] = c;
                return i;
            }
        }
        return -1;
    }

    int search(LicensePlate lp){
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i].getLicensePlate() == lp){
                return i;
            }
        }
        return -1;
    }

    Object driveOff(LicensePlate lp){
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i] != null && spaces[i].getLicensePlate() == lp){
                Car car = spaces[i];
                spaces[i] = null;
                return car;
            }
        }
        return null;
    }

    public String toString(){
        String result = "Car Park:\n";
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i] != null){
                result += " " + i + ": [" + spaces[i].toString() + "]\n";
            }
            else result += " " + i + ": []\n";
        }
        return result;
    }
}
