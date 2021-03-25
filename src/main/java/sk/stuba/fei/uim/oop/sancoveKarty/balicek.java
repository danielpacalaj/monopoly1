package sk.stuba.fei.uim.oop.sancoveKarty;

import java.util.ArrayList;

public class balicek {
    public ArrayList<balicek> karty = new ArrayList<balicek>();
    public balicek() {
        zrobBalicek();
    }

    public void zrobBalicek(){
        karty.add(new karta1());
        karty.add(new karta2());
        karty.add(new karta3());
        karty.add(new karta4());
        karty.add(new karta5());
    }
}
