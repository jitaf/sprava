package spravaInfluenceru;

import java.util.Scanner;

// Třída Influencer
class Influencer {
    // ukol
    private String jmeno;
    private int pocetSledujicich;
    private String tema;
    private boolean overenyUcet;

    // Bezparametrický konstruktor - ukol 3
    public Influencer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte jméno influencera: ");
        this.jmeno = scanner.nextLine();
        System.out.print("Zadejte téma influencera (např. gaming, móda, fitness): ");
        this.tema = scanner.nextLine();
        this.overenyUcet = false;  // Přednastaveno na false
    }

    // Gettery a settery - ukol dva
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetSledujicich() {
        return pocetSledujicich;
    }

    public void setPocetSledujicich(int pocetSledujicich) {
        this.pocetSledujicich = pocetSledujicich;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isOverenyUcet() {
        return overenyUcet;
    }

    public void setOverenyUcet(boolean overenyUcet) {
        this.overenyUcet = overenyUcet;
    }

    // Metoda pro vypisování profilu - ukol 5
    public void vypisProfil() {
        System.out.println("Jméno: " + jmeno);
        System.out.println("Počet sledujících: " + pocetSledujicich);
        System.out.println("Téma: " + tema);
        if (overenyUcet == true) {
            System.out.println("Ověřený účet.");
        } else {
            System.out.println("Neověřený účet.");
        }

    }

    // Metoda pro přidání sledujících - ukol 6
    public void pridejSledujici(int pocet) {
        // Zvýšení počtu sledujících o zadanou hodnotu
        int zvyseni;
        if (overenyUcet) {
            zvyseni = pocet + pocet/10; // Přičteme 10% pro ověřený účet
        } else {
            zvyseni = pocet;
        }

        // Kontrola, zda počet sledujících nejeví známky podezřelého chování
        if ((overenyUcet && zvyseni > 100) || (!overenyUcet && zvyseni > 10)) {
            System.out.println("Podezřelé chování – příliš mnoho sledujících!");
        }

        this.pocetSledujicich = this.pocetSledujicich +zvyseni;
    }

    // Metoda pro ověření účtu - ukol 7
    public void overUcet() {
        this.overenyUcet = true;
    }
}