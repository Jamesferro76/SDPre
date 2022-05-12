import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int selection;
    int num=1;

    while(num==1) {
      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite food");
      System.out.println("3: Exit");

      selection=scanner.nextInt();

      switch(selection){
        case 1:
        System.out.println("Hello Human");
        break;
        case 2:
        System.out.println("Apples, Bananas, Coconuts");
        break;
        case 3:
        System.out.println("Exit");
        num=2;
        break;

        default:
        System.out.println("Please select number 1, 2, or 3.");
        break;

      }
    }
  }
}
