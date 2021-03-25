package sk.stuba.fei.uim.oop.hraciaPlocha;

public class start extends policko{

    public start(int poziciaNaPloche) {
        super(poziciaNaPloche);
        this.menoPolicka = "Start";
    }

    @Override
    public String toString() {
        return "Start";
    }
}
