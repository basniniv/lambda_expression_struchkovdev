package ru.basnin.functional_interface;

import java.util.function.*;

public class javaUtilFunctionalInterfacesEx {
    //Системные функциональные интерфейсы примеры
    public static void main(String[] args) {
        /*
        Function<T, R> — преобразование значений
        Интерфейс Function<T, R> описывает функцию, которая принимает аргумент типа T и возвращает результат типа R.
        Этот интерфейс полезен для задач, связанных с преобразованием данных.
         */
        //Пример: Преобразование строки в верхний регистр:

        Function<String, String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("hello"));  // Output: HELLO

        /*
        Predicate<T> — проверка условий
        Predicate<T> представляет собой предикат, проверяющий условие, и возвращает true или false.
        Используется для фильтрации данных или проверок различных условий.
         */
        //Пример: Проверка, превышает ли длина строки 5 символов:

        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println(isLongerThan5.test("hello"));  // Output: false

        /*
        Consumer<T> — выполнение действий без возврата
        Consumer<T> описывает операцию, которая принимает аргумент типа T, но не возвращает результат.
        Это удобно для выполнения побочных действий, таких как вывод на экран или запись в файл.
         */
        //Пример: Логирование строки в консоль:

        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello, World!");  // Output: Hello, World!

        /*
        Supplier<T> — генерация значений
        Supplier<T> — это функция, которая не принимает аргументов, но возвращает значение типа T.
        Он полезен в тех случаях, когда необходимо отложенно генерировать или предоставлять значения.
        */
        //Пример использования: Генерация случайных чисел или получение текущего времени.

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());  // Output: (какое-то случайное число)

        /*
        UnaryOperator<T> — унарные операции
        UnaryOperator<T> — это подтип Function, который принимает и возвращает значения одного типа.
        Он используется для операций, где вход и выход имеют один и тот же тип.
        */
        //Пример использования: Преобразование строки или модификация чисел.

        UnaryOperator<String> toUpperCase1 = s -> s.toUpperCase();
        System.out.println(toUpperCase1.apply("hello"));  // Output: HELLO

        /*
        BinaryOperator<T> — бинарные операции
        BinaryOperator<T> — это подтип BiFunction, который принимает два аргумента одного типа и
        возвращает результат того же типа. Этот интерфейс часто используется для операций над числами
        или другими значениями, где входные параметры и результат имеют один тип.
        */
        //Пример использования: Сложение двух чисел или объединение строк.
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 3));  // Output: 8

        /*
        Если вы работаете с примитивными типами, используйте специализированные интерфейсы,
        такие как DoubleToIntFunction, IntToDoubleFunction, и другие. Они обеспечат большую производительность
        и меньшие затраты на память.

        Если же ваши данные не являются примитивами или вы хотите работать с универсальными типами, используйте
        интерфейс Function<T, R>.
         */
        //Пример использования: Преобразование чисел в строки.
    }
}
