package homework1;

public class Homework1 {

    public static void main(String[] args) {

        int n = 3;
        int x = 10;
        int y = 20;

        System.out.println("խնդիր 1");

        if (x < y) {
            System.out.println("x-ը փոքր է y-ից");
        }

        x = 30;

        if (x > y) {
            System.out.println("x-ը մեծ է y-ից");
        }
        System.out.println("խնդիր 2");

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("խնդիր 3");
        int a = 5, b = 7;
        System.out.println("a + b = " + (a + b));

        System.out.println("խնդիր 4");

        for (int k = 1; k < 11; k++) {
            System.out.println("3 * " + k + " = " + (n * k));
        }
    }
}
