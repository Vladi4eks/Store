package utils;

import java.text.DecimalFormat;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

public class Rounder {

    // Округление значения по шаблону
    public static String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
