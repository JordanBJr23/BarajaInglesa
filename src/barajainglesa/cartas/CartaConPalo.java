
package barajainglesa.cartas;
import barajainglesa.Palo;


public abstract class CartaConPalo extends Carta {
  private Palo palo;

    public Palo getPalo() {
        return palo;
    }
  

    public CartaConPalo(Palo palo) {
        super(); // El constructor de carta no resive argumentos
        this.palo = palo;
    }

   @Override
     public String getRepresentacion(){
        
        return " de " + palo;
        
    }
   
  
}
