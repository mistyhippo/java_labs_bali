package part_06.Exercise1;

public class Lions extends BigCats {

    private int numberinfamily;

     Lions(boolean isBig, boolean has4legs, int numberinfamily) {
        super(isBig, has4legs);
        this.numberinfamily = numberinfamily;
    }
}
