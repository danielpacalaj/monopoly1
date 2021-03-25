package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.hraciaPlocha.hraciaDoska;

import static sk.stuba.fei.uim.oop.zKlavesnice.readChar;
import static sk.stuba.fei.uim.oop.zKlavesnice.readInt;


public class Assignment1 {
    public static void main(String[] args) {

        hrac jozo = new hrac("Dezo");
        int a=jozo.hodKockou();
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
        a=jozo.hodKockou();
        readChar("Ste na tahu stlacte lubovolnu klavesu");
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
        readChar("Ste na tahu stlacte lubovolnu klavesu");
        a=jozo.hodKockou();
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
        readChar("Ste na tahu stlacte lubovolnu klavesu");
        a=jozo.hodKockou();
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
        readChar("Ste na tahu stlacte lubovolnu klavesu");
        a=jozo.hodKockou();
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
        readChar("Ste na tahu stlacte lubovolnu klavesu");
        a=jozo.hodKockou();
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
        readChar("Ste na tahu stlacte lubovolnu klavesu");
        a=jozo.hodKockou();
        System.out.println(jozo.poziciaHracaNaploche+" hodil si "+a);
    }




}
