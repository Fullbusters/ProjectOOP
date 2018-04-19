package model;

public class Transport {
    private String name;
    private int speed;
    private Engine engine;
    private Wheels wheels;

    public Transport() {
    }

    public Transport(String name, int speed, Engine engine, Wheels wheels) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}
