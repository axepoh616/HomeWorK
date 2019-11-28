package HomeWork;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;
        numbers[5] = 12;
        numbers[6] = 14;
        numbers[7] = 16;
        numbers[8] = 18;
        numbers[9] = 20;

        for (int a = 1; a < numbers.length; a++) {
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int b = 1; b < numbers.length; b++) {
            System.out.println(numbers[b] + " ");
        }

    }
}


