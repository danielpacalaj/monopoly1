package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.hraciaPlocha.*;
import sk.stuba.fei.uim.oop.sancoveKarty.balicek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static sk.stuba.fei.uim.oop.zKlavesnice.*;

public class hra {

    public ArrayList<hrac> hraci = new ArrayList<hrac>();
    //public ArrayList<balicek> karty = new ArrayList<balicek>();


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
        hraciaDoska plocha = new hraciaDoska();
        balicek karticky = new balicek();
        pridajHracov();

        int pocitadloSance = 0;


        while(this.hraci.size()>1){
            for (int i = 0; i < this.hraci.size(); i++) {
                System.out.println("-----------------\nNa rade je hrac " + this.hraci.get(i).getMeno());
                if(this.hraci.get(i).getPocetKolVoVazeni()>0){
                   this.hraci.get(i).setPocetKolVoVazeni(this.hraci.get(i).getPocetKolVoVazeni()-1);
                   System.out.println("Si v base. Stojis este"+this.hraci.get(i).getPocetKolVoVazeni()+" kol");
                }
                else {
                    this.hraci.get(i).hodKockou();
                }
                System.out.println("Skocil si na toto policko " + plocha.doska.get(this.hraci.get(i).
                        getPoziciaHracaNaploche()));

                var pomocnePole = plocha.doska.get(this.hraci.get(i).getPoziciaHracaNaploche());

                if(pomocnePole instanceof budova){
                    if(((budova)pomocnePole).getVlastnikId()<0){
                        System.out.println("Tato budova nema vlastnika");
                        System.out.println("Chcete ju kupit?(A/N)");

                        char preKupenie = readChar();
                        if(preKupenie == 'A'){
                            this.hraci.get(i).setPeniaze(this.hraci.get(i).getPeniaze()-
                                    (((budova)pomocnePole).getCenaPredaj()));
                            System.out.println("Budovu si kupil! Gratulujeme\nZostalo ti "+this.hraci.get(i).
                                    getPeniaze()+" peniazov");
                            ((budova)pomocnePole).setVlastnikId(i);
                            this.hraci.get(i).setNedhnutelnosti(((budova)pomocnePole));
                        }
                        else {
                            System.out.println("Budovu si nekupil");
                        }
                    }
                    else if(((budova)pomocnePole).getVlastnikId()>=0){
                        System.out.println("Budova uz niekomu patri! Zaplat najomne!");
                        this.hraci.get(i).setPeniaze(this.hraci.get(i).getPeniaze()-
                                (((budova)pomocnePole).getCenaNajmu()));
                        System.out.println("Zaplatil si "+(((budova)pomocnePole).getCenaNajmu())+" ostalo ti "
                                +this.hraci.get(i).getPeniaze());
                        this.hraci.get(((budova)pomocnePole).vlastnikId).setPeniaze(this.hraci.get(((budova)
                                pomocnePole).vlastnikId).getPeniaze()+ (((budova)pomocnePole).getCenaNajmu()));
                        System.out.println("Vlasnik dostal "+(((budova)pomocnePole).getCenaNajmu()));
                    }
                }

                if(pomocnePole instanceof policia){
                    this.hraci.get(i).setPoziciaHracaNaploche(7);
                    this.hraci.get(i).setPocetKolVoVazeni(3);
                    System.out.println("Dostal si sa do basy! Stojis 3 kola");
                }

                if(pomocnePole instanceof dan){
                    this.hraci.get(i).setPeniaze(this.hraci.get(i).getPeniaze()-80);
                    System.out.println("Zaplatil si dan 80. Ostalo ti "+this.hraci.get(i).getPeniaze());
                }

                if(pomocnePole instanceof sanca){
                        pocitadloSance++;
                        karticky.karty.get(pocitadloSance);
                        System.out.println(karticky.karty.get(pocitadloSance));
                        if(pocitadloSance==4){
                            pocitadloSance=0;
                        }


                }
                if(this.hraci.get(i).getPeniaze()<0){
                    System.out.println(this.hraci.get(i).getMeno()+" prehral");
                    this.hraci.remove(i);
                    System.out.println("Minul si vsetky prachy. Prehral si. Haha(skodoradosny smiech)");
                }
            }
        }

        System.out.println("--------------------\nVyhral hrac "+this.hraci.get(0).getMeno());

    }

    public ArrayList<hrac> getHraci() {
        return hraci;
    }
}
