package by.td.epam;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private static   final Scanner scanner = new Scanner(System.in);

    /**
     * Приветствует пользователя по имени.
     */
    public static void greetUser() {

        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

    }

    /**
     * Выводит обратную последовательность цифр введенного числа.
     */
    public static void reverseNumber() {

        System.out.print("Введите число: ");
        int value = scanner.nextInt();
        int reversed = 0;
        while (value != 0) {
            reversed = reversed * 10 + (value % 10);
            value = value / 10;
        }
        System.out.println("Обратная последовательность цифр: " + reversed);

    }

    /**
     * Выводит элементы массива чисел.
     */
    public static void printArrayElements() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
            System.out.print(number);
        }
        System.out.println();
    }

    /**
     * Проверяет введенный пользователем пароль.
     */
    public static void checkPassword() {

        String password = "12345";
        System.out.println("Введите пароль:");
        String inputPassword = scanner.next();
        if (inputPassword.equals(password)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    /**
     * Вычисляет сумму и произведение цифр введенного числа.
     */
    public static void calculateDigits() {

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int product = 1;
        while (number != 0) {
            sum += number % 10;
            product *= number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + product);

    }

    /**
     * Выводит информацию о задании и разработчике.
     */
    public static void printTaskInfo() {

        Date currentDate = new Date();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.next();
        System.out.println("Разработчик " + lastName + " получил задание " + new Date());
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Разработчик " + lastName + " сдал задание " + new Date());

    }

    /**
     * Главный метод программы.
     */
    public static void main(String[] args) {
        greetUser();
        reverseNumber();
        printArrayElements();
        checkPassword();
        calculateDigits();
        printTaskInfo();
        scanner.close();
    }
}














