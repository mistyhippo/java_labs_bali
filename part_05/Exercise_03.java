package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

//class one with main method
// within class one create an instance/object of class two
// demonstrate method overloading

class Class_01 {

    public static void main(String[] args) {

        // create instance/object (they are same) of breakfast class
        Breakfast breakfast1 = new Breakfast();

        // objectName.methodCall then pass in parameters

        System.out.println(breakfast1.makeBreakfast("waffles"));
        System.out.println(breakfast1.makeBreakfast("pancakes", "grits"));
        System.out.println(breakfast1.makeBreakfast("eggs", "oatmeal", "smoothie"));


    }

}


//create class two
//within class two create three overloaded methods

class Breakfast {

    // make sure to include return type before method name (input paramter is Argument type + temp variable)
    public String makeBreakfast(String name) {

        // will return value to breakfastName variable
        return name;

    }

    public String makeBreakfast(String name, String name2) {

        // will return value to breakfastName variable
        return name + " " + name2;

    }

    public String makeBreakfast(String name, String name2, String name3) {

        // will return value to breakfastName variable
        return name + " " + name2 + " " + name3;

    }

}