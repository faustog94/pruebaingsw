package Main;


import Vehiculos.Vehiculo;
import Transporte.Auto;
import Cargas.Camion;


public class Ejercicio4Clase {
    public static void main (String[] args){
        Auto a1= new Auto((byte)4, "AA2", 3599, (byte)100);
        Auto a2= new Auto((byte)3, "OMH831", 2500, (byte)110, (byte)60,(byte)4);
        Camion cam1=new Camion(15000, 'A', "BKE999", 8000, (byte)90, (byte)70, (byte)8);
        System.out.println("Es un"+a2.getClass().getName()+"\n Su patente es: "+a2.getMatricula()+"\nLa velocidad  que levanta es de "+a2.getVelocidad()+"\n Velocidad Máxima de: "+((Vehiculo)a2).getVelocidadMax());
        
    }
}
