package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.hraciaPlocha.budova;

import java.util.Random;

import static sk.stuba.fei.uim.oop.zKlavesnice.readChar;
import static sk.stuba.fei.uim.oop.zKlavesnice.readString;

public class hrac {
    public String meno;
    protected boolean stav = true;
    protected budova nedhnutelnosti =null;
    protected int peniaze =100;
    protected int poziciaHracaNaploche = 1;
    protected int pocetKolVoVazeni = 0;

    public hrac(String meno){
        this.meno = meno;
        //this.stav = true;
        //this.nedhnutelnosti = null;
        //this.peniaze = 500;
        //this.poziciaHracaNaploche = 1;
    }

    public int hodKockou(){
        readString("Pre hod kockou stlacte enter");
        Random rand = new Random();
        int jedenHod = 1 + rand.nextInt(6);
        this.poziciaHracaNaploche = poziciaHracaNaploche+jedenHod;
        if (poziciaHracaNaploche>=24){
            this.poziciaHracaNaploche=poziciaHracaNaploche-24;
            setPeniaze(peniaze+20);
            System.out.println("Presiel si startom. Dostal si 20 peniazov");
        }
        return jedenHod;
    }
    //*/
    public String getMeno() {
        return meno;
    }

    public boolean isStav() {
        return stav;
    }

    public void setStav(boolean stav) {
        this.stav = stav;
    }

    public budova getNedhnutelnosti() {
        return nedhnutelnosti;
    }

    public void setNedhnutelnosti(budova nedhnutelnosti) {
        this.nedhnutelnosti = nedhnutelnosti;
    }

    public int getPeniaze() {
        return peniaze;
    }

    public void setPeniaze(int peniaze) {
        this.peniaze = peniaze;
    }

    public int getPoziciaHracaNaploche() {
        return poziciaHracaNaploche;
    }

    public void setPoziciaHracaNaploche(int poziciaHracaNaploche) {
        this.poziciaHracaNaploche = poziciaHracaNaploche;
    }

    public int getPocetKolVoVazeni() {
        return pocetKolVoVazeni;
    }

    public void setPocetKolVoVazeni(int pocetKolVoVazeni) {
        this.pocetKolVoVazeni = pocetKolVoVazeni;
    }
}
