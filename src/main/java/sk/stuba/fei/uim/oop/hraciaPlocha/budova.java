package sk.stuba.fei.uim.oop.hraciaPlocha;

public class budova extends policko{
    public int cenaPredaj;
    public int cenaNajmu;
    public int vlastnikId;


    public budova(int poziciaNaPloche, String menoPolicka, int cenaPredaj,int cenaNajmu) {
        super(poziciaNaPloche);
        this.cenaPredaj = cenaPredaj;
        this.cenaNajmu = cenaNajmu;
        this.menoPolicka = menoPolicka;
        this.vlastnikId = -1;
    }

    @Override
    public String toString() {
        return menoPolicka  +
                " [cenaPredaj=" + cenaPredaj +
                ", cenaNajmu=" + cenaNajmu +
                "]";
    }
    public int getVlastnikId() {
        return vlastnikId;
    }

    public void setVlastnikId(int vlastnikId) {
        this.vlastnikId = vlastnikId;
    }

    public int getCenaNajmu() {
        return cenaNajmu;
    }

    public int getCenaPredaj() {
        return cenaPredaj;
    }
}
