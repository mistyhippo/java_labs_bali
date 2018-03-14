package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables.
 *
 * Class_02 must also have at least 3 overloaded constructors.
 *
 * In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor.
 *
 * Each constructor should do something slightly differently.
 *
 * Class_02 must have at least two private instance variables.
 *
 * Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

// make 2 instances/objects  example: beer1, beer2
class Controller{

    public static void main(String[] args) {

        //creating objects of class Sandwich and passing different variables

        // invoke the sandwich constructor with 3 parameters
        Sandwich sandwich1 = new Sandwich("wheat","turkey", "mustard");

        //change instance variable with getter/setter
        sandwich1.setBread("White");
        System.out.println("Type of bread in this sandwich: " + sandwich1.getBread());


        //invoke the sandwich constructor with 2 parameters
       Sandwich sandwhich2 = new Sandwich("white","peaut butter");

       //change instance variable with getter/setter
       sandwhich2.setBread("Pumpernickel");
        System.out.println("Type of bread in this sandwich: " + sandwhich2.getBread());

        // invoke the sandwich constructors with one parameter
       Sandwich sandwhich3 = new Sandwich("wheat");

       //change instance variable with getter/setter
       sandwhich3.setBread("Rye");
        System.out.println("Type of bread in this sandwich: " + sandwhich3.getBread());





    }
}

//make class 2
// make 3 private variables
//make 3 overloaded constructors
class Sandwich{

    private String bread;
    private String protein;
    private String condiment;


    public Sandwich(String bread, String protein, String condiment) {
        this.bread = bread;
        this.protein = protein;
        this.condiment = condiment;

        System.out.println("This is a complete sammich");
        System.out.println();
    }

    public Sandwich(String bread, String protein) {
        this.bread = bread;
        this.protein = protein;

        System.out.println("Sandwich kinda dry. Forgot to go to the store eh?");
        System.out.println();
    }

    public Sandwich(String bread) {
        this.bread = bread;

        System.out.println("They eat these sandwiches in jail");
        System.out.println();
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getCondiment() {
        return condiment;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }
}

