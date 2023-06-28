public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }


    public static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма всех выплат составила: " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = generateRandomArray();
        int minPayout = array[0];
        int maxPayout = array[0];
        for (int payout : array) {
            if (payout > maxPayout) {
                maxPayout = payout;
            }
            if (payout < minPayout) {
                minPayout = payout;
            }
        }
        System.out.println(maxPayout);
        System.out.println(minPayout);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = generateRandomArray();
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double avgPayout = sum / array.length;
        System.out.printf("Средняя сумма трат за месяц составила: %.2f", avgPayout);
        System.out.println(" рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            }
        }
    }