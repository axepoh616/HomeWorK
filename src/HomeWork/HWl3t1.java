package HomeWork;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a + (a + 2);
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int b = 0; b < numbers.length; b++) {
            System.out.println(numbers[b] + " ");
        }
    }
}
