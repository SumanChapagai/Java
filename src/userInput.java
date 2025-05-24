import java.util.Scanner;

public class userInput {
    public static void main(String[] args){


        //nextLine = whole line, next = no space

        //  Calculate area of a rectangle variables
        double width = 0;
        double height = 0;
        double area = 0;


        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you employed? (true/false): ");
        boolean isEmployed = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Currently Employed: " + isEmployed);

        if(isEmployed){
            System.out.println("You have a job!");
        } else {
            System.out.println("Unemployed behaviour!");
        }*/

        /*System.out.print("What is your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //this fixes input buffer error with string after int or double

        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + ", and your favorite color is " + color);*/

        // Calculate area of a rectangle


        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm");



        scanner.close();
    }
}
