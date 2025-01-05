package ru.basnin.functional_interface;

import java.util.function.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class javaUtilFunctionalIntFromChatGPT_mistral {
    public static void main(String[] args) {
        /*
        Function<T, R> — преобразование значений
        Интерфейс Function<T, R> описывает функцию, которая принимает аргумент типа T и возвращает результат типа R.
        Этот интерфейс полезен для задач, связанных с преобразованием данных.
         */
        // Пример: Преобразование строки в верхний регистр:
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("hello"));  // Output: HELLO

        /*
        Predicate<T> — проверка условий
        Predicate<T> представляет собой предикат, проверяющий условие, и возвращает true или false.
        Используется для фильтрации данных или проверок различных условий.
         */
        // Пример: Проверка, превышает ли длина строки 5 символов:
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println(isLongerThan5.test("hello"));  // Output: false

        /*
        Consumer<T> — выполнение действий без возврата
        Consumer<T> описывает операцию, которая принимает аргумент типа T, но не возвращает результат.
        Это удобно для выполнения побочных действий, таких как вывод на экран или запись в файл.
         */
        // Пример: Логирование строки в консоль:
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello, World!");  // Output: Hello, World!

        /*
        Supplier<T> — генерация значений
        Supplier<T> — это функция, которая не принимает аргументов, но возвращает значение типа T.
        Он полезен в тех случаях, когда необходимо отложенно генерировать или предоставлять значения.
        */
        // Пример использования: Генерация случайных чисел или получение текущего времени.
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());  // Output: (какое-то случайное число)

        /*
        UnaryOperator<T> — унарные операции
        UnaryOperator<T> — это подтип Function, который принимает и возвращает значения одного типа.
        Он используется для операций, где вход и выход имеют один и тот же тип.
        */
        // Пример использования: Преобразование строки или модификация чисел.
        UnaryOperator<String> toUpperCase1 = s -> s.toUpperCase();
        System.out.println(toUpperCase1.apply("hello"));  // Output: HELLO

        /*
        BinaryOperator<T> — бинарные операции
        BinaryOperator<T> — это подтип BiFunction, который принимает два аргумента одного типа и возвращает результат того же типа.
        Он используется для операций, где вход и выход имеют один и тот же тип.
        */
        // Пример использования: Сложение двух чисел.
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));  // Output: 8

        /*
        BiFunction<T, U, R> — функция с двумя аргументами
        BiFunction<T, U, R> принимает два аргумента разных типов и возвращает результат третьего типа.
        Этот интерфейс полезен для операций, где результат зависит от двух входных значений.
        */
        // Пример использования: Объединение двух строк с разделителем.
        BiFunction<String, String, String> concatenate = (a, b) -> a + " " + b;
        System.out.println(concatenate.apply("Hello", "World"));  // Output: Hello World

        /*
        BiConsumer<T, U> — выполнение действий с двумя аргументами
        BiConsumer<T, U> описывает операцию, которая принимает два аргумента разных типов, но не возвращает результат.
        Это удобно для выполнения побочных действий, таких как вывод на экран или запись в файл.
        */
        // Пример использования: Логирование двух значений.
        BiConsumer<String, Integer> log = (s, i) -> System.out.println(s + " " + i);
        log.accept("Value", 100);  // Output: Value 100

        /*
        BiPredicate<T, U> — проверка условий с двумя аргументами
        BiPredicate<T, U> представляет собой предикат, проверяющий условие с двумя аргументами, и возвращает true или false.
        Используется для фильтрации данных или проверок различных условий.
        */
        // Пример использования: Проверка, больше ли первое число второго.
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(7, 5));  // Output: true

        /*
        BooleanSupplier — генерация логических значений
        BooleanSupplier — это функция, которая не принимает аргументов, но возвращает логическое значение.
        Он полезен в тех случаях, когда необходимо отложенно генерировать или предоставлять логические значения.
        */
        // Пример использования: Генерация случайного логического значения.
        BooleanSupplier randomBooleanSupplier = () -> Math.random() > 0.5;
        System.out.println(randomBooleanSupplier.getAsBoolean());  // Output: true или false

        /*
        DoubleFunction<R> — функция с аргументом типа double
        DoubleFunction<R> принимает аргумент типа double и возвращает результат типа R.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа double.
        */
        // Пример использования: Преобразование double в строку.
        DoubleFunction<String> doubleToString = d -> Double.toString(d);
        System.out.println(doubleToString.apply(3.14));  // Output: 3.14

        /*
        DoubleToIntFunction — функция с аргументом типа double и результатом типа int
        DoubleToIntFunction принимает аргумент типа double и возвращает результат типа int.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа double.
        */
        // Пример использования: Преобразование double в int.
        DoubleToIntFunction doubleToInt = d -> (int) d;
        System.out.println(doubleToInt.applyAsInt(3.14));  // Output: 3

        /*
        DoubleToLongFunction — функция с аргументом типа double и результатом типа long
        DoubleToLongFunction принимает аргумент типа double и возвращает результат типа long.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа double.
        */
        // Пример использования: Преобразование double в long.
        DoubleToLongFunction doubleToLong = d -> (long) d;
        System.out.println(doubleToLong.applyAsLong(3.14));  // Output: 3

        /*
        DoubleUnaryOperator — унарные операции с double
        DoubleUnaryOperator принимает и возвращает значения типа double.
        Он используется для операций, где вход и выход имеют тип double.
        */
        // Пример использования: Умножение double на 2.
        DoubleUnaryOperator doubleMultiply = d -> d * 2;
        System.out.println(doubleMultiply.applyAsDouble(3.14));  // Output: 6.28

        /*
        DoubleBinaryOperator — бинарные операции с double
        DoubleBinaryOperator принимает два аргумента типа double и возвращает результат типа double.
        Он используется для операций, где вход и выход имеют тип double.
        */
        // Пример использования: Сложение двух double.
        DoubleBinaryOperator doubleAdd = (a, b) -> a + b;
        System.out.println(doubleAdd.applyAsDouble(3.14, 2.71));  // Output: 5.85

        /*
        DoubleConsumer — выполнение действий с аргументом типа double
        DoubleConsumer описывает операцию, которая принимает аргумент типа double, но не возвращает результат.
        Это удобно для выполнения побочных действий, таких как вывод на экран или запись в файл.
        */
        // Пример использования: Логирование double.
        DoubleConsumer printDouble = d -> System.out.println(d);
        printDouble.accept(3.14);  // Output: 3.14

        /*
        DoublePredicate — проверка условий с аргументом типа double
        DoublePredicate представляет собой предикат, проверяющий условие с аргументом типа double, и возвращает true или false.
        Используется для фильтрации данных или проверок различных условий.
        */
        // Пример использования: Проверка, больше ли double нуля.
        DoublePredicate isPositive = d -> d > 0;
        System.out.println(isPositive.test(3.14));  // Output: true

        /*
        IntFunction<R> — функция с аргументом типа int
        IntFunction<R> принимает аргумент типа int и возвращает результат типа R.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа int.
        */
        // Пример использования: Преобразование int в строку.
        IntFunction<String> intToString = i -> Integer.toString(i);
        System.out.println(intToString.apply(42));  // Output: 42

        /*
        IntToDoubleFunction — функция с аргументом типа int и результатом типа double
        IntToDoubleFunction принимает аргумент типа int и возвращает результат типа double.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа int.
        */
        // Пример использования: Преобразование int в double.
        IntToDoubleFunction intToDouble = i -> (double) i;
        System.out.println(intToDouble.applyAsDouble(42));  // Output: 42.0

        /*
        IntToLongFunction — функция с аргументом типа int и результатом типа long
        IntToLongFunction принимает аргумент типа int и возвращает результат типа long.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа int.
        */
        // Пример использования: Преобразование int в long.
        IntToLongFunction intToLong = i -> (long) i;
        System.out.println(intToLong.applyAsLong(42));  // Output: 42

        /*
        IntUnaryOperator — унарные операции с int
        IntUnaryOperator принимает и возвращает значения типа int.
        Он используется для операций, где вход и выход имеют тип int.
        */
        // Пример использования: Умножение int на 2.
        IntUnaryOperator intMultiply = i -> i * 2;
        System.out.println(intMultiply.applyAsInt(42));  // Output: 84

        /*
        IntBinaryOperator — бинарные операции с int
        IntBinaryOperator принимает два аргумента типа int и возвращает результат типа int.
        Он используется для операций, где вход и выход имеют тип int.
        */
        // Пример использования: Сложение двух int.
        IntBinaryOperator intAdd = (a, b) -> a + b;
        System.out.println(intAdd.applyAsInt(21, 21));  // Output: 42

        /*
        IntConsumer — выполнение действий с аргументом типа int
        IntConsumer описывает операцию, которая принимает аргумент типа int, но не возвращает результат.
        Это удобно для выполнения побочных действий, таких как вывод на экран или запись в файл.
        */
        // Пример использования: Логирование int.
        IntConsumer printInt = i -> System.out.println(i);
        printInt.accept(42);  // Output: 42

        /*
        IntPredicate — проверка условий с аргументом типа int
        IntPredicate представляет собой предикат, проверяющий условие с аргументом типа int, и возвращает true или false.
        Используется для фильтрации данных или проверок различных условий.
        */
        // Пример использования: Проверка, больше ли int нуля.
        IntPredicate isPositiveInt = i -> i > 0;
        System.out.println(isPositiveInt.test(42));  // Output: true

        /*
        LongFunction<R> — функция с аргументом типа long
        LongFunction<R> принимает аргумент типа long и возвращает результат типа R.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа long.
        */
        // Пример использования: Преобразование long в строку.
        LongFunction<String> longToString = l -> Long.toString(l);
        System.out.println(longToString.apply(42L));  // Output: 42

        /*
        LongToDoubleFunction — функция с аргументом типа long и результатом типа double
        LongToDoubleFunction принимает аргумент типа long и возвращает результат типа double.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа long.
        */
        // Пример использования: Преобразование long в double.
        LongToDoubleFunction longToDouble = l -> (double) l;
        System.out.println(longToDouble.applyAsDouble(42L));  // Output: 42.0

        /*
        LongToIntFunction — функция с аргументом типа long и результатом типа int
        LongToIntFunction принимает аргумент типа long и возвращает результат типа int.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа long.
        */
        // Пример использования: Преобразование long в int.
        LongToIntFunction longToInt = l -> (int) l;
        System.out.println(longToInt.applyAsInt(42L));  // Output: 42

        /*
        LongUnaryOperator — унарные операции с long
        LongUnaryOperator принимает и возвращает значения типа long.
        Он используется для операций, где вход и выход имеют тип long.
        */
        // Пример использования: Умножение long на 2.
        LongUnaryOperator longMultiply = l -> l * 2;
        System.out.println(longMultiply.applyAsLong(42L));  // Output: 84

        /*
        LongBinaryOperator — бинарные операции с long
        LongBinaryOperator принимает два аргумента типа long и возвращает результат типа long.
        Он используется для операций, где вход и выход имеют тип long.
        */
        // Пример использования: Сложение двух long.
        LongBinaryOperator longAdd = (a, b) -> a + b;
        System.out.println(longAdd.applyAsLong(21L, 21L));  // Output: 42

        /*
        LongConsumer — выполнение действий с аргументом типа long
        LongConsumer описывает операцию, которая принимает аргумент типа long, но не возвращает результат.
        Это удобно для выполнения побочных действий, таких как вывод на экран или запись в файл.
        */
        // Пример использования: Логирование long.
        LongConsumer printLong = l -> System.out.println(l);
        printLong.accept(42L);  // Output: 42

        /*
        LongPredicate — проверка условий с аргументом типа long
        LongPredicate представляет собой предикат, проверяющий условие с аргументом типа long, и возвращает true или false.
        Используется для фильтрации данных или проверок различных условий.
        */
        // Пример использования: Проверка, больше ли long нуля.
        LongPredicate isPositiveLong = l -> l > 0;
        System.out.println(isPositiveLong.test(42L));  // Output: true

        /*
        ToIntFunction<T> — функция с аргументом типа T и результатом типа int
        ToIntFunction<T> принимает аргумент типа T и возвращает результат типа int.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа T.
        */
        // Пример использования: Преобразование строки в длину строки.
        ToIntFunction<String> stringLength = s -> s.length();
        System.out.println(stringLength.applyAsInt("hello"));  // Output: 5

        /*
        ToDoubleFunction<T> — функция с аргументом типа T и результатом типа double
        ToDoubleFunction<T> принимает аргумент типа T и возвращает результат типа double.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа T.
        */
        // Пример использования: Преобразование строки в double.
        ToDoubleFunction<String> stringToDouble = s -> Double.parseDouble(s);
        System.out.println(stringToDouble.applyAsDouble("3.14"));  // Output: 3.14

        /*
        ToLongFunction<T> — функция с аргументом типа T и результатом типа long
        ToLongFunction<T> принимает аргумент типа T и возвращает результат типа long.
        Этот интерфейс полезен для операций, где результат зависит от входного значения типа T.
        */
        // Пример использования: Преобразование строки в long.
        ToLongFunction<String> stringToLong = s -> Long.parseLong(s);
        System.out.println(stringToLong.applyAsLong("42"));  // Output: 42

        /*
        Comparator<T> — сравнение объектов
        Comparator<T> используется для сравнения объектов. Он принимает два аргумента типа T и возвращает int,
        который указывает, является ли первый аргумент меньше, равен или больше второго.
        */
        // Пример использования: Сравнение строк по длине.
        Comparator<String> compareByLength = (a, b) -> Integer.compare(a.length(), b.length());
        List<String> strings = List.of("apple", "banana", "cherry");
        strings.sort(compareByLength);
        System.out.println(strings);  // Output: [apple, cherry, banana]
          /*
        Если вы работаете с примитивными типами, используйте специализированные интерфейсы,
        такие как DoubleToIntFunction, IntToDoubleFunction, и другие. Они обеспечат большую производительность
        и меньшие затраты на память.

        Если же ваши данные не являются примитивами или вы хотите работать с универсальными типами, используйте
        интерфейс Function<T, R>.
         */
    }
}

