package fes.aragon.clases.test;

import fes.aragon.clases.Punto;
import fes.aragon.clases.Rectangulo;

public class TestComposicion {
    public static void main(String[] args) {
        Rectangulo recUno = new Rectangulo();
        System.out.println(recUno.toString());
        Rectangulo recDOs = new Rectangulo(new Punto(30,20),40,10);
        Punto puntoUno = new Punto(10,10);
        Rectangulo recTres = new Rectangulo(puntoUno, 40, 40);
    }
}
