package sk.stuba.fei.uim.oop.hraciaPlocha;

public class budova extends policko{
    public int cenaPredaj;
    public int cenaNajmu;

    public budova(int poziciaNaPloche, String menoPolicka, int cenaPredaj,int cenaNajmu) {
        super(poziciaNaPloche, menoPolicka);
        this.cenaPredaj = cenaPredaj;
        this.cenaNajmu = cenaNajmu;
    }
}
