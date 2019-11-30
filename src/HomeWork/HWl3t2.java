public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[99];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a + 1;
            System.out.print(numbers[a] + " ");
        }
        System.out.println();
        for (int b = 98; b >= 0; b--) {
            System.out.print(numbers[b] + " ");
        }
    }
}
