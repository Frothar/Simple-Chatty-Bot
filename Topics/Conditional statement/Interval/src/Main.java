import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        final int negativeFifteen = -15;
        final int twelve = 12;
        final int fourteen = 14;
        final int seventeen = 17;
        final int nineteen = 19;

        if (number > negativeFifteen && number <= twelve) {
            System.out.println("True");
        } else if (number > fourteen && number < seventeen) {
            System.out.println("True");
        } else if (number >= nineteen) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}