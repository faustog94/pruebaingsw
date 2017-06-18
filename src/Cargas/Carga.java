package Cargas;


public interface Carga {
    public static final int CARGAMAX=40000;
    public static final char ACOPLADO='A';
    public static final char REMOLQUE='R';
    public static final char SIMPLE='S';
    
    public abstract void cargaTransportada();
    
}
