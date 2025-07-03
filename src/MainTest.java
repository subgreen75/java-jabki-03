import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    // 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
    //     * и возвращает сумму всех чисел между ними (включительно)
    @Test
    public void task_1() {
        int startRange=1;
        int endRange=10; // конец диапазона
        Assertions.assertEquals(1+2+3+4+5+6+7+8+9+10,Main.sumRange(startRange,endRange));
        System.out.printf("Сумма чисел от %s до %s = %s%s",startRange,endRange,Main.sumRange(startRange,endRange),System.lineSeparator());
    }

    //2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    @Test
    public void task_2_1() {
        int num1=1;
        int num2=10;
        Assertions.assertEquals(num1+num2,Main.add(num1,num2));
        System.out.printf("%s + %s = %s%s",num1,num2,Main.add(num1,num2),System.lineSeparator());
    }

    @Test
    public void task_2_2() {
        String sampleStringOne="Трали";
        String sampleStringTwo="Валли";
        Assertions.assertEquals(sampleStringOne+sampleStringTwo,Main.add(sampleStringOne,sampleStringTwo));
        System.out.printf("'%s' + '%s' = '%s'%s",sampleStringOne,sampleStringTwo,Main.add(sampleStringOne,sampleStringTwo),System.lineSeparator());
    }


    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    @Test
    public void task_3() {
        int[] lNums={-5,-4,-3,-2,15,0,1,2,3,4,5};
        Assertions.assertEquals(15,Main.findMax(lNums));
        System.out.printf("Максимальное = %s%s",Main.findMax(lNums),System.lineSeparator());
    }

    //4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    @Test
    public void task_4() {
        int num3=5;
        Assertions.assertEquals(1*2*3*4*5,Main.calculateFactorial(num3));
        System.out.printf("%s! = %s%s",num3,Main.calculateFactorial(num3),System.lineSeparator());
    }

    //5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    @Test
    public void task_5() {
        double radius=5.0; // радиус
        double length=2.1; // длина прямоугольника
        double width=2.2; // ширина прямоугольника
        Assertions.assertEquals(Math.PI*Math.pow(radius,2),Main.calculateArea(radius));
        Assertions.assertEquals(length*width,Main.calculateArea(length,width));
        System.out.printf("Площадь круга с радиусом %s = %s%s",radius,Main.calculateArea(radius),System.lineSeparator());
        System.out.printf("Площадь прямоугольника (длина %s, ширина %s) = %s%s",length,width,Main.calculateArea(length,width),System.lineSeparator());

    }

    //6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    @Test
    public void task_6() {
        double num6_1=2.0;
        double num6_2=4.0;
        double num6_3=6.0;
        Assertions.assertEquals((num6_1+num6_2+num6_3)/3,Main.calculateAvg(num6_1,num6_2,num6_3));
        System.out.printf("Среднеарифметическое чисел %s, %s, %s = %s%s",num6_1,num6_2,num6_3,Main.calculateAvg(num6_1,num6_2,num6_3),System.lineSeparator());

    }

    //7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    @Test
    public void task_7() {
        double leg1=2.0; // катет 1
        double leg2=4.0; // катет 2
        Assertions.assertEquals(Math.sqrt(Math.pow(leg1,2)+Math.pow(leg2,2)),Main.calculateHypotenuse(leg1,leg2));
        System.out.printf("Для катетов %s и %s Гипотенуза = %s%s",leg1,leg2,Main.calculateHypotenuse(leg1,leg2),System.lineSeparator());
    }
}