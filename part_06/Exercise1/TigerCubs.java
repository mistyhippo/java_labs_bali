package part_06.Exercise1;

public class TigerCubs extends Tigers {

    private int age;


     TigerCubs(boolean isBig, boolean has4legs, int numberofstripes, int age) {
        super(isBig, has4legs, numberofstripes);
        this.age = age;
    }

   public void kindaCat(){


        setBig(false);
        setHas4legs(true);

        System.out.println(isBig());
        System.out.println(isHas4legs());

    }

     public void makePoop(){

         System.out.println("Small cats make small poop");

     }

}
