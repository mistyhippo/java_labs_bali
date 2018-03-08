package part_03.exercise1;

public class IndieFilm {

    private String festival;
    private int price;
    private String title;

    public IndieFilm(String festival, int price, String title) {
        this.festival = festival;
        this.price = price;
        this.title = title;
    }

    public IndieFilm() {
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

