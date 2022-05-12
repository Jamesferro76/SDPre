import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int selection;
    int num=1;

    while(num==1){
      printMenu();
      selection=input.nextInt();

      switch(selection){
        case 1:
        System.out.println("Hello Human");
        break;

        case 2:
        System.out.println("Apples, Bananas, Coconuts");
        break;

        case 3:
        System.out.println("Goodbye");
        num=2;
        break;

        default:
        System.out.println("Choose either 1, 2, or 3");
      }
    }
  }

  public static void printMenu(){
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
