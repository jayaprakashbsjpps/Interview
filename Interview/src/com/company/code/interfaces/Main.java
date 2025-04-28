package com.jayaprakash.interfaces;

public class Main {

    public static void main(String[] args) {
        Engine car = new Car();
     //   System.out.println(car.a);

        car.acc();
        //car.brake();
        car.start();
        car.stop();

        Media carMedia = new Car();
        carMedia.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        ElectricEngine electricEngine = new ElectricEngine();
        niceCar.upgradeEngine(electricEngine);
        niceCar.start();

    }
}
