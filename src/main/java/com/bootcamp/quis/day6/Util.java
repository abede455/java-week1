package com.bootcamp.quis.day6;

import java.text.NumberFormat;
import java.util.Locale;

public class Util {
    private static NumberFormat numberFormatCurrency;

    static {
        numberFormatCurrency = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    }

    public static NumberFormat getCurrencyInstance() {
        return numberFormatCurrency;
    }
}
