import java.util.Scanner;

class DESIGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd number of rows: ");
        int n = sc.nextInt();

        int mid = (n + 1) / 2;

        // Upper half
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= (mid - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= (mid - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
