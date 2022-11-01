package ru.job4j.early;

public class PasswordValidator {

    public static String[] passwords = new String[]{"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() >= 8 && password.length() <= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!isUpperCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLowerCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isCaseInsensitive(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    private static boolean isCaseInsensitive(String password) {
        boolean result = true;
        for (int i = 0; i < passwords.length; i++) {
            if (password.toLowerCase().equals(passwords[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isDigit(String password) {
        boolean result = false;
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            if (Character.isDigit(passwordArray[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean isSpecialSymbol(String password) {
        boolean result = false;
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            if (checkSymbol(passwordArray[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean checkSymbol(int code) {
        return code >= 32 && code <= 47;
    }

    private static boolean isLowerCase(String password) {
        boolean result = false;
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            if (Character.isLowerCase(passwordArray[i])) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean isUpperCase(String password) {
        boolean result = false;
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            if (Character.isUpperCase(passwordArray[i])) {
                result = true;
                break;
            }
        }
        return result;
    }
}


