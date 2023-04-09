
package barajainglesa.cartas;

import barajainglesa.Palo;

public class CartaFigura extends CartaConPalo {
    private char figura;

    public CartaFigura(char figura, Palo palo) {
        super(palo);
        this.figura = figura;
    }

    @Override
        public String getRepresentacion(){
        
        return figura + super.getRepresentacion();
        
    }
    
}
