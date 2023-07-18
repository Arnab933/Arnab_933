import java.util.Scanner;


class Arrayinput {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements you want to store: ");
        // reading the number of elements from the user that want to store
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[] = new int[n]; // creates an array in the memory of length 10
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); // reading array elements from the user
            sc.close();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) { // accessing array elements using the for loop
            System.out.print(" " + array[i]);

        }
    }
}