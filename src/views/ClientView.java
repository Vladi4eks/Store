package views;

import models.Client;
import utils.Validator;
import java.util.Scanner;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

public class ClientView {

    Scanner scanner;
    Client model;
    String title;
    String name;
    int quantity;
    double price;

    public ClientView(Client model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите имя клиента: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество: ";
        System.out.print(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.print(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
