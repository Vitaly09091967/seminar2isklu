/**Реализуйте метод, который запрашивает у пользователя ввод дробного 
числа (типа float), и возвращает введенное значение. Ввод текста вместо 
числа не должно приводить к падению приложения, вместо этого, необходимо 
повторно запросить у пользователя ввод данных.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number;

        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                number = scanner.nextFloat();
                break; // Если ввод успешный, выходим из цикла
            } catch (InputMismatchException e) {
                // Пользователь ввел что-то некорректное, выводим сообщение и очищаем сканнер
                System.out.println("Ошибка ввода. Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Очищаем буфер сканнера
            }
        }

        return number;
    }
}

/** Используем бесконечный цикл while (true), чтобы запрашивать данные
до тех пор, пока пользователь не введет корректное дробное число.
В блоке try, пытаемся считать дробное число с помощью scanner.nextFloat(). 
Если пользователь вводит не число, будет сгенерировано исключение 
InputMismatchException.
В блоке catch, обрабатываем исключение и выводим сообщение о 
некорректном вводе. Затем с помощью scanner.nextLine() очищаем 
буфер сканнера, чтобы избежать зацикливания на некорректных данных.
Теперь метод readFloatFromUser() будет запрашивать у пользователя ввод
дробного числа до тех пор, пока он не введет корректное значение.*/