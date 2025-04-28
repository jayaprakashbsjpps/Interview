package com.jayaprakash.abstractDemo;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(31);
        son.carrer();
        son.partner();

        Parent daughter =new Daughter(28);
        daughter.carrer();
        daughter.partner();
        son.normal();
        Parent.hello();
    }
}
