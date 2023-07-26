/**Разработайте программу, которая выбросит Exception, когда пользователь 
вводит пустую строку. Пользователю должно показаться сообщение, что пустые 
строки вводить нельзя.*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            String input = readNonEmptyString();
            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String readNonEmptyString() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите непустую строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя.");
        }

        return input;
    }
}

/**Для решения этой задачи, нужно запросить ввод пользователя с помощью 
класса Scanner, проверить введенную строку на пустоту и, если строка 
пустая, выбросить исключение Exception с соответствующим сообщением.
Используем метод readNonEmptyString(), который вызывается из метода 
main().
В методе readNonEmptyString(), с помощью Scanner, запрашиваем у 
пользователя ввод строки.
Если введенная строка пустая (метод isEmpty() возвращает true), то  
выбрасываем исключение Exception с соответствующим сообщением.
В методе main(), ловим это исключение с помощью блока catch и выводим 
сообщение об ошибке с помощью e.getMessage().
Теперь программа будет просить пользователя ввести непустую строку, и 
если пользователь введет пустую строку, программа выбросит исключение с 
сообщением "Пустые строки вводить нельзя." */
    

