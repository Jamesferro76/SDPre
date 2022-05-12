import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    System.out.println("What is the first whole number?");
    int num1= input.nextInt();

    System.out.println("What is the second whole number?");
    int num2= input.nextInt();

    if(num1>num2) {
      System.out.println(num1 + " is greater than " + num2);
    }

    else if(num2>num1){
      System.out.println(num1 + " is less than " + num2);
    }

    else if(num1==num2){
      System.out.println(num1 + " is equal to " + num2);
    }
  }
}
