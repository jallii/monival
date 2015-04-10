

package harj.monivalinta;


import java.util.Scanner;

public class Monivalinta {

    private static Scanner lukija;
    private static Controlleri c;
    private static int valinta;

    private static String menu1 = "Kirjaudu käyttäjänä";
    private static String menu2 = "Tee uusi käyttäjä";
    private static String menu3 = "Avaa materiaali";
    private static String menu4 = "Tee uusi materiaali";
    private static String menu5 = "Aloita vastaaminen";
    private static String menu6 = "Tarkastele tuloksia";
    private static String menu7 = "Lopeta";
    private static String menu8 = "Käynnistä Graafinen käyttäliittymä";

    static String nimi, salasana;
    static boolean userOnOlemassa = false, okSalasana = true;

    public Monivalinta() {
        Monivalinta.c = new Controlleri();

    }

    public static void main(String[] args) {
        Monivalinta.lukija = new Scanner(System.in);
        printtaaMenu();
        if (lukija.hasNext()) {
            valinta = lukija.nextInt();
        }
        valitse(valinta);
    }

    private static void printtaaMenu() {
        System.out.println("Valitse toiminto:");
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println(menu3);
        System.out.println(menu4);
        System.out.println(menu5);
        System.out.println(menu6);
        System.out.println(menu7);
        System.out.println(menu8);
    }

    private static void valitse(int numero) {
        switch (valinta) {
            case 1: {
                System.out.println(menu1);
                menu1();
            }
            case 2: {
                System.out.println(menu2);
                menu2();
            }
            case 3: {
                System.out.println(menu3);
                menu3();
            }
            case 4: {
                System.out.println(menu4);
                menu4();
            }
            case 5: {
                System.out.println(menu5);
                menu5();
            }
            case 6: {
                System.out.println(menu6);
                menu6();
            }
            case 7: {
                System.out.println(menu7);
            }
        }
    }

    private static void menu1() {
        System.out.println("Hoida Menu1");
        System.out.println("Anna käyttäjänimesi:");
        nimi = lukija.next();
//        userOnOlemassa = c.userOnOlemassa(nimi);

        if (userOnOlemassa) {
            System.out.println("Anna salasana");
            salasana = lukija.next();
//            okSalasana = c.tsekkaaSalasana(nimi, salasana);
            if (okSalasana) {
//                c.u = c.annaUser(nimi);
            }
        }

    }

    private static void menu2() {
        System.out.println(menu2);
        System.out.println("Anna toivottu käyttäjänimi");
        boolean jatka = true;

        while (jatka) {
            nimi = lukija.next();
//            userO2nOlemassa = c.userOnOlemassa(nimi);
            if (!userOnOlemassa) {
//                c.u = c.annaUser(nimi);
                jatka = false;
            } else {
                jatka = true;
            }
        }
        System.out.println("Anna etunimesi");
        nimi = lukija.next();
        c.u.setEtunimi(nimi);

        System.out.println("Anna sukunimesi");
        nimi = lukija.next();
        c.u.setSukunimi(nimi);

        System.out.println("Keksi itsellesi salasana");
        nimi = lukija.next();
        c.u.setPassword(c.u.kryptaa(salasana));
    }

    private static void menu3() {
        System.out.println(menu3);
    }

    private static void menu4() {
        System.out.println(menu4);
    }

    private static void menu5() {
        System.out.println(menu5);
    }

    private static void menu6() {
        System.out.println(menu6);
    }

    private static void menu7() {
        System.out.println(menu7);
        c.lopetaOhjelma();
    }

    public static void runTXT() {
        boolean jatka = true;
        if (jatka) {
            printtaaMenu();
//            valitse();
        } else {
            System.exit(0);
        }
    }
}
