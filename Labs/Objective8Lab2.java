public class Objective8Lab2 {
  public static void main(String[] args) {
    int num=0;
    int sum=0;

    for(int i=0; i<20; i+=1) {
      num=num+1;
      sum=num+sum;
    }
    System.out.println(sum);
  }
}
