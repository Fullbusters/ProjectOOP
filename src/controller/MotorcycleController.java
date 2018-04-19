package controller;

public class MotorcycleController extends AbstractTransport {

    // метод який має ту саму назву але різну реалізацію для них
    @Override
    public void addonsToTransport() {
        System.out.println("Cat add-ons is carriage");
    }
}
