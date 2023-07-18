import java.util.*;

public class If_else_spd {
    public static void main(String[] args) {
        double n;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your marks:");
        n = ob.nextDouble();
        if (n >= 25) {
            if (n >= 35) {
                if (n >= 45) {
                    if (n >= 60) {
                        if (n >= 75) {
                            if (n >= 80) {
                                if (n >= 90) {
                                    System.out.println("Outstanding");
                                    System.exit(0);
                                }
                                System.out.println("Grade:A++");
                                System.exit(0);
                            }
                            System.out.println("Grade:A");

                        }
                        System.out.println("Grade:B++");
                        System.exit(0);
                    }
                    System.out.println("Grade:B");
                    System.exit(0);
                }
                System.out.println("Grade:C");
                System.exit(0);
            } else
                System.out.println("Unsuccessful");
        }
        ob.close();
    }
}
