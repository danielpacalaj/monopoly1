package sk.stuba.fei.uim.oop;

public class budova  extends policko{

    public String meno;
    public int cena;
    public int najom;
    public hrac majitel;

    public budova(String meno,int poziciaNaPloche,int cena,int najom){
        super(poziciaNaPloche);
        this.meno = meno;
        this.cena = cena;
        this.najom = najom;
        this.majitel = null;
    }

    public void kup(int cena){
        //hrac.peniaze = peniaze - cena;
    }

}
