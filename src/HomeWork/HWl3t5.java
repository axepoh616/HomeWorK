package HomeWork;

public class Main {

    public static void main(String[] args) {
        int sum1 = 0;
        int[] numbers1 = new int[5];//массив 1
        for (int a = 0; a < numbers1.length; a++) {
            numbers1[a] = (int) (Math.random() * 15);
            sum1 = sum1 + numbers1[a];
            System.out.print(numbers1[a] + " ");
        }
        System.out.println();
        int sum2 = 0;
        int[] numbers2 = new int[5];//массив 2
        for (int b = 0; b < numbers2.length; b++) {
            numbers2[b] = (int) (Math.random() * 15);
            sum2 = sum2 + numbers2[b];
            System.out.print(numbers2[b] + " ");
        }
        System.out.println();
        if (sum1 > sum2) {
            System.out.println("сумма чисел первого массива больше");
        } else if (sum1 < sum2) {
            System.out.println("сумма чисел второго массива больше");
        } else {
            System.out.println("сумма чисел массивов равна");
        }


    }
}

