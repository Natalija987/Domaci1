package com.itbootcamp.bgqa.nedelja4.namirnica;
import java.util.ArrayList;
public class Korpa implements Racun{
     private ArrayList<Namirnica>namirnice;
    public Korpa(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    @Override
    public void printNamernice() {
for(int i=0;i< namirnice.size();i++){
    System.out.println(namirnice);
}
    }

    @Override
    public int printRacun() {
        double suma=0;
        for(int i=0; i< namirnice.size(); i++)
            suma+=namirnice.get(i).getCena();
        return 0;
    }

    @Override
    public boolean jeNaSpisku(Namirnica n) {
        boolean naSpisku=false;
        if(n.equals("naSpisku")){
        return true;
    }
        return naSpisku;
    }}