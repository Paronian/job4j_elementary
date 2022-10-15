package ru.job4j.array;

import static java.lang.Character.*;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        char[] codeArray = name.toCharArray();
        if (name.isEmpty() || name.codePointAt(0) < 97
                || name.codePointAt(0) > 122) {
            result = false;
        } else {
            for (int i = 0; i < codeArray.length; i++) {
                int code = name.codePointAt(i);
                if (code < 36 || (code > 36 && code < 48)
                        || (code > 57 && code < 65)
                        || (code > 90 && code < 95)
                        || (code > 95 && code < 97)
                        || code > 122) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}

