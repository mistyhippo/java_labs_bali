package part_06.Exercise1;

public class Tigers extends BigCats {

    private int numberofstripes;

    //constructors come after instance variables and before methods

     Tigers(boolean isBig, boolean has4legs, int numberofstripes) {
        super(isBig, has4legs);
        this.numberofstripes = numberofstripes;
    }

    void isACat(){

        setBig(true);
        setHas4legs(true);

         System.out.println(isBig());
         System.out.println(isHas4legs());
    }
}
