package fop.w5cars;

public class CarPark {

    private Car[] spaces;

    public CarPark(int n) {
        spaces = new Car[n];
    }

    int park(Car c){
        for (int i = 0; i < spaces.length; i++){
            if (spaces[i] == null){
                spaces[i] = c;
                return i;
            }
            if (spaces[spaces.length - 1] != null) return -1;
        }
        return -1;
    }

//    int search(LicensePlate lp){
//        for (int i = 0; i < spaces.length; i++){
//            if (spaces[i])
//        }
//    }
}
