package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        char[] codeArray = name.toCharArray();
        if (name.isEmpty()) {
            result = false;
        } else {
            for (int i = 0; i < codeArray.length; i++) {
                int code = name.codePointAt(i);
                if (i == 0 && !isLowerLatinLetter(code)) {
                    result = false;
                    break;
                } else {
                    if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) || isNumber(code)) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return isUpperCase(code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return isLowerCase(code);
    }

    public static boolean isNumber(int code) {
        return isDigit(code);
    }
}

