package sk.stuba.fei.uim.oop.hraciaPlocha;

public class dan extends policko{

    public dan(int poziciaNaPloche) {
        super(poziciaNaPloche);
        this.menoPolicka = "Zaplat dan!";
    }

    @Override
    public String toString() {
        return "Dan";
    }
}
