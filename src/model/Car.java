package model;

public class Car extends Transport {
    private String trailer;

    public Car(String trailer) {
        this.trailer = trailer;
    }

    public Car(String name, int speed, Engine engine, Wheels wheels, String trailer) {
        super(name, speed, engine, wheels);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }


}
