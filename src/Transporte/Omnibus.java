package Transporte;


import Transporte.Pasajeros;

public class Omnibus extends Pasajeros {
    private boolean doblePiso;

    public boolean isDoblePiso() {
        return doblePiso;
    }

    public void setDoblePiso(boolean doblePiso) {
        this.doblePiso = doblePiso;
    }
    
    @Override
    public void consumo() {
        System.out.println("El consumo del omnibus es 1000 litros");
    }

    public Omnibus(boolean doblePiso, byte cantPasajeros, String matricula, int peso, byte velocidadMax, byte velocidad, byte cantRuedas) {
        super(cantPasajeros, matricula, peso, velocidadMax, velocidad, cantRuedas);
        this.doblePiso = doblePiso;
    }

    public Omnibus(boolean doblePiso, byte cantPasajeros, String matricula, int peso, byte velocidadMax) {
        super(cantPasajeros, matricula, peso, velocidadMax);
        this.doblePiso = doblePiso;
    }
    
}
