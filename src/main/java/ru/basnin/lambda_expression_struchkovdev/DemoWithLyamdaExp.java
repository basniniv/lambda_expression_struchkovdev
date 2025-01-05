package ru.basnin.lambda_expression_struchkovdev;

public class DemoWithLyamdaExp {
    public static void main(String[] args) {
        String testString = "hello world";

        StringProcessor processor = new StringProcessor();

        // Внедряем проверку длины через лямбда-выражение
        processor.setLengthChecker((input) -> {
            int threshold = 11; // Локальная переменная
            if (input.length() > threshold) {
                System.out.println("String is too long!");
            } else {
                System.out.println("String length is fine.");
            }
            // Возвращаем input после проверки
            return input;
        });

        // Внедряем преобразование в верхний регистр через лямбда-выражение
        processor.setUpperCaseConverter((String input) -> {
            return input.toUpperCase();
        });
        //Упрощен
        processor.setUpperCaseConverter(input -> input.toUpperCase());

        // Внедряем замену символов через лямбда-выражение
        processor.setCharacterReplacer((input, oldChar, newChar) -> input.replace(oldChar, newChar));

        // Используем StringProcessor для выполнения всех операций
        String result = processor.processString(testString);
        System.out.println("Final Result: " + result);


    }
}