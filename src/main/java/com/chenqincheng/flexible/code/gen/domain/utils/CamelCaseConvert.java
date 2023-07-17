package com.chenqincheng.flexible.code.gen.domain.utils;

/**
 * 将驼峰命名法转换成短横线命名
 */
public class CamelCaseConvert {

    public static String camelToHyphen(String str) {
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append("-");
            }
            sb.append(Character.toLowerCase(c));
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String camelCase = "thisIsCamelCase";
        String hyphenCase = camelToHyphen(camelCase);
        System.out.println(hyphenCase);
    }

}
