package sk.stuba.fei.uim.oop.hraciaPlocha;

//fei.uim.oop.hraciaPlocha.hrac;

public class policia extends policko{

    public policia(int poziciaNaPloche) {
        super(poziciaNaPloche);
        this.menoPolicka = "Policia";
    }

    @Override
    public String toString() {
        return "Policia";
    }
    public void chodDoVazenia(){

    }
}
