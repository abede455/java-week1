package com.bootcamp.quis.day2;

public class Problem3 {
    public static void main(String[] args) {
        String[] arrayString = capitalizeExcept(new String[] { "code", "id", "bootcamp", "axa", "mandiri" }, "mandiri");
        for (String string : arrayString) {
            System.out.println(string);
        }

    }

    public static String[] capitalizeExcept(String[] arrayStrings, String string) {
        for (int i = 0; i < arrayStrings.length; i++) {
            if (!arrayStrings[i].equals(string)) {
                arrayStrings[i] = Problem2.capitalize(arrayStrings[i]);
            }
        }
        return arrayStrings;
    }
}
