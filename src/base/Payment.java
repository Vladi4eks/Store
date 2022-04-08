package base;

/**
 * @author Kalashnikov Vladislav
 * @version 1.0.0
 */

// Интерфейс платежа
public interface Payment {

    double calcPayment(int quantity, double price);

    double calcPayment(double payment, double discount);
}