package sk.stuba.fei.uim.oop.hraciaPlocha;

public class hraciaPlocha {
    public hraciaPlocha() {
    }

    public void zrobPlochu(){
        policko a;
        start a1 = new start(1,"haha");
        budova a2 = new budova(2,"budova 1",10,1);
        budova a3 = new budova(3,"budova 2",12,2);
        budova a4 = new budova(4,"budova 3",13,3);
        budova a5 = new budova(5,"budova 4",14,4);
    }

    public void vytlacPlochu(policko... a){
        System.out.println("\n"+ a + " hej");
    }
}
