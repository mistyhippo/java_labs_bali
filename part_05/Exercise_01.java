package part_05;

import java.util.ArrayList;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class Controller_01 {

    public static void main(String[] args) {

        // create object of Beer class named beer1. object name is beer1
        // classes are always capitalized
        Beer beer1 = new Beer();


        //set the values of the Beer object beer1
        //getters/setters attached to object
        beer1.setName("Guinness");
        beer1.setCountry("Ireland");
        beer1.setAbv(4.5);

        //display the values of the beer1 object using getters
        // objectName.getter()
        System.out.println(beer1.getName());
        System.out.println(beer1.getCountry());
        System.out.println(beer1.getAbv());
        System.out.println();


        // call method to create instance for juice class
        //call this from Beer class
        Beer.createJuiceObj();

        // passing drinkBeer method the beer1 object of the Beer class
        //Class.methodName() for static methods
        Controller_01.drinkBeer(beer1);

        System.out.println(beer1.getName());
        System.out.println(beer1.getCountry());
        System.out.println(beer1.getAbv());


        Beer beer2 = new Beer();

        method2(beer2);
        System.out.println("Beer 2 country is: " + beer2.getCountry());
        System.out.println("Beer 2 name is: " + beer2.getName());
        System.out.println("Beer 2 abv is: " + beer2.getAbv());
    }

    // create drinkBeer method. parameters are object type and object temporary variable name
    // these will change the values of the beer variables
    public static void drinkBeer(Beer beer) {

        beer.setCountry("Belgium");
        beer.setName("la fin du monde");
        beer.setAbv(9.0);


        System.out.println(beer.getAbv());
        System.out.println(beer.getCountry());
        System.out.println(beer.getName());

        //can call directly because method is within the same class AND Static can call Static
        Controller_01.method2(beer);
        //this works too
        //method2(beer);


    }



    public static void method2(Beer beer){

        beer.setAbv(3.2);
        beer.setName("Bintang");
        beer.setCountry("Indonesia");

        System.out.println(beer.getAbv());
        System.out.println(beer.getName());
        System.out.println(beer.getCountry());


    }

}

//dont declare classes public until inside a package
class Beer {

    //private instance variables can only be accessed by public members of the same class
    //will use getters and setters to modify and return
    private String name;
    private String country;
    private double abv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }


    // method to create instance of Juice class
    // make static so that it belongs to Beer class
    public static void createJuiceObj() {

        Juice juice1 = new Juice();
        juice1.setName("Mango Lassi");
        juice1.setBaseFruit("Mango");
        juice1.setGramsOfSugar(16);

        System.out.println(juice1.getName());
        System.out.println(juice1.getBaseFruit());
        System.out.println(juice1.getGramsOfSugar());
        System.out.println();
    }


}

//dont declare classes public until inside a package
class Juice {

    //instance variables
    private String name;
    private String baseFruit;
    private int gramsOfSugar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseFruit() {
        return baseFruit;
    }

    public void setBaseFruit(String baseFruit) {
        this.baseFruit = baseFruit;
    }

    public int getGramsOfSugar() {
        return gramsOfSugar;
    }

    public void setGramsOfSugar(int gramsOfSugar) {
        this.gramsOfSugar = gramsOfSugar;
    }





}