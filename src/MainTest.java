import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    int a;
    int b;
    int c;
    String sampleStringOne;
    String sampleStringTwo;
    double d;
    double e;
    double f;

    // 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
    //     * и возвращает сумму всех чисел между ними (включительно)
    @Test
    public void task_1() {
        a = 1;  // начало диапазона
        b = 10; // конец диапазона
        Assertions.assertEquals(1+2+3+4+5+6+7+8+9+10, Main.sumRange(a,b));
        System.out.printf("Сумма чисел от %s до %s = %s%s", a, b, Main.sumRange(a, b), System.lineSeparator());
    }

    //2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    @Test
    public void task_2_1() {
        a = 1;
        c = 10;
        Assertions.assertEquals(a + c, Main.add(a,c));
        System.out.printf("%s + %s = %s%s", a, c, Main.add(a, c), System.lineSeparator());
    }

    @Test
    public void task_2_2() {
        sampleStringOne = "Трали";
        sampleStringTwo = "Валли";
        Assertions.assertEquals("1"+"10", Main.add("1","10"));
        System.out.printf("'%s' + '%s' = '%s'%s",sampleStringOne , sampleStringTwo, Main.add(sampleStringOne, sampleStringTwo), System.lineSeparator());
    }


    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.

    @Test
    public void task_3() {
        int[] lNums = {-5, -4, -3, -2, 15, 0, 1, 2, 3, 4, 5};
        Assertions.assertEquals(15, Main.findMax(lNums));
        System.out.printf("Максимальное = %s%s", Main.findMax(lNums), System.lineSeparator());
    }

    //4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    @Test
    public void task_4() {
        a = 5;
        Assertions.assertEquals(120, Main.calculateFactorial(a));
        System.out.printf("%s! = %s%s", a, Main.calculateFactorial(a), System.lineSeparator());
    }

    //5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    @Test
    public void task_5() {
        d = 5.0; // радиус
        e = 2.1; // длина прямоугольника
        f = 2.2; // ширина прямоугольника
        Assertions.assertEquals(Math.PI * Math.pow(d,2), Main.calculateArea(d));
        Assertions.assertEquals(e * f, Main.calculateArea(e, f));

        System.out.printf("Площадь круга с радиусом %s = %s%s", d, Main.calculateArea(d), System.lineSeparator());
        System.out.printf("Площадь прямоугольника (длина %s, ширина %s) = %s%s", e,f,Main.calculateArea(e,f), System.lineSeparator());

    }

    //6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    @Test
    public void task_6() {
        d = 2.0;
        e = 4.0;
        f = 6.0;
        Assertions.assertEquals((d + e + f) / 3, Main.calculateAvg(d,e,f));


        System.out.printf("Среднеарифметическое чисел %s, %s, %s = %s%s",d,e,f,Main.calculateAvg(d,e,f),System.lineSeparator());

    }

    //7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    @Test
    public void task_7() {
        d = 2.0; // катет 1
        e = 4.0; // катет 2
        Assertions.assertEquals(Math.sqrt( Math.pow(d,2) + Math.pow(e,2)), Main.calculateHypotenuse(d,e));


        System.out.printf("Для катетов %s и %s Гипотенуза = %s%s",d,e,Main.calculateHypotenuse(d, e) ,System.lineSeparator());

    }
}