package HomeWork;

public class Main {

    public static void main(String[] args) {
        int sum1 = 0;
        int[] numbers = new int[5];//массив 1
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = (int) (Math.random() * 15);
            sum1 = sum1 + numbers[a];
            System.out.print(+numbers[a] + " ");
        }
        System.out.println();
        int sum2 = 0;
        int[] numbersb = new int[5];//массив 2
        for (int b = 0; b < numbersb.length; b++) {
            numbersb[b] = (int) (Math.random() * 15);
            sum2 = sum2 + numbersb[b];
            System.out.print(numbersb[b] + " ");
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
