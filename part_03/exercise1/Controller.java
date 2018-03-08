package part_03.exercise1;

public class Controller {

    public static void main(String[] args) {

        FeatureFilm film1 = new FeatureFilm();

        film1.setBlockBuster(true);
        boolean isBlockbuster = film1.getBlockbuster();
        System.out.println(isBlockbuster);

         film1.setDirector("steven S");
         String isDirector = film1.getDirector();
        System.out.println(isDirector);

         film1.setTitle("transformers");
         String isTitle = film1.getTitle();
        System.out.println(isTitle);

         film1.setGenre("action");
         String isGenre = film1.getGenre();
        System.out.println(isGenre);

        FeatureFilm film2 = new FeatureFilm(false, "goldberg", "comedy", "ace ventura");
        film2.setBlockBuster(true);



        IndieFilm indieFilm1 = new IndieFilm();

        indieFilm1.setTitle("hot water for chocolate");
        String isTittle = indieFilm1.getTitle();
        System.out.println(isTittle);

        indieFilm1.setFestival("sundance");
        String isFestival = indieFilm1.getFestival();
        System.out.println(isFestival);

        indieFilm1.setPrice(5);
        int isPrice = indieFilm1.getPrice();
        System.out.println(isPrice);


    }
}
