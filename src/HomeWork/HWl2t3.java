package HomeWork;


public class Main {

    public static void main(String[] args) {
        int a;
        int b = 0;
        for (a = 1; a <= 256; a *= 2) {
            b += a;
            System.out.println(b);
        }
    }
}
