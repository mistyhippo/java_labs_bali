package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs.
 * Create a method that uses "String ... varargs".
 * Within the varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs.
 * Print this statementto the console. Do this at least 3 times with different Strings/sentences.
 */



class allergies {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        typeOfAllergy("Shellfish");
        typeOfAllergy("Peanut", "Potato" + '\n');


        typeOfAllergy("Left","A","Good", "job");
        typeOfAllergy("in","the","city","." + '\n');
        typeOfAllergy("Working", "for", "the","man");
        typeOfAllergy("every","night","and","day");

    }


    public static void typeOfAllergy(String...values){

        for (String i: values)

            System.out.print(i.toString() + " ");







    }



}


