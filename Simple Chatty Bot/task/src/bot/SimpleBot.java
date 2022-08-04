package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet() {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");

        final int numberOfQuestions = 1;
        String firstQuestion = "Why do we use methods?";
        String firstAnswer = "To repeat a statement multiple times.";
        String secondAnswer = "To decompose a program into several small subroutines.";
        String thirdAnswer = "To determine the execution time of a program.";
        String fourthAnswer = "To interrupt the execution of a program.";

        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println(firstQuestion);
            for (int j = 1; j <= 4; j++) {
                if (j == 1) {
                    System.out.println(j + ". " + firstAnswer);
                } else if (j == 2) {
                    System.out.println(j + ". " + secondAnswer);
                } else if (j == 3) {
                    System.out.println(j + ". " + thirdAnswer);
                } else {
                    System.out.println(j + ". " + fourthAnswer);
                }
            }
            int answer = scanner.nextInt();
            for (int k = 0; answer == 2; k++) {
                System.out.println("Please, try again.");
            }
        }
    }
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
