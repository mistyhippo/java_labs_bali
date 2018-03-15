package part_07.Exercise1;

// can only extend one time but implement multiple
public class Motorcycle implements MotorcycleInterface {

    private String transmission;
    private int mph;
    private String seatposition;

    public Motorcycle(String transmission, int mph, String seatposition){

        this.transmission = transmission;
        this.mph = mph;
        this.seatposition = seatposition;

    }

    public void setTransmission(String transmission){

        this.transmission = transmission;

    }

    public String getTransmission(){

        return transmission;

    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    public String getSeatposition() {
        return seatposition;
    }

    public void setSeatposition(String seatposition) {
        this.seatposition = seatposition;
    }

    public void gofast(){
        System.out.println("Your going fast");
    }

    public void goslow(){

        System.out.println("your going slow");
    }

    public void justright(){

        System.out.println("going the speed limit");
    }

    //implemented rubbersidedown method in motorcycle interface
    public void rubbersidedown(){

        System.out.println("rubber side is down");
    }

    public void gotoofast() {
        System.out.println("of course");
    }

    public void watchtherain(){

        System.out.println("eff the rain");
    }
}

