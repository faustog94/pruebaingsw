

package Transporte;


public class ControladorAuto {
    private Auto refAuto;

    public ControladorAuto() {
    }

    public ControladorAuto(Auto refAuto) {
        this.refAuto = refAuto;
    }
    public void Agregar (String matricula, String peso, String velocidadMaxima, String Velocidad, String cantRuedas, String cantPasajeros){
        
        int peso1;
        byte velocidadMaxima1;
        byte Velocidad1;
        byte cantRuedas1;
        byte cantPasajeros1;
        
        peso1 = Integer.parseInt(peso);
        velocidadMaxima1 = Byte.parseByte(velocidadMaxima);
        Velocidad1 = Byte.parseByte(Velocidad);
        cantRuedas1 = Byte.parseByte(cantRuedas);
        cantPasajeros1 = Byte.parseByte(cantPasajeros);
        refAuto = new Auto((byte)cantPasajeros1, matricula , peso1, (byte)velocidadMaxima1, (byte)Velocidad1, (byte)cantRuedas1);
        System.out.println("Pasajeros"+refAuto.getCantPasajeros()+"Matricula"+refAuto.getMatricula()+"Peso"+refAuto.getPeso()+"Velocidad Maxima"+refAuto.getVelocidadMax()+"Velocidad"+refAuto.getVelocidad()+"Camtidad Ruedas"+refAuto.getCantRuedas());
        
        
    }
}
