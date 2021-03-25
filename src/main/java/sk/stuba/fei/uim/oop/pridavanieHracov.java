package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

import static sk.stuba.fei.uim.oop.zKlavesnice.readInt;
import static sk.stuba.fei.uim.oop.zKlavesnice.readString;

public class pridavanieHracov {
    public ArrayList<hrac> hraci = new ArrayList<hrac>();

    public pridavanieHracov() {
        pridajVsetkych();
    }

    public void pridajVsetkych(){
        int pocetHracov = readInt();
        int i;
        for(i=1;i<=pocetHracov;i++){
            hraci.add(new hrac(readString()+" "+i));
        }
    }
}
