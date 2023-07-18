package Collage_program;

public class NoMatch {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static float sum(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(sum('a', 'b'));
  }

}