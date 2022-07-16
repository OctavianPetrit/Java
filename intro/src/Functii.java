public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosii spatii in nume
    // nu puten defini o functie in alta functie (nu pot instala firefox in chrome)

    // o functie simpla care printeaza ceva pe ecran
    // nu ne da nici un raspuns (nu are return)
    // nu are parametrii
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un raspuns (nu are return)
    // are nevoie de parametrii
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + prenume);
    }

    // o functie care calculeaza media a 3 numere
    // ne da un raspuns - suma nmerelor va avea return
    // ce tip de date va avea raspunsul? 3 + 6 / 2 = 4.5 (double)
    // are nevoie de parametrii
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    // o functie care va da valoarea lui pi
    // ne da un raspuns? da
    // ce tip de date va avea raspunsul? rasp va fi double
    // are nevoie de parametrii? nu
    public static double piValue() {
        // constanta variabila care nu poare fi suprascrisa

        final double PI = 3.14 ;
        return PI;
    }


    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // de apeleaza functia

        // intra clientul  nr 2
        printGreeting(); // CTRL + Click pe functie => ne duce la corpul ei

        // apelam o functie cu parametrii, oferind parametrii
        printGreetingByName("Petrit ", "Octavian");
        printGreetingByName("Paduraru ", "Alexandra");
        printGreetingByName("Petrit ", "Alin");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(31213, 312313, 423);
        double media2 = mediaNr(35, 324, 41);
        double media3 = mediaNr(33, 11, 11);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue());

        // tema: aria unui dreptunghi
        // aria cercului
        // suna a 2 nr
        // o functie care returneaza cate caractere are numele + prenumele
        // identificati voi probleme

        String nume = "Octavian";
        System.out.println(nume.length());
    }
}

