package HomeWork;

public class Main {

    public static void main(String[] args) {
        double a = 10;
        double b = 0;

        for (int c = 1; c <= 7; c++) {
            b = a + b;
            a *= 1.1;
        }
        System.out.println(b);

    }


}

