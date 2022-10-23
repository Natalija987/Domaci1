package com.itbootcamp.bgqa.nedelja4.namirnica;

import java.util.ArrayList;

public class TestNamirnice {
    public static void main(String[] args) {
 ArrayList<Namirnica> namirnice = new ArrayList<>();
        Namirnica mleko = new Namirnica("Mleko", 150);
        Namirnica hleb = new Namirnica("hleb", 100);
        Namirnica cokolada = new Namirnica("cokolada", 200);
        
        namirnice.add(mleko);
        namirnice.add(hleb);
        namirnice.add(cokolada);

Korpa korpa = new Korpa(namirnice);

        korpa.printNamernice();
        System.out.println(korpa.jeNaSpisku(mleko));
        System.out.println(korpa.printRacun());

    }
}