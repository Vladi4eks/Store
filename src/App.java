/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

public class App {

    public static void main(String[] args) {

        Client model = new Client();
        ClientView view = new ClientView(model);
        ClientController controller = new ClientController(model, view);
        // Запуск программы/приложения
        controller.runApp();
    }
}
