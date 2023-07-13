package by.td.epam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Task1
        String name = scan.next();
        System.out.println("Hello " + name);

        // Task2
        int value = scan.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Введите обраную последовательность цыфр: " + mirror);

        // Task3
        int[] numbers = {1, 2, 3, 4, 5};
        for (int x : numbers) {
            System.out.println(x);
            System.out.print(x);
        }

        //Task 4
        String password = ("12345");
        System.out.println("Введите пароль:");
        String chekout = scan.next();
        if (chekout.equals(password)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //Task5
        int number = scan.nextInt();
        int sum =0;
        int com =1;
        while(number!=0){
            sum= sum+number%10;
            number= number/10;
        }
        System.out.println(sum);

        while(number!=0){
            com= com*number%10;
            number=number/10;
        }
        System.out.println(com);



    }


}


