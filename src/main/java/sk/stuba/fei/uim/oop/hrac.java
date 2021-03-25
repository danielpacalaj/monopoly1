package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.hraciaPlocha.budova;

import java.util.Random;

public class hrac {
    public String meno;
    protected boolean stav;
    protected budova nedhnutelnosti;
    protected int peniaze;
    protected int poziciaHracaNaploche;

    public hrac(String meno){
        this.meno = meno;
        this.stav = true;
        this.nedhnutelnosti = null;
        this.peniaze = 500;
        this.poziciaHracaNaploche = 1;
    }

    public int hodKockou(){
        Random rand = new Random();
        int jedenHod = 1 + rand.nextInt(6);
        this.poziciaHracaNaploche = poziciaHracaNaploche+jedenHod;
        if (poziciaHracaNaploche>24){
            this.poziciaHracaNaploche=poziciaHracaNaploche-24;
        }
        return jedenHod;
    }
    public String getMeno() {
        return meno;
    }
}
