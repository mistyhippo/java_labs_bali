package part_06.Exercise1;

public class Controller {

    public static void main(String[] args) {

        Tigers tiger1 = new Tigers(true,true,11);
        tiger1.isACat();


        TigerCubs cub1 = new TigerCubs(false,true, 18,1);
        cub1.kindaCat();

        //overriden method
        cub1.makePoop();

        Lions lion1 = new Lions(true,true,7);
        lion1.makePoop();

        //used default constructor with no parameters
        System.out.println(lion1.isBig());
    }
}
