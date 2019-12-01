package HomeWork;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[15];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = (int) (Math.random() * 100);
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        int count = 0;
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " чётных элементов");


    }
}
