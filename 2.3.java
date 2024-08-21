//Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу, которая выведет в консоль все чётные числа. 

public class EvenNumbers {

    public static void main(String[] args) {
        // Заданный массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Проход по массиву и вывод чётных чисел
        System.out.println("Чётные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {  // Проверка на чётность
                System.out.println(number);
            }
        }
    }
}
