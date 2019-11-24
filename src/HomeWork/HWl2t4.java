package HomeWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = 0;
        for (int D = 0; D < B; D++) {
            C = C + A;
        }
        System.out.println("A*B=" + C);
        //не работает при B<0
    }
}

