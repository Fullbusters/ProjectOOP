package controller;

import model.Car;
import model.Engine;
import model.Wheels;
import model.Motorcycle;
import view.MainView;

public class MainController {

    // тут створюємо обєкти для перевірки
    //TODO створення з коавіатури
    Car car = new Car( "Car",100,new Engine("engine2000",120),new Wheels(4,"winter"),"trailer");
    Motorcycle motorcycle = new Motorcycle("MotorcycleController",90,new Engine("engine1000",120),new Wheels(2,"summer"),"carriage");
    MainView mainView = new MainView();

    // виклик методу для виводу машини
    public void printCar(){
        mainView.printCar(this.car);
    }

    // виклик методу для виводу мотоцикла
    public void printMotorcycle(){
        mainView.printMotorcycle(this.motorcycle);
    }
}
