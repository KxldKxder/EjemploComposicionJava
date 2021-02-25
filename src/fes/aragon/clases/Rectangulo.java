package fes.aragon.clases;

public class Rectangulo {

    private Punto punto;
    private int ancho;
    private int alto;

    //2-3 Jueves 
    public Rectangulo() {
        this.punto = new Punto(10, 10);
        this.ancho = 10;
        this.alto = 10;
    }

    public Rectangulo(Punto punto, int ancho, int alto) {
        this.punto = punto;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "punto=" + punto + ", ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    
    
}
