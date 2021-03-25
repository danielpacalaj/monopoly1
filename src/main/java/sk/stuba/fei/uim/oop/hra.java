package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.hraciaPlocha.budova;
import sk.stuba.fei.uim.oop.hraciaPlocha.hraciaDoska;
import sk.stuba.fei.uim.oop.hraciaPlocha.policia;
import sk.stuba.fei.uim.oop.hraciaPlocha.policko;

import java.util.ArrayList;
import java.util.Random;

import static sk.stuba.fei.uim.oop.zKlavesnice.*;

public class hra {

    public ArrayList<hrac> hraci = new ArrayList<hrac>();

    public hra() {
        zrobHru();
    }

    public void pridajHracov(){

        System.out.println("Zadajte pocet hracov!");
        int pocetHracov = readInt();
        int i;
        for(i=1;i<=pocetHracov;i++){
            System.out.println("Zadajte meno "+i+" hraca");
            hraci.add(new hrac(readString()+" "+i));
        }

    }



    public void zrobHru(){
        hraciaDoska v = new hraciaDoska();
        pridajHracov();
        int ka=0;
        while(ka!=1){
            for (int i = 0; i < this.hraci.size(); i++) {
                System.out.println("-----------------\nNa rade je hrac " + this.hraci.get(i).getMeno());
                this.hraci.get(i).hodKockou();
                System.out.println("Skocil si na toto policko " + v.doska.get(this.hraci.get(i).getPoziciaHracaNaploche()));

                var pomocnePole = v.doska.get(this.hraci.get(i).getPoziciaHracaNaploche());

                if(pomocnePole instanceof budova){
                    if(((budova)pomocnePole).getVlastnikId()<0){
                        System.out.println("Tato budova nema vlastnika");
                        System.out.println("Chcete ju kupit?(A/N)");

                        char preKupenie = readChar();
                        if(preKupenie == 'A'){
                            this.hraci.get(i).setPeniaze(this.hraci.get(i).getPeniaze()-
                                    (((budova)pomocnePole).getCenaPredaj()));
                            System.out.println("Budovu si kupil! Gratulujeme");
                            ((budova)pomocnePole).setVlastnikId(i);
                            this.hraci.get(i).setNedhnutelnosti(((budova)pomocnePole));
                        }
                        else {
                            System.out.println("Budovu si nekupil");
                        }
                    }
                    else if(((budova)pomocnePole).getVlastnikId()>0){
                        System.out.println("Budova uz niekomu patri! Zaplat najomne!");
                        this.hraci.get(i).setPeniaze(this.hraci.get(i).getPeniaze()-
                                (((budova)pomocnePole).getCenaNajmu()));
                        System.out.println("Zaplatil si "+(((budova)pomocnePole).getCenaNajmu())+" ostalo ti "
                                +this.hraci.get(i).getPeniaze());
                        this.hraci.get(((budova)pomocnePole).vlastnikId).setPeniaze(this.hraci.get(((budova)pomocnePole).vlastnikId)
                                .getPeniaze()+ (((budova)pomocnePole).getCenaNajmu()));
                        System.out.println("Vlasnik dostal "+(((budova)pomocnePole).getCenaNajmu()));
                    }
                }

                if(pomocnePole instanceof policia){

                }
            }
        }

    }


}
