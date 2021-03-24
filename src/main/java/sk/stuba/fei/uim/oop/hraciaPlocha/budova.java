package sk.stuba.fei.uim.oop.hraciaPlocha;

public class budova extends policko{
    public int cenaPredaj;
    public int cenaNajmu;
    public String menoPolicka;

    public budova(int poziciaNaPloche, String menoPolicka, int cenaPredaj,int cenaNajmu) {
        super(poziciaNaPloche);
        this.cenaPredaj = cenaPredaj;
        this.cenaNajmu = cenaNajmu;
        this.menoPolicka = menoPolicka;
    }
}
