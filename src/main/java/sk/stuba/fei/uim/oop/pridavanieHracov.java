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
        System.out.println("Zadajte pocet hracov!");
        int pocetHracov = readInt();
        int i;
        for(i=1;i<=pocetHracov;i++){
            hraci.add(new hrac(readString("Zadajte meno "+i+" hraca")));
        }

    }

    /*public ArrayList<hrac> getHraci() {
        return hraci;
    }

    public void setHraci(ArrayList<hrac> hraci) {
        this.hraci = hraci;
    }

     */
}
