import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");
        boolean yes = true;
        do {
            //Prompt user to enter values of length and width of the classroom
            Scanner scnr = new Scanner(System.in);

            System.out.println("Enter Length: ");
            double length = scnr.nextDouble();

            System.out.println("Enter Width: ");
            double width = scnr.nextDouble();

            System.out.println("Enter Height: ");
            double height = scnr.nextDouble();

            //Display area and perimeter and volume of that classroom
            double area = length * width;
            System.out.println("Area: " + area);

            double perimeter = (2 * length) + (2 * width);
            System.out.println("Perimeter: " + perimeter);

            double volume = length * width * height;
            System.out.println("Volume: " + volume);

            //Ask if the user wants to continue
            System.out.println("Continue? (y/n):");
            String s = scnr.next();
            if (s.equalsIgnoreCase("y")) {
                yes = true;
            } else {
                yes = false;
            }
        }while (yes);

        //Say bye!
        System.out.println("Thanks for measuring!");


    }
}
