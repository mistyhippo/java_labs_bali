package part_07.Exercise1;

public class Cruiser extends Motorcycle {

    private int handlebarheight;

    public Cruiser(String transmission, int mph, String seatposition, int handlebarheight) {
        super(transmission, mph, seatposition);
        this.handlebarheight = handlebarheight;
    }

    public void setcruisermethod1(){

        setTransmission("Manual");
    }

    public void setcruisermethod2(){

        setMph(98);
    }

    public void setcruisermethod3(){

        setSeatposition("back");
    }

    public void gofast(){

        System.out.println("nobody rushes me");
    }

    public void goslow(){

        System.out.println("eat my shorts");

    }

    public void justright(){


        System.out.println("bite me");
    }


}
