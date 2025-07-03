public class Main {
    public static void main(String[] args) {
    }

    /**
     * 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
     * и возвращает сумму всех чисел между ними (включительно).
     */
    public static int sumRange(int startNum, int endNum) {
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
     */

    // 2.1. Первый складывает два целых числа
    public static int add(int a, int b) {
        return a + b;
    }


    // 2.2. Второй складывает две строки
    public static String add(String a, String b) {
        return a + b;
    }

    /**
     * 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
     */

    public static int findMax(int[] arrNum) {
        int max = arrNum[0];
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
        }
        return max;
    }

    /**
     * 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
     */
    public static int calculateFactorial(int endNum) {
        int fact = 1;
        for (int i = 1; i <= endNum; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
     */
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateArea(double a, double b) {
        return a * b;
    }

    /**
     * 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
     */
    public static double calculateAvg(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    /**
     * 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
     */
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}