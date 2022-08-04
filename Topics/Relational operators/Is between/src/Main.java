import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        boolean firstChecker = firstNumber >= secondNumber && firstNumber <= thirdNumber;
        boolean secondChecker = firstNumber <= secondNumber && firstNumber >= thirdNumber;

        if (firstChecker || secondChecker) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}