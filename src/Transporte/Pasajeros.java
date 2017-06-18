package Transporte;

import Vehiculos.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fausto
 */
public abstract class Pasajeros extends Vehiculo {
    protected byte cantPasajeros;

    public byte getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(byte cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public Pasajeros(byte cantPasajeros, String matricula, int peso, byte velocidadMax, byte velocidad, byte cantRuedas) {
        super(matricula, peso, velocidadMax, velocidad, cantRuedas);
        this.cantPasajeros = cantPasajeros;
    }

    public Pasajeros(byte cantPasajeros, String matricula, int peso, byte velocidadMax) {
        super(matricula, peso, velocidadMax);
        this.cantPasajeros = cantPasajeros;
    }
    
}
