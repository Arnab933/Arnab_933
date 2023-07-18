class Findbig {
  public static void main(String args[]) {
    int a = 100, b = 65, c = 48;
    int big;
    if (a > b) {
      if (a > c)
        big = a;
      else
        big = c;
    } else {
      if (b > c)
        big = b;
      else
        big = c;
    }

    System.out.println("Big=" + big);

  }
}
