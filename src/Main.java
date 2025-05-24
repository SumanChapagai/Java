import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // This is my first java class

        //          USEFUL INFO
        //                  sout = System.out.println();
        //                  \ can be used to add things like \n for space after or \", add character afterwards

        //                      PRIMITIVE VARIABLES
        // PRINTING STRINGS

        //System.out.println("Hello world!");
        //System.out.print("Test1\n");
        //System.out.println("Test2");

        //      INTEGERS

        int age = 24;
        int year = 2025;
        int quantity = 1;
        //System.out.println("The year is " + year);

        //  DOUBLES
        double price = 39999.99;
        double gpa = 3.8;
        double temperature = -12.5;

        //System.out.println("$" + price);

        // CHARACTERS OR SINGLE LETTERS

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        //System.out.println(symbol);

        // BOOLEANS FOR TRUE OR FALSE

        boolean isEmployed = false;
        boolean isStudent = false;
        boolean isOnline = true;
        boolean forSale = true;

        //System.out.println(isOnline);

        /*if(isEmployed){
            System.out.println("Congratulations!");
        }
        else{
            System.out.println("Keep working towards it!");
        }*/


        // REFERENCE VARIABLES
        String name = "Suman";
        String food = "pizza";
        String email = "Sumanchapagai@gmail.com";
        String car = "Accord";
        String color = "blue";
        String space = " ";

        //System.out.print("Hello " + name +"\n");
        //System.out.println("Your favorite food is " + food);
        //System.out.println("Your email is " + email);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " + color + space + year + space + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");
        }



    }
}