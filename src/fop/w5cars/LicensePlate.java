package fop.w5cars;

import java.util.ArrayList;
import java.util.List;

public class LicensePlate {

    private String regionalCode, letters;
    private int digits;
    private static List<LicensePlate> licence = new ArrayList<>();



    public LicensePlate(String regionalCode, String letters, int digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
        licence.add(this);
    }

    public String getRegionalCode(){
        return this.regionalCode;
    }

    public String getLetters(){
        return this.letters;
    }
    public int getDigits(){
        return this.digits;
    }
    public void setRegionalCode(String newRegCode){
        this.regionalCode = newRegCode;
    }
    public void setLetters(String newLetters){
        this.letters = newLetters;
    }
    public void setDigits(int newDigits){
        this.digits = newDigits;
    }

    boolean isEqual(LicensePlate other){
        for (LicensePlate licensePlate : licence){
            if (licensePlate.getRegionalCode().equals(other.getRegionalCode()) && licensePlate.getLetters().equals(other.getLetters()) && licensePlate.getDigits() == other.getDigits()) return true;
        }
        return false;
    }
}
