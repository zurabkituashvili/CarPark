package fop.w5cars;

public class LicensePlate {

    private String regionalCode, letters;
    private int digits;


    public LicensePlate(String regionalCode, String letters, int digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }
}
