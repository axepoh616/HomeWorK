package HomeWork;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = (int) (Math.random() * 10);
            System.out.print(numbers[a] + " ");
        }
        int count = 0;
        for (int a = 0; a < numbers.length - 1; a++)
            if (numbers[a] >= numbers[a + 1]) {
                count = 1;
                break;
            }
        if (count == 1) {
            System.out.println("числа в рандомной последовательности");
        } else {
            System.out.println("возрастающая последовательность");
        }
    }
}
