package exemple;

import bandeau.Bandeau;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;

public class FondCouleur extends Effet{


    public FondCouleur(){
    }

    @Override
    public void effet(Bandeau bandeau){
        Font font = bandeau.getFont();
        Color back = bandeau.getBackground();
        Color fore = bandeau.getForeground();
        bandeau.setMessage("Je veux du bleu !");
        bandeau.sleep(1000);
        bandeau.setBackground(Color.BLUE);
        bandeau.setMessage("Je veux du blanc !");
        bandeau.sleep(1000);
        bandeau.setBackground(Color.WHITE);
        bandeau.sleep(1000);
        bandeau.setMessage("Je veux du rouge !");
        bandeau.setBackground(Color.RED);
        bandeau.sleep(1000);
        bandeau.setMessage("La FRANCE");
        bandeau.sleep(4000);
        bandeau.setFont(font);
        bandeau.setForeground(fore);
        bandeau.setBackground(back);
        bandeau.setBackground(Color.WHITE);
    }

}
