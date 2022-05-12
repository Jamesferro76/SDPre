import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    System.out.println("Please enter a whole number:");
    int num1= input.nextInt();

    if(num1%2==0){
      System.out.println("The number " + num1 + " is even.");
    }
    else{
      System.out.println("The number " + num1 + " is odd.");
    }


  }
}
