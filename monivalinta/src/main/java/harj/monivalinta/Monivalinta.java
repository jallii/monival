package harj.monivalinta;

import java.util.Scanner;

public class Monivalinta {

    private static Scanner lukija;
    private static Controlleri c;
    private static int valinta = 0;
    private static String menu0 = "0. Käynnistä graafinen käyttöliittymä";
    private static String menu1 = "1. Kirjaudu käyttäjänä";
    private static String menu2 = "2. Tee uusi käyttäjä";
    private static String menu3 = "3. Avaa materiaali";
    private static String menu4 = "4. Tee uusi materiaali";
    private static String menu5 = "5. Aloita vastaaminen";
    private static String menu6 = "6. Tarkastele tuloksia";
    private static String menu7 = "7. Lopeta";
    private static String menu8 = "8. Optio ";
    private static String unimi = "Anna käyttäjänimesi";
    private static String enimi = "Anna etunimesi";
    private static String snimi = "Anna sukunimesi";
    private static String pass = "Anna salasana";
    private static String valitse = "Ole hyvä tee valintasi;";
    private static String sana = "";
    private static boolean userOnOlemassa = false,
            okSalasana = true;
    static boolean jatka = true;

    public Monivalinta() {

    }

    public static void main(String[] args) {
        Monivalinta.c = new Controlleri();
        Monivalinta.lukija = new Scanner(System.in);

        printtaaMenu();

        kysyInt(valitse);
        valitse(valinta);

    }

    public static void runTXT() {
        if (jatka) {
            printtaaMenu();
            valinta = kysyInt(valitse);
            valitse(valinta);

        } else {
            System.exit(0);
        }
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

    private static String kysyString(String s) {
        System.out.println(s);
        return lukija.next();
    }

    private static int kysyInt(String s) {
        System.out.println(s);
        return lukija.nextInt();
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
                jatka = true;
            }
            case 3: {
                System.out.println(menu3);
                menu3();
                jatka = true;
            }
            case 4: {
                System.out.println(menu4);
                menu4();
                jatka = true;
            }
            case 5: {
                System.out.println(menu5);
                menu5();
                jatka = true;
            }
            case 6: {
                System.out.println(menu6);
                menu6();
                jatka = true;
            }
            case 7: {
                System.out.println(menu7);
                menu7();
                jatka = false;
            }
            case 8: {
                System.out.println(menu8);
                c.lopetaOhjelma();
            }
        }
    }

    private static void menu0() {
        System.out.println(menu1);
        Gui g = new Gui();
        g.setVisible(false);
    }

    private static void menu1() {
        System.out.println(menu1);
        jatka = true;
    }

    private static void menu2() {
        System.out.println(menu2);
        jatka = true;
    }

    private static void menu3() {
        System.out.println(menu3);
        jatka = true;
    }

    private static void menu4() {
        System.out.println(menu4);
        jatka = true;
    }

    private static void menu5() {
        System.out.println(menu5);
        jatka = true;
    }

    private static void menu6() {
        System.out.println(menu6);
        jatka = true;
    }

    private static void menu7() {
        System.out.println(menu7);
        jatka = true;
    }

    private static void menu8() {
        System.out.println(menu8);
        jatka = false;
    }

    private static void teeUser() {
        //        System.out.println(menu2);
        //        System.out.println("Anna toivottu käyttäjänimi");
        //        boolean jatka = true;
        //
        //        while (jatka) {
        //            nimi = lukija.next();
        ////            userO2nOlemassa = c.userOnOlemassa(nimi);
        //            if (!userOnOlemassa) {
        ////                c.u = c.annaUser(nimi);
        //                jatka = false;
        //            } else {
        //                jatka = true;
        //            }
        ////        }
        ////    }
        ////
        ////    System.out.println (
        ////            
        ////    "Anna etunimesi");
        ////        nimi  = lukija.next();
        ////
        ////    c.u.setEtunimi (nimi);
        ////
        ////    System.out.println (
        ////            
        ////    "Anna sukunimesi");
        ////        nimi  = lukija.next();
        ////
        ////    c.u.setSukunimi (nimi);
        ////
        ////    System.out.println (
        ////            
        ////    "Keksi itsellesi salasana");
        ////        nimi  = lukija.next();
        ////
        ////    c.u.setPassword (c.u.kryptaa(salasana));
    }

//    private static void menu11() {
//        System.out.println("Hoida Menu1");
//        System.out.println("Anna käyttäjänimesi:");
//        nimi = lukija.next();
////        userOnOlemassa = c.userOnOlemassa(nimi);
//
//        if (userOnOlemassa) {
//            System.out.println("Anna salasana");
//            salasana = lukija.next();
////            okSalasana = c.tsekkaaSalasana(nimi, salasana);
//            if (okSalasana) {
////                c.u = c.annaUser(nimi);
//            }
//        }
//
//    }
}
