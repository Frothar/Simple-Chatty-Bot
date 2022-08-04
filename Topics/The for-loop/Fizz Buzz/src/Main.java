import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = scanner.nextInt();
        int end = scanner.nextInt();
        final int zero = 0;
        final int three = 3;
        final int five = 5;

        for (int i = beginning; i <= end; i++) {
            if (i % three == zero && i % five == zero) {
                System.out.println("FizzBuzz");
            } else if (i % three == zero) {
                System.out.println("Fizz");
            } else if (i % five == zero) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}