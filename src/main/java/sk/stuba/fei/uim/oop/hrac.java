package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.hraciaPlocha.budova;

public class hrac {
    public String meno;
    public boolean stav;
    public budova nedhnutelnosti;
    public int peniaze;
    public int poziciaHracaNaploche;

    public hrac(String meno,budova nedhnutelnosti,int peniaze,int poziciaHracaNaploche){
        this.meno = meno;
        this.stav = true;
        this.nedhnutelnosti = nedhnutelnosti;
        this.peniaze = peniaze;
        this.poziciaHracaNaploche = poziciaHracaNaploche;
    }

}
