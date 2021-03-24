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

    public void chodNa(int pozicia){
        this.poziciaHracaNaploche = pozicia;
    }

    public void prehraj(){
        this.stav = false;
    }

    public void stoj(int pocetKol){
        int i;
        for(i=pocetKol;i>0;i--){
            //do something este neviem co
        }
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
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

    public void setPeniaze(int peniaze) {
        this.peniaze = peniaze;
    }

    public void setPoziciaHracaNaploche(int poziciaHracaNaploche) {
        this.poziciaHracaNaploche = poziciaHracaNaploche;
    }

    public boolean isStav() {
        return stav;
    }

    public int getPeniaze() {
        return peniaze;
    }

    public int getPoziciaHracaNaploche() {
        return poziciaHracaNaploche;
    }
}
