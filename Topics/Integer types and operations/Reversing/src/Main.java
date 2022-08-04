import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        final int ten = 10;
        final int oneHundred = 100;

        int firstDigit = number / oneHundred;
        int secondDigit = number / ten % ten;
        int thirdDigit = number % ten;

        int reversedNumber = thirdDigit * oneHundred + secondDigit * ten + firstDigit;

        System.out.println(reversedNumber);
    }
}