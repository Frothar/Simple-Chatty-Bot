import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int firstDigit = scanner.nextInt() / 10;

        System.out.println(firstDigit);

    }
}