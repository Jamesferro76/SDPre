import java.util.Scanner;
public class Objective9Lab5{
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean keepGoing=true;
    int choice;
    double answer=0.0;

    int power=1;

    System.out.println("Please give me a number: ");
    num1= kb.nextDouble();

    System.out.println("Please give me another number");
    num2= kb.nextDouble();

    while(power==1){

    printMenu();
    System.out.println("Which would you like to do?");

    choice= kb.nextInt();

    switch(choice){
      case 1:
      double sum1= findSum(num1, num2);
      System.out.println(num1 + " + " + num2 + " = " + sum1);
      break;

      case 2:
      double average1= findAverage(num1, num2);
      System.out.println("The average of " + num1 + " and " + num2 + " is " + average1);
      break;

      case 3:
      double tax1= findTax(num1, num2);
      System.out.println("The amount in taxe to be collected from a purchase of " + num1 + " and " + num2 + " is " + tax1);
      break;

      case 4:
      System.out.println("You've chosen to quit.");
      power=2;
      break;

      default:
      System.out.println("Invalid entry. Please try again");
      break;
    }


    }



  }
  public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
  }

  public static double findSum(double a, double b) {
		double sum = a + b;
		return sum;
  }

  public static double findAverage(double c,double d) {
    double average = (c+d)/2;
    return average;
  }

  public static double findTax(double e,double f) {
    double tax = (e+f)*.0831;
    return tax;
  }


}
