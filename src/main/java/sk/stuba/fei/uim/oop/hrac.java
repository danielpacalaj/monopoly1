package sk.stuba.fei.uim.oop;

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
}
