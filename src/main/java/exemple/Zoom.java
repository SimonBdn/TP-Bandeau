package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{


    public Zoom(){

    }

    @Override
    public void effet(Bandeau bandeau){
        bandeau.setMessage("On va zoomer");
        bandeau.sleep(2000);
        bandeau.setMessage("Simon");
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(200);
        }
        bandeau.sleep(1000);
    }


}
