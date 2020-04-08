package app;

import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro onix = new Carro();
        Carro camaro = new Carro();
        Carro uno = new Carro();
        Moto m = new Moto();
        
        m.ligar();
        onix.ligar();
        camaro.ligar();
        uno.ligar();

        System.out.println("Hello Java");
    }
}