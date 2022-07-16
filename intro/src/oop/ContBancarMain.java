package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte detip ContBancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Petrit Octavian", "RO001");
        ContBancar cont2 = new ContBancar("Petrit Alin","Ro002");

//        // apelam metoda descriere
//        cont1.descriere();
//        cont2.descriere();

        // activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        //alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);
        
        // negative testing, cheltuim mai mult decat avem
        cont1.plataCard(500); // corect

        // pozitiv cu suma exacta
        cont1.plataCard(300.5);

        // positive de 2x
        cont2.plataCard(100);
        cont2.plataCard(200);

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
