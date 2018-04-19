package model;

public class Motorcycle extends Transport {
    private String  carriage;

    public Motorcycle(String carriage) {
        this.carriage = carriage;
    }

    public Motorcycle(String name, int speed, Engine engine, Wheels wheels, String carriage) {
        super(name, speed, engine, wheels);
        this.carriage = carriage;
    }

    public String getCarriage() {
        return carriage;
    }

    public void setCarriage(String carriage) {
        this.carriage = carriage;
    }
}
