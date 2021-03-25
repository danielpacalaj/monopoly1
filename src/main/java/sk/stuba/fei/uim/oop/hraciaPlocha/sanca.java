package sk.stuba.fei.uim.oop.hraciaPlocha;

public class sanca extends policko{

    public sanca(int poziciaNaPloche) {
        super(poziciaNaPloche);
        this.menoPolicka = "Sanca";
    }

    @Override
    public String toString() {
        return "Sanca";
    }
}
