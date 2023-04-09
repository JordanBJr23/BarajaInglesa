
package barajainglesa.cartas;


public class CartaJoker extends Carta {
    private boolean aColor;
    
    public CartaJoker(boolean aColor){
        super(); // El constructor de carta no resive argumentos
        this.aColor = aColor;
    }
    
  
    @Override
     public String getRepresentacion(){
        
        return "Joker" + (aColor ? " a Color" : " Blanco y Negro");
        
    }
}
