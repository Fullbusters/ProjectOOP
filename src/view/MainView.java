package view;

import model.Car;
import model.Motorcycle;

public class MainView {

    //TODO гарний вигляд виводу інформації
    public void printCar(Car car){
        System.out.println("Car ="+car.getName());
    }

    public void printMotorcycle(Motorcycle motorcycle){
        System.out.println("MotorcycleController ="+motorcycle.getName());
    }

}
