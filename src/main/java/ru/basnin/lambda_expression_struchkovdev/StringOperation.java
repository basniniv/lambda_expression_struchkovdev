package ru.basnin.lambda_expression_struchkovdev;

public interface StringOperation {

    // Проверка длины строки
    void checkLength(String input);

    // Преобразование строки в верхний регистр
    String toUpperCase(String input);

    // Замена подстрок
    String replaceCharacters(String input, char oldChar, char newChar);

}
