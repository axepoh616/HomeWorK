package HomeWork;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = (int) (Math.random() * 20);
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int a = 0; a < numbers.length; a++) {
            if (a % 2 == 1) {
                numbers[a] = 0;
            }
            System.out.print(numbers[a] + " ");
        }
    }
}
