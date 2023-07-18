public class switch1 {
    public static void Main(String args[]) {
        char choice;
        System.out.println("Enter the choice:");
        System.out.println("M->Madras");
        System.out.println("C->Calcutta");
        System.out.println("D->Delhi");
        System.out.println("B->Binpur");
        try {
            switch (choice = (char) System.in.read()) {
                case 'M':
                case 'm':
                    System.out.println("Madras");
                    break;
                case 'C':
                case 'c':
                    System.out.println("Calcutta");
                    break;
                case 'D':
                case 'd':
                    System.out.println("Delhi");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Binpur");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } catch (Exception e) {
            System.out.println("I/O Error");

        }
    }
}
