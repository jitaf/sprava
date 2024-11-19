package spravaInfluenceru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ukol ukol 4 prvni cast
        // Vytvoření dvou influencerů
        Influencer influencer1 = new Influencer();
        Influencer influencer2 = new Influencer();

        Scanner scanner = new Scanner(System.in);

        //ukol 4 - druha cast
        // Načítání počtu sledujících
        System.out.print("Zadejte počet sledujících pro influencera " + influencer1.getJmeno() + ": ");
        influencer1.setPocetSledujicich(scanner.nextInt());
        scanner.nextLine();  // Pro odstranění zbylého nového řádku

        System.out.print("Zadejte počet sledujících pro influencera " + influencer2.getJmeno() + ": ");
        influencer2.setPocetSledujicich(scanner.nextInt());
        scanner.nextLine();


        // Ověření účtu pro jednoho influencera - ukol 8 prvni bod
        influencer1.overUcet();

        //ukol 8 druhy a treti bod
        // Načítání změny počtu sledujících pro oba influencery
        System.out.print("O kolik sledujících chcete zvětšit počet pro influencera " + influencer1.getJmeno() + ": ");
        int zvyseni1 = scanner.nextInt();
        influencer1.pridejSledujici(zvyseni1);

        System.out.print("O kolik sledujících chcete zvětšit počet pro influencera " + influencer2.getJmeno() + ": ");
        int zvyseni2 = scanner.nextInt();
        influencer2.pridejSledujici(zvyseni2);

        // Vypis profilů obou influencerů - ukol 8 ctvrty bod
        System.out.println("\nProfil influencera 1:");
        influencer1.vypisProfil();
        System.out.println("\nProfil influencera 2:");
        influencer2.vypisProfil();

        // Porovnání počtu sledujících - ukol 9
        if (influencer1.getPocetSledujicich() > influencer2.getPocetSledujicich()) {
            System.out.println("\nInfluencer " + influencer1.getJmeno() + " má více sledujících – konkrétně "
                    + influencer1.getPocetSledujicich() + " sledujících.");
        } else if (influencer1.getPocetSledujicich() < influencer2.getPocetSledujicich()) {
            System.out.println("\nInfluencer " + influencer2.getJmeno() + " má více sledujících – konkrétně "
                    + influencer2.getPocetSledujicich() + " sledujících.");
        } else {
            System.out.println("\nOba influenceři mají stejný počet sledujících.");
        }
    }
}
