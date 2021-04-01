package lesson2;

public class Lesson_2 {
    public static void main(String[] args) {

        //ex.1
       if (within10And20(10,19)) {
           System.out.println("Within");
       }
       else {
           System.out.println("Out");
       }
       //ex.2
        isPositiveOrNegative(10);
       //ex.3
       if (isNegative(-50)) {
           System.out.println("Отрицательное");
       }
       else {
           System.out.println("Положительное");
       }
       //ex.4
       printWordNTimes(3, "Hello");
       //ex.5
        if (leapYear(2021)) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Non Leap Year");
        }
    }
// 1
    private static boolean within10And20(int a, int b) {

        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
//2
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
//3
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
        return false;}
    }
//4
    public static void printWordNTimes(int n, String s) {
        for (int i = 1; i <= n; i++) {
        System.out.println(s);}
    }
//5
    private static boolean leapYear(int year) {

    if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
        return true;
    }
    else {
        return false;
    }
}
}
