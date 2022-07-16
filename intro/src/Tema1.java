public class Tema1 {
    public static void main(String[] args) {
        /*1. Noteaza in limbajul de programare java, in cadrul unui comentariu,
        ce este o variabila boolean – explica cu cuvintele tale.
        boolean = true or false
         */
        // exemplu
        boolean cer_albastru = true;
        System.out.println("Cerul este albastru? " + cer_albastru);

        /*
        3. Declara si initializeaza in limbajul de programare java cate o variabila
        din fiecare din urmatoarele tipuri: string, integer, float, boolean. Alege
        valorile dupa preferinta ta.
        */

        String oras = "Timisoara";
        System.out.println("Oras: " + oras);
        Integer populatie = 630000;
        System.out.println("Numar de locoitori: " + populatie);
        float procent_tineri = 39.35f;
        System.out.println("Procent populatie sub 35 de ani: " + procent_tineri + " %");
        boolean mediu_urban = true;
        System.out.println("Zona urbana: " + mediu_urban);

        /* 5. Ce tipăreşte următorul segment de cod Java? Scrie segmentul de cod
        in limbajul de progrmare java si afla raspunsul. */

        int i;
        for (i=1; i<20; i = i+3)

            System.out.println( i ); // index de numere, din 3 in 3 si cu ultimul numar mai mic decat 20

    }
}
