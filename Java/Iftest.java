
class Iftest {
    public static void main(String args[]) {
        int even = 0;
        int odd = 0;
        int number[] = { 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i <= number.length; i++) {
            if (number[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even number:" + even + "Odd number:" + odd);
    }
}
