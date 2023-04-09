package barajainglesa;

import barajainglesa.cartas.*;

import java.util.ArrayList;

public class BarajaInglesa {

    ArrayList<Carta> baraja;

    public BarajaInglesa() {
        baraja = new ArrayList<>();
        generarCartas();
    }
    
    public void darVueltaBaraja(){
        for (Carta carta : baraja) {
            carta.darVuelta();
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            carta.mostrar();
        }
    }

    private void generarCartas() {
      generarCartasNumerales();
      generarCartasFigura();
      generarJokers();
    }
    
   private void generarCartasNumerales(){
      final int  MIN_VALOR = 2;
      final int  MAX_VALOR = 10;
      Palo palos[] = Palo.values();
      
        for (int i = 0; i < palos.length ; i++) {
            Palo paloActual = palos[i];
            for (int j = MIN_VALOR; j <= MAX_VALOR; j++) {
                CartaNumeral cartaActula = new CartaNumeral( j , paloActual);
                baraja.add(cartaActula);
            }
            
        }
    }
    
    private void generarCartasFigura(){
        char figuras[] = {'A', 'J', 'Q', 'K'};
        Palo palos[] = Palo.values();
        for (int i = 0; i < figuras.length; i++) {
            char figuraActual = figuras[i];
            for (int j = 0; j < palos.length; j++) {
                Palo actual = palos[j];
                baraja.add(new CartaFigura(figuraActual,actual));
            }
            
        }
        
        
    }
    private void generarJokers(){
        baraja.add(new CartaJoker(true));
        baraja.add(new CartaJoker(false));
    }
}
