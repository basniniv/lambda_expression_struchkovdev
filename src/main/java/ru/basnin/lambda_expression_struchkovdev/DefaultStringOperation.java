package ru.basnin.lambda_expression_struchkovdev;

public class DefaultStringOperation implements StringOperation {

    @Override
    public void checkLength(String input) {
        if (input.length() > 10) {
            System.out.println("String is too long!");
        } else {
            System.out.println("String length is fine.");
        }
    }

    @Override
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    @Override
    public String replaceCharacters(String input, char oldChar, char newChar) {
        return input.replace('O', '0');
    }
}
