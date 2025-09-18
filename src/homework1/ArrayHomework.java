package homework1;

public class ArrayHomework {
    public static void main(String[] args) {
        int n = 6;

        int quantity = 0;
        int[] numbers = {7, 8, 6, 4, 6, 5, 9, 16, 18, 25};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                quantity++;
            }
        }
        System.out.println(n + "-ից կա " + quantity + " հատ");

        int opposite = numbers[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            opposite = numbers[i];
            System.out.print(opposite + " ");
        }
        System.out.println();
        int[] recurring = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5,};
        int equivalent = 0;
        for (int i = 0; i < recurring.length - 1; i++) {
            if (recurring[i] == recurring[i + 1]) {
                equivalent++;
            }
        }
        System.out.println(equivalent);
        int too = 0;
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowel = {'ա', 'ե', 'է', 'ի', 'ո', ('ո' + 'ւ'), 'և', 'օ',};
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (vowel[j] == chars[i]) {
                    too++;
                }
            }
        }
        System.out.println(too);
    }
}
