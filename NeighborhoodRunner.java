import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    PokemonPainter luke = new PokemonPainter();


    //String input controls background color
    //Paints solid color background over back outline
    luke.paintCharmanderOutline("lavenderBlush");

    //Paints eye
    //Sting input controls eye color
    luke.paintCharmanderEye("black");

    //Colors in the outline
    //String input controls primary color
    luke.colorCharmander("orange");
  }
}