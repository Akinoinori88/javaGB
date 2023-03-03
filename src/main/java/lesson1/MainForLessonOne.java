package lesson1;

public class MainForLessonOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor(-3);
        printColor(50);
        printColor(101);
        compareNumbers(7, 4);
        compareNumbers(4, 6);
    }
    public static void printThreeWords() {
        String myFruits[];
        myFruits = new String[] { "Orange", "Banana", "Apple" };
        for (String s: myFruits)
            System.out.println(s);
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
