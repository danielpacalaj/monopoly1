package sk.stuba.fei.uim.oop.hraciaPlocha;

import java.util.ArrayList;

public class hraciaDoska {

    public ArrayList<policko> doska = new ArrayList<policko>();

    public hraciaDoska() {
        zrobDosku();
    }

    public void zrobDosku(){
        doska.add(new start(1));
        doska.add(new budova(2,"Dom A1",10,1));
        doska.add(new budova(3,"Dom A2",15,2));
        doska.add(new budova(4,"Dom A3",20,5));
        doska.add(new sanca(5));
        doska.add(new budova(6,"Dom A4",25,10));

        doska.add(new vazenie(7));
        doska.add(new budova(8,"Dom B1",30,12));
        doska.add(new budova(9,"Dom B2",40,15));
        doska.add(new sanca(10));
        doska.add(new budova(11,"Dom B3",45,20));
        doska.add(new budova(12,"Dom B4",50,22));

        doska.add(new dan(13));
        doska.add(new budova(14,"Dom C1",60,25));
        doska.add(new sanca(15));
        doska.add(new budova(16,"Dom C2",70,30));
        doska.add(new budova(17,"Dom C3",80,35));
        doska.add(new budova(18,"Dom C4",90,40));

        doska.add(new policia(19));
        doska.add(new budova(20,"Dom D1",100,45));
        doska.add(new budova(21,"Dom D2",110,50));
        doska.add(new budova(22,"Dom D3",120,60));
        doska.add(new sanca(23));
        doska.add(new budova(24,"Dom D4",130,70));

        System.out.println("Hracia doska zrobena!\n---------------------");
    }

    public ArrayList<policko> getDoska() {
        return doska;
    }

    public void setDoska(ArrayList<policko> doska) {
        this.doska = doska;
    }

}
