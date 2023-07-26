/**Дан следующий код, исправьте его там, где требуется (задание 3 
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}*/


import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            // Исправляем обращение к массиву abc
            abc[1] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка деления на ноль или другая арифметическая ошибка!");
        } catch (RuntimeException ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}


/**Метод printSum объявлен с throws FileNotFoundException, но внутри него 
нет кода, который мог бы вызвать это исключение. Можем просто убрать 
throws FileNotFoundException, так как метод не выполняет операций, 
которые могут вызвать это исключение.
В блоке catch есть Throwable, что не является хорошей практикой. 
Лучше использовать конкретные исключения. Можем объединить 
NullPointerException и IndexOutOfBoundsException в один блок 
catch (RuntimeException ex).
В коде происходит обращение к недопустимому индексу массива abc[3], 
что вызовет исключение ArrayIndexOutOfBoundsException. Cледует 
изменить это обращение к массиву или увеличить размер массива, чтобы 
избежать этой ошибки. 
Теперь код исправлен и должен работать без ошибок. Обратите внимание, 
что убрали объявление throws FileNotFoundException из метода printSum, 
объединили NullPointerException и IndexOutOfBoundsException в блок 
catch (RuntimeException ex) и исправили обращение к массиву abc.*/
    

