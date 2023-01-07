package fop.w5cars;

public class CarPark {

    private Car[] spaces;

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

//    int search(LicensePlate lp){
//        for (int i = 0; i < spaces.length; i++){
//            if (spaces[i])
//        }
//    }
}
