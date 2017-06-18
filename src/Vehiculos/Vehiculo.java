package Vehiculos;


public abstract class Vehiculo {
    protected final String matricula;
    protected final int peso;
    protected final byte velocidadMax;
    protected byte velocidad;
    protected byte cantRuedas;

    public byte getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(byte velocidad) {
        this.velocidad = velocidad;
    }

    public byte getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(byte cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public Vehiculo(String matricula, int peso, byte velocidadMax) {
        this.matricula = matricula;
        this.peso = peso;
        this.velocidadMax = velocidadMax;
    }

    public Vehiculo(String matricula, int peso, byte velocidadMax, byte velocidad, byte cantRuedas) {
        this.matricula = matricula;
        this.peso = peso;
        this.velocidadMax = velocidadMax;
        this.velocidad = velocidad;
        this.cantRuedas = cantRuedas;
    }
    public abstract void consumo();

    public String getMatricula() {
        return matricula;
    }

    public int getPeso() {
        return peso;
    }

    public byte getVelocidadMax() {
        return velocidadMax;
    }
    
}
