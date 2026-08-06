public class FindPrimeNumber {
    public static void main(String[] args) {
        int n = 10;   // Number of prime numbers to print
        int count = 0;
        int num = 2;

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}
