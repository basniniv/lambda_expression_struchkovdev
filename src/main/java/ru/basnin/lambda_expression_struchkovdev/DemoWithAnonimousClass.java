package ru.basnin.lambda_expression_struchkovdev;

public class DemoWithAnonimousClass {
    public static void main(String[] args) {
////        StringProcessor processor = new StringProcessor();
////        String testString = "hello world";
////
////        System.out.println(processor.processString(testString));
//
//        StringProcessor processor = new StringProcessor();
//        DefaultStringOperation operations = new DefaultStringOperation();
//
//        // Внедряем операции в StringProcessor через сеттер
//        processor.setStringOperation(operations);
//
//        String testString = "hello world";
//        String result = processor.processString(testString);
//
//        System.out.println("Result: " + result);

        //*************************************************************************************

//        StringProcessor processor = new StringProcessor();
//        String testString = "hello world";
//
//        // Анонимный класс с собственной конфигурацией порога
//        StringOperation customLengthCheck = new StringOperation() {
//            private int threshold = 7; // Порог длины строки
//
//            @Override
//            public void checkLength(String input) {
//
//                if (input.length() > threshold) {
//                    System.out.println("String is too long!");
//                } else {
//                    System.out.println("String length is fine.");
//                }
//            }
//
//            @Override
//            public String toUpperCase(String input) {
//                return input.toUpperCase();
//            }
//
//            @Override
//            public String replaceCharacters(String input, char oldChar, char newChar) {
//                return input.replace(oldChar, newChar);
//            }
//        };
//
//        // Внедрение анонимного класса через сеттер
//        processor.setStringOperation(customLengthCheck);
//
//        // Использование StringProcessor c измененной логикой
//        String rusult = processor.processString(testString);
//        System.out.println("Rusult: " + rusult);
        String testString = "hello world";

        StringProcessor processor = new StringProcessor();

        // Внедряем проверку длинны через анонимный класс
        processor.setLengthChecker(new LengthChecker() {
            private int threshold = 11;

            @Override
            public String checkLength(String input) {
                if (input.length() > threshold) {
                    System.out.println("String is too long!");
                } else {
                    System.out.println("String length is fine");
                }
                return input;
            }

        });

        // Внедряем преобразование в верхний регистр
        processor.setUpperCaseConverter(new UpperCaseConverter() {
            @Override
            public String toUpperCase(String input) {
                return input.toUpperCase();
            }
        });

        // Внедряем замену символа
        processor.setCharacterReplacer(new CharacterReplacer() {
            @Override
            public String replaceCharacters(String input, char oldChar, char newChar) {
                return input.replace(oldChar, newChar);
            }
        });

        // Используем StringProcessor для обработки строки
        String result = processor.processString(testString);
        System.out.println("Result: " + result);
    }
}