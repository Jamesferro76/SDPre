import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard= new Scanner(System.in);

    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();

    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();

    System.out.println("What is your favorite animal?");
    String favAnimal= keyboard.nextLine();

    System.out.println("What is your favorite food?");
    String favFood= keyboard.nextLine();

    System.out.println("What is your favorite song?");
    String favSong= keyboard.nextLine();

    System.out.println("Hello " + fname + lname + "! Your favorite animal is a " + favAnimal + ". Your favorite food is " + favFood + ". Your favorite song is " + favSong +".");
  }
}
