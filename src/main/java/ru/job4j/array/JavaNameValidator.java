package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty() && isLowerCase(name.codePointAt(0))
                                         && !isDigit(name.codePointAt(0));
        if (result) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isSpecialSymbol(code) && !isUpperCase(code) && !isLowerCase(code) && !isDigit(code)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }
}

