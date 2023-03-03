package lesson2;

public class MainForLessonTwo {
    public static void main(String[] args) {
        checkSumInRange(5, 4);
        checkSumInRange(6, 6);
        checkSumInRange(10, 11);
        chekPositiveNumber(-1);
        chekPositiveNumber(5);
        chekPositiveNumber(0);
        chekNegativeNumber(-2);
        printStringByCount("TUT STROKA", 5);
        checkYearIsLeap(2023, 4);
    }
    public static boolean checkSumInRange(int a, int b) {
        int result = a + b;

        if( result >= 10 & result <= 20 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void chekPositiveNumber(int a) {
        if (a >= 0) {
            System.out.println(String.format("Num %s is positive", a));
        } else {
            System.out.println(String.format("Num %s is negative", a));
        }
    }

    public static boolean chekNegativeNumber(int a) {
        boolean b = (a >= 0) ? false : true;
        return  b;
    }

    public static void printStringByCount(String str, int count){
        while (count > 0) {
            System.out.println(str);
            count -= 1;
        }
    }

    /** В условии задачи каждый 100-й год невисокосный, соответственно делаем проверку на год 100,200, 1100,1200 и т.д.
     * Каждый 400 год при этом является високосным.
     *
     */
    public static void checkYearIsLeap(int year, int k) {

//        int y = 0;
//        while (y <= year) {
//            y = y + k;
//            System.out.println(String.format("Year is %s", y));
        }
    }
}
