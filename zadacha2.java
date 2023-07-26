/**Если необходимо, исправьте данный код (задание 2 
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}*/


try {
    int d = 0;
    if (d != 0) {
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } else {
        System.out.println("Нельзя делить на ноль.");
    }
} catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
}

/**В предоставленном коде проблема заключается в том, что деление на ноль 
(переменная d равна 0) вызывает исключение ArithmeticException. Ошибка 
возникает в строке double catchedRes1 = intArray[8] / d;, где программа 
пытается выполнить деление на ноль.
Для исправления кода, можно включить проверку на ноль до выполнения 
операции деления. Если знаем, что деление на ноль может произойти, лучше 
предварительно обработать этот случай, чтобы избежать возникновения 
исключения. 
Теперь перед делением проверяем, что значение переменной d не равно нулю. 
Если d равно нулю, то выводим сообщение о том, что деление на ноль 
невозможно. В противном случае, происходит деление как раньше. Это поможет 
избежать исключения при делении на ноль и обеспечит более безопасное 
выполнение программы.*/

    

