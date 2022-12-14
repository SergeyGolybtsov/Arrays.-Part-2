public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index : arr) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задание 2");
        int maxSum = 99_999;
        int minSum = 200_001;
        int[] arr = generateRandomArray();
        for (int index : arr) {
            if (index > maxSum) {
                maxSum = index;
            }
            if (index < minSum) {
                minSum = index;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index : arr) {
            sum += index;
        }
        double averageExpenses = (sum * 1.) / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

    }
    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }

}