package spravaHernichProfilu;

import java.util.Scanner;
public class HerniProfil {
    //atributy - ukol 1
    private String jmenoHrace;
    private int pocetBodu;
    private int dosazenaUroven;
    private boolean premiumUcet;

    // Parametrický konstruktor - ukol 3
    public HerniProfil(String jmenoHrace, boolean premiumUcet) {
        this.jmenoHrace = jmenoHrace;
        this.premiumUcet = premiumUcet;
        this.pocetBodu = 0; // Výchozí hodnota
        this.dosazenaUroven = 1; // Výchozí hodnota
    }

    // Gettery a settery - ukol 2
    public String getJmenoHrace() {
        return jmenoHrace;
    }

    public void setJmenoHrace(String jmenoHrace) {
        this.jmenoHrace = jmenoHrace;
    }

    public int getPocetBodu() {
        return pocetBodu;
    }

    public void setPocetBodu(int pocetBodu) {
        this.pocetBodu = pocetBodu;
    }

    public int getDosazenaUroven() {
        return dosazenaUroven;
    }

    public void setDosazenaUroven(int dosazenaUroven) {
        this.dosazenaUroven = dosazenaUroven;
    }

    public boolean isPremiumUcet() {
        return premiumUcet;
    }

    public void setPremiumUcet(boolean premiumUcet) {
        this.premiumUcet = premiumUcet;
    }

    // Metoda vypisProfil() - ukol 5
    public void vypisProfil() {
        System.out.println("Jméno hráče: " + jmenoHrace);
        System.out.println("Počet bodů: " + pocetBodu);
        System.out.println("Dosažená úroveň: " + dosazenaUroven);
        System.out.println("Prémiový účet: " + (premiumUcet ? "Ano" : "Ne"));
        System.out.println("--------------------");
    }

    // Metoda ziskejBody()  - ukol 6
    public void ziskejBody(int body) {

        if (premiumUcet == true){
            body = body*3/2;
        }
        this.pocetBodu = this.pocetBodu + body;
        System.out.println("Gratulace, hráči " + jmenoHrace + "! Získal(a) jsi " + body + " bodů.");
    }
}
