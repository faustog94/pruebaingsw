package Transporte;


import Transporte.Pasajeros;


public class Auto extends Pasajeros {
    private char combustible='N';

    public char getCombustible() {
        return combustible;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }
    
    @Override
    public void consumo() {
        System.out.println("El consumo del auto es 100 ");
    }

    public Auto(byte cantPasajeros, String matricula, int peso, byte velocidadMax, byte velocidad, byte cantRuedas) {
        super(cantPasajeros, matricula, peso, velocidadMax, velocidad, cantRuedas);
    }

    public Auto(byte cantPasajeros, String matricula, int peso, byte velocidadMax) {
        super(cantPasajeros, matricula, peso, velocidadMax);
    }
    
}
