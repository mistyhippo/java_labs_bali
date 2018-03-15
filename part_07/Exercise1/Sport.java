package part_07.Exercise1;

public class Sport extends Motorcycle {

    private int trackspeed;

    public Sport(String transmission, int mph, String seatposition, int trackspeed){

        super(transmission,mph,seatposition);
        this.trackspeed = trackspeed;

    }

    public void subclassmethod1(){

        setTransmission("Manual");

    }

    public void subclassmethod2(){

        setMph(102);
    }

    public void subclassmethod3(){

        setSeatposition("forward");

    }

    public void gofast(){

        System.out.println("i was going the speed limit officer");
    }

    public void goslow(){

        System.out.println("nobody wants to drive miss daisy");
    }

    public void justright(){

        System.out.println("i guess");
    }
}
