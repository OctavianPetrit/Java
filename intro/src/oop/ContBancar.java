package oop;

public class ContBancar {
    //program files = definim logica unui cant bancar

    // oop = object oriented object
    // poo = programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitia unui concept
    // reteta la paste carbonara, ADN-ul uman
    // ex: clasa Car

    // un obiect = instanta/implementarea unei clase
    // pastele carbonara
    // ex: obiect de tip Car (unul sau mai multe)

    // fields = proprietati = atribute
    // variabile
    // ex: culoare, nume, marca, model, consum, pret

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza(), franeaza(), deschideUsa(), vopsire()

    // proprietatile, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, require fields
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode
    public void interogareSold() {
        System.out.println("Titular: " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Numar de incercari gresite  " + this.incercari_activare);
        System.out.println("--------------------------");
    }

    public void  activareCont(int pinUtilizator) {
        // modifica activ in true doar daca pinul este corect
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Card activat cu succes");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercari_activare++; // incrementeaza (++)
        }
    }

    public void alimentareCont(double suma_depusa) {
        // la ce aveam in cant (this.sold) se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa +". Aveti in cont suma de " + this.sold);
    }

    public void plataCard(double suma_cheltuita){
        System.out.println("Buna " + this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma cheltuita <= sold
        if (suma_cheltuita <= this.sold) {
            // dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        }else {
            System.out.println("Fonduri insuficiente!");
        }
    }

    // la curs
    // mosteniri
    // polimorfism
    // encapsulation
    // abstractization
}


