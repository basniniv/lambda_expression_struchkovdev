package ru.basnin.lambda_expression_struchkovdev;

public class StringProcessor {
    //    // Публичный метод, который выполняет все преобразования
//    public String processString(String input) {
//        // Проверка длины строки
//        if (input.length() > 10) {
//            System.out.println("String is too long!");
//        } else {
//            System.out.println("String length is fine.");
//        }
//
//        // Преобразование строки в верхний регистр
//        String upperCased = input.toUpperCase();
//
//        // Замена символов (заменяем 'O' на '0')
//        return upperCased.replace('O', '0');
//    }


//    private StringOperation stringOperation;
//
//    // Сеттер для внедрения интерфейса StringOperation
//    public void setStringOperation(StringOperation stringOperation) {
//        this.stringOperation = stringOperation;
//    }
//
//    // Публичный метод для обработки строки, использующий внедренные операции
//    public String processString(String input) {
//        stringOperation.checkLength(input); // Проверка длины
//        input = stringOperation.toUpperCase(input); // Преобразование в верхний регистр
//        return stringOperation.replaceCharacters(input, 'O', '0'); // Замена символов
//    }

    private LengthChecker lengthChecker;
    private UpperCaseConverter upperCaseConverter;
    private CharacterReplacer characterReplacer;

    // Сеттеры для установки функциональных интерфейсов
    public void setLengthChecker(LengthChecker lengthChecker) {
        this.lengthChecker = lengthChecker;
    }

    public void setUpperCaseConverter(UpperCaseConverter upperCaseConverter) {
        this.upperCaseConverter = upperCaseConverter;
    }

    public void setCharacterReplacer(CharacterReplacer characterReplacer) {
        this.characterReplacer = characterReplacer;
    }

    // Основной метод, который выполняет все операции
    public String processString(String input) {
        // выполняем проверку длинны
        if (lengthChecker != null) {
            lengthChecker.checkLength(input);
        } else {
            System.out.println("Length checker is not set!");
        }

        // Преобразуем строку в верхний регистр
        if (upperCaseConverter != null) {
            input = upperCaseConverter.toUpperCase(input);
        }

        // Замена символов
        if (characterReplacer != null) {
            input = characterReplacer.replaceCharacters(input, 'O', '0');
        }
        return input; // Возвращаем результат после всех преобразований
    }

}
