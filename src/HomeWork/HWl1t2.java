package hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("такой треугольник имеет право на существование");
        } else {
            System.out.println("такого треугольника быть не может");
        }
    }
}
