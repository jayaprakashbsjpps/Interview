package com.jayaprakash.interfaces;

public class NiceCar {
    private Engine engine;
    private Media music;

    public NiceCar() {
        this.engine = new PowerEngine();
        this.music = new CDPlayer();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();

    }

    public void stop() {
        engine.stop();

    }

    public void startMusic() {
        music.start();
    }

    public void stopMusic() {
        music.start();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }


}
