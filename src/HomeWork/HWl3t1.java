package HomeWork;

public class Main {

    public static void main(String[] args) {
        int[] horizontal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int a = 1; a <= 20; a += 2) {
            System.out.print(horizontal[a] + " ");
        }
        System.out.println();
        int[] vertical = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int b = 1; b <= 20; b += 2) {
            System.out.println(vertical[b] + " ");

        }

    }
}


