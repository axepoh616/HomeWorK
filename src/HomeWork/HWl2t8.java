package HomeWork;

public class Main {

    public static void main(String[] args) {

        for (int a = 1; a <= 4; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int c = 1; c <= 4; c++) {
            for (int d = c; d <= 4; d++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
