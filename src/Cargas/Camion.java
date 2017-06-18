package Cargas;

import Vehiculos.Vehiculo;


public class Camion extends Vehiculo implements Carga {
    private int carga;
    private char tipo;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void cargaTransportada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consumo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Camion(int carga, char tipo, String matricula, int peso, byte velocidadMax) {
        super(matricula, peso, velocidadMax);
        this.carga = carga;
        this.tipo = tipo;
    }

    public Camion(int carga, char tipo, String matricula, int peso, byte velocidadMax, byte velocidad, byte cantRuedas) {
        super(matricula, peso, velocidadMax, velocidad, cantRuedas);
        this.carga = carga;
        this.tipo = tipo;
    }
    
}
