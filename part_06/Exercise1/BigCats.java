package part_06.Exercise1;

public class BigCats {

    private boolean isBig;
    private boolean has4legs;

    BigCats(boolean isBig, boolean has4legs) {

        this.has4legs = has4legs;
        this.isBig = isBig;

    }

    BigCats(){

        isBig = true;
        has4legs = true;
    }



    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public boolean isHas4legs() {
        return has4legs;
    }

    public void setHas4legs(boolean has4legs) {
        this.has4legs = has4legs;
    }

    public void goHunt(){

        System.out.println("Time to kill");
    }

    public void makePoop(){

        System.out.println("Make room for more food");
    }


}
