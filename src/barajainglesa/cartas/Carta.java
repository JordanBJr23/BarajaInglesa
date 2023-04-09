package barajainglesa.cartas;

public abstract class Carta {

    private boolean tapada;
    
    public Carta() {
        // Al generar la carta por defecto va a estar tapada
    }

    public boolean isTapada() {
        return tapada;
    }
    
    
    public void darVuelta() {
        tapada = !tapada;
    }
    
    public abstract String getRepresentacion();
    
    public void mostrar() {
        if (tapada) {
            System.out.println("*****************************************");
        } else {
            System.out.println(getRepresentacion());
        }
    }
    
   
    
}
