package ru.basnin.lambda_expression_struchkovdev;

@FunctionalInterface
public interface CharacterReplacer {
    String replaceCharacters(String input, char oldChar, char newChar);
}
