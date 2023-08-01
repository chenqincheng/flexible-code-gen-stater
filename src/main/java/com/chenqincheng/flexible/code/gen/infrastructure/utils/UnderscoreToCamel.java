package com.chenqincheng.flexible.code.gen.infrastructure.utils;

/**
 * 下划线命名转换为驼峰命名
 */
public class UnderscoreToCamel {

    public static String underscoreToCamel(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Condition_ddd";
        String camelCase = underscoreToCamel(input);
        System.out.println(camelCase);
    }
}
