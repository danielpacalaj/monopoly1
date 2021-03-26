package sk.stuba.fei.uim.oop.ostatnePotrebneVeci;

import sk.stuba.fei.uim.oop.hraciaPlocha.budova;

import java.util.Random;

import static sk.stuba.fei.uim.oop.ostatnePotrebneVeci.zKlavesnice.readString;

public class hrac {
    public String meno;
    protected budova nedhnutelnosti =null;
    protected int peniaze =100;
    protected int poziciaHracaNaploche = 1;
    protected int pocetKolVoVazeni = 0;

    public hrac(String meno){
        this.meno = meno;
    }

    public void hodKockou(){
        readString("Pre hod kockou stlacte enter");
        Random rand = new Random();
        int jedenHod = 1 + rand.nextInt(6);
        this.poziciaHracaNaploche = poziciaHracaNaploche+jedenHod;
        System.out.println("Hodil si "+jedenHod);
        if (poziciaHracaNaploche>=24){
            this.poziciaHracaNaploche=poziciaHracaNaploche-24;
            setPeniaze(peniaze+20);
            System.out.println("Presiel si startom. Dostal si 20 peniazov");
        }
    }
    //*/
    public String getMeno() {
        return meno;
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
