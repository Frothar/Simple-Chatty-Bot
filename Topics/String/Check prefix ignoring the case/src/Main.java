import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean startsWith = input.startsWith("J") || input.startsWith("j");

        System.out.println(startsWith);
    }
}