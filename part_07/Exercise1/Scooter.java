package part_07.Exercise1;

public class Scooter extends Cruiser {


    public Scooter(String transmission, int mph, String seatposition, int handlebarheight) {
        super(transmission, mph, seatposition, handlebarheight);
    }

    public void setscootermethod1(){

        setTransmission("Automatic");
    }

    public void setscootermethod2(){

        setMph(55);
    }

    public void setscootermethod3(){

        setSeatposition("upright");
    }

   public void gofast(){

        System.out.println("I'm doing the best i can");
    }

    public void goslow(){

        System.out.println("this is my normal pace");

    }

    public void justright(){


        System.out.println("what are you talking about");
    }
}
