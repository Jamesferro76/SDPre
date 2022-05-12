import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    System.out.println("Please enter a number: ");
    double userNum= input.nextDouble();

    if(userNum>0){
      System.out.println(userNum + " is a positive number.");
    }
    else if(userNum<0){
      System.out.println(userNum + " is a negative number.");
    }
    else if(userNum==0){
      System.out.println(userNum + " is 0 therefor neither positive nor negative.");
    }
  }
}
