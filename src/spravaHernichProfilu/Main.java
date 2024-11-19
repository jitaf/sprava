package spravaHernichProfilu;

import spravaHernichProfilu.HerniProfil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //zacatek ukolu 4 - prvni odrazka
        // Načtení dat pro prvního hráče
        System.out.print("Zadejte jméno prvního hráče: ");
        String jmeno1 = sc.nextLine();
        System.out.print("Má hráč prémiový účet? (true/false): ");
        boolean premium1 = sc.nextBoolean();
        // Vytvoření prvního herního profilu
        HerniProfil hrac1 = new HerniProfil(jmeno1, premium1);
        // Načtení dat pro druhého hráče
        System.out.print("Zadejte jméno druhého hráče: ");
        String jmeno2 = sc.nextLine();
        System.out.print("Má hráč prémiový účet? (true/false): ");
        boolean premium2 = sc.nextBoolean();
        // Vytvoření druhého herního profilu
        HerniProfil hrac2 = new HerniProfil(jmeno2, premium2);
        //konec ukolu 4 - prvni odrazka

        //zacatek ukolu 4 - druha odrazka
        // Načtení bodů a úrovně
        System.out.print("Zadejte počet bodů pro prvního hráče: ");
        int body = sc.nextInt();
        hrac1.setPocetBodu(body);
        System.out.print("Zadejte úroveň pro prvního hráče: ");
        int uroven = sc.nextInt();
        hrac1.setDosazenaUroven(uroven);
        sc.nextLine(); // Pro vyčištění vstupu

        // Načtení bodů a úrovně
        System.out.print("Zadejte počet bodů pro druhého hráče: ");
        body = sc.nextInt();
        hrac2.setPocetBodu(body);
        System.out.print("Zadejte úroveň pro druhého hráče: ");
        uroven = sc.nextInt();
        hrac2.setDosazenaUroven(uroven);
        //konec ukolu 4 - druha odrazka


        // Výpis profilů obou hráčů
        System.out.println("\nProfily hráčů:");
        hrac1.vypisProfil();
        hrac2.vypisProfil();


        // Znovu výpis profilů - ukol 7
        System.out.println("\nAktualizovane profily hracu:");
        hrac1.vypisProfil();
        hrac2.vypisProfil();

        // Přidání bodů oběma hráčům - ukol 7
        System.out.print("Kolik bodu si přejete přidat prvnimu hrac? ");
        body = sc.nextInt();
        hrac1.ziskejBody(body);
        System.out.print("Kolik bodu si přejete přidat druhemu hraci? ");
        body = sc.nextInt();
        hrac2.ziskejBody(body);

        // Zjištění hráče s více body - ukol 10
        if (hrac1.getPocetBodu() > hrac2.getPocetBodu()) {
            System.out.println("Vítězem je hráč " + hrac1.getJmenoHrace() + " s " + hrac1.getPocetBodu() + " body.");
        } else if (hrac2.getPocetBodu() > hrac1.getPocetBodu()) {
            System.out.println("Vítězem je hráč " + hrac2.getJmenoHrace() + " s " + hrac2.getPocetBodu() + " body.");
        } else {
            System.out.println("Oba hráči mají stejný počet bodů!");
        }

    }
}