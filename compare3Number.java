import java.util.Scanner;

class Compare3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            System.out.println("All numbers are equal");
        } else {
            if (arr[0] == arr[1]) {
                if (arr[0] > arr[2])
                    System.out.println("Maximum Number is " + arr[0]);
                else
                    System.out.println("Maximum Number is " + arr[2]);
            } else if (arr[1] == arr[2]) {
                if (arr[0] > arr[2])
                    System.out.println("Maximum Number is " + arr[0]);
                else
                    System.out.println("Maximum Number is " + arr[2]);
            } else if (arr[0] == arr[2]) {
                if (arr[1] > arr[2])
                    System.out.println("Maximum Number is " + arr[1]);
                else
                    System.out.println("Maximum Number is " + arr[2]);
            } else if (arr[0] > arr[1] && arr[0] > arr[2]) {
                System.out.println("Maximum Number is " + arr[0]);
            } else if (arr[1] > arr[0] && arr[1] > arr[2]) {
                System.out.println("Maximum Number is " + arr[1]);
            } else {
                System.out.println("Maximum Number is " + arr[2]);
            }
        }

        sc.close();
    }
}