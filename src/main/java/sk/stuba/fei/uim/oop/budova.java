package sk.stuba.fei.uim.oop;

public class budova  extends policko{

    public String meno;
    public int cena;
    public int najom;
    public String majitel;

    public budova(String meno,int poziciaNaPloche,int cena,int najom,String majitel){
        super(poziciaNaPloche);
        this.meno = meno;
        this.cena = cena;
        this.najom = najom;
        this.majitel = majitel;
    }

}
