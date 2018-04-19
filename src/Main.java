import controller.MainController;

public class Main {

    public static void main(String[] args) {
        // Створюємо посилання на головний контроллер та викликаємо методи звідти
        MainController mainController= new MainController();
        mainController.printMotorcycle();
        mainController.printCar();
    }
}
