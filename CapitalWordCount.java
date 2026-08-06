import java.util.Scanner;

class CapitalWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();

        String[] words = line.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        System.out.println("Words starting with capital letter = " + count);

        sc.close();
    }
}