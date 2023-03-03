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
        checkYearIsLeap(1200);
//        checkYearIsLeap(1300);
        checkYearIsLeap(64);
        checkYearIsLeap(53);
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

    /** В условии задачи каждый 100-й год невисокосный, соответственно делаем проверку на год 100,200...
     * Если год кратен 400, то считаем его високосным.
     * Каждый 4 год, считаем високосным.
     */
    public static boolean checkYearIsLeap(int year) {
        if (year % 400 == 0) {
            System.out.println(String.format("Year %s is leap", year));
            return true;
        } else if (year % 100 == 0) {
            System.out.println(String.format("Year %s is not leap", year));
            return false;
        } else if (year % 4 == 0) {
            System.out.println(String.format("Year %s is leap", year));
            return true;
        } else {
            System.out.println(String.format("Year %s is not leap", year));
            return false;
        }
    }
}
