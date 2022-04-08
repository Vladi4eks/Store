package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

public class Validator {

    // Валидация ввода имени
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("Пусто! Введите имя клиента: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {

        int quantity;
        String str1 = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!%nВведите количество!: ", str);
        }

        quantity = scanner.nextInt();

        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите количество: ");
            while (!scanner.hasNextInt()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - не число!%nВведите количество!: ", str1);
                }
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static double validatePriceInput(Scanner scanner) {

        double price;
        String str1 = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!%nВведите цену!: ", str);
        }

        price = scanner.nextDouble();

        while (price <= 0) {
            System.out.print("Неверное значение! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                try {
                    str1 = scanner.next().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf("\"%s\" - не число!%nВведите цену!: ", str1);
                }
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
