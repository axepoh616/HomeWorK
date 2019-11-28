package HomeWork;

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 0;
        int countPositive = 0;
        int countNegative = 0;
        if (a > 0) {
            countPositive++;
        } else if (a != 0) {
            countNegative++;
        }
        if (b > 0) {
            countPositive++;
        } else if (b != 0) {
            countNegative++;
        }
        if (c > 0) {
            countPositive++;
        } else if (c != 0) {
            countNegative++;
        }
        System.out.println("Positive num =" + countPositive);
        System.out.println("Negative num =" + countNegative);


    }
}
