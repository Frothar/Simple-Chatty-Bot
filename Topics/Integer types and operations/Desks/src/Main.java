import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int firstNumber = firstGroup % 2 + firstGroup / 2;
        int secondNumber = secondGroup % 2 + secondGroup / 2;
        int thirdNumber = thirdGroup % 2 + thirdGroup / 2;

        int desks = firstNumber + secondNumber + thirdNumber;

        System.out.println(desks);

    }
}