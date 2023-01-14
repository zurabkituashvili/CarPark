package fop.w5cars;

public class LicensePlate {

    private String regionalCode, letters;
    private int digits;


    public LicensePlate(String regionalCode, String letters, int digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    public String getRegionalCode() {
        return this.regionalCode;
    }

    public String getLetters() {
        return this.letters;
    }

    public int getDigits() {
        return this.digits;
    }

    public void setRegionalCode(String newRegCode) {
        this.regionalCode = newRegCode;
    }

    public void setLetters(String newLetters) {
        this.letters = newLetters;
    }

    public void setDigits(int newDigits) {
        this.digits = newDigits;
    }


    public boolean isEqual(LicensePlate other) {
        return regionalCode.equals(other.regionalCode) && letters.equals(other.regionalCode) && digits == other.digits;
    }

    public String toString(){
        return this.getRegionalCode() + ":" + this.getLetters() + " " + this.getDigits();
    }
}
