package harj.monivalinta;

import harj.monivalinta.model.*;
import java.security.MessageDigest;
import java.util.UUID;

public class Controlleri {

    User u;
    Users us;
    Gui g;
    Monivalinta txt;

    Kysymys k;
    Vastaus v;
    Matsku m;
    Suoritukset s;
    Tulos t;

    public Controlleri() {
        this.u = new User();
        this.us = new Users();
        this.g = new Gui();
        this.txt = new Monivalinta();

        this.t = new Tulos();
        this.s = new Suoritukset();

        this.m = new Matsku();
        this.v = new Vastaus();
        this.k = new Kysymys();
    }

    public Controlleri(Matsku m, Users u) {
        this.u = new User();
        this.us = new Users();
        this.g = new Gui();
        this.txt = new Monivalinta();

        this.t = new Tulos();
        this.s = new Suoritukset();
        this.m = new Matsku();
        this.v = new Vastaus();
        this.k = new Kysymys();
    }

//Login toiminnot
    public boolean userOnOlemassa(String unimi) {
//        return false;
        return us.getUsers().containsKey(unimi);
    }

    public boolean tsekkaaSalasana(String unimi, String hashPw) {
//        return false;
        return us.getUsers().get(unimi).getPassword().contentEquals(hashPw);
    }

    public String kryptaa(String pw) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(pw.getBytes());
        byte byteData[] = md.digest();

        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public String teeRandomSalasana() {
        return UUID.randomUUID().toString();
    }

    public User annaUser(String unimi) {
        return us.getUsers().get(unimi);
    }

    public Matsku annaMatsku(String filenimi) {
        return m;
    }

    public void lopetaOhjelma() {
        System.exit(0);
    }

}
