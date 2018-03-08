package part_03.exercise1;

public class FeatureFilm {

    private boolean blockBuster;
    private String director;
    private String genre;
    private String title;

    FeatureFilm(boolean blockBuster, String director, String genre, String title){

        this.blockBuster = blockBuster;
        this.director = director;
        this.genre = genre;
        this.title = title;


    }

    public FeatureFilm() {
    }

    void setBlockBuster(boolean blockBuster){

        this.blockBuster = blockBuster;
    }

    boolean getBlockbuster(){

        return blockBuster;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
