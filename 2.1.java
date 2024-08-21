//Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

//Решение



import java.util.Scanner;

public class CompareAndOperate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод первого числа
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        // Запрос на ввод второго числа
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение двух чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами и вывод результатов
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (b != 0) ? (double) a / b : Double.NaN;  // Проверка на деление на ноль

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);

        // Вывод результата деления, если b не равно 0
        if (b != 0) {
            System.out.println("Частное: " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        scanner.close();
    }
}
