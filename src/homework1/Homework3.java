package homework1;

public class Homework3 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.print("1) ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("2) " + numbers[0]);
        System.out.println("3) " + numbers[8]);
        System.out.println("4) " + numbers.length);

        int min = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.print("5) " + min);
        System.out.println(" առավելագույնի դեպքում " + max);

        System.out.print("6) ");
        int middle = 0;
        if (numbers.length > 2) {
            middle = (numbers.length - 1) / 2;
            System.out.println(numbers[middle]);
        }
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values.");
        }
        System.out.print("7) ");
        int couple = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                couple = numbers[i];
                System.out.print(couple + " ");
            }
        }
        System.out.println();

        System.out.print("8) ");
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) != 0) {
                odd = numbers[i];
                System.out.print(odd + " ");
            }

        }

        System.out.println();
        int result1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            result1 = result1 + numbers[i];
        }
        System.out.println("9) " + "ինդեկսների գումարը = " + result1);

        double result2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            result2 = result2 + numbers[i];
        }
        System.out.println("10) " + "ինդեկսների միջին թվաբանականը = " + (result2 / numbers.length));
    }
}

