import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("23");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int i = 0;

        System.out.println("Enter the elements of the array:");
        while (i < size) {
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("The elements of the array are:");
        i = 0;
        while (i < size) {
            System.out.print(array[i] + " ");
            i++;
        }

        scanner.close();
    }
}
