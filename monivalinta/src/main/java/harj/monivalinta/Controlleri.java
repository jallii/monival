package harj.monivalinta;
import harj.monivalinta.model.*;
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

//Login toiminnot
    public boolean onkoUserOlemassa(String unimi) {
//        return false;
        return us.getUsers().containsKey(unimi);
    }

     public boolean onkoSalasanaOK(String unimi, String plainPw) {
       boolean apu=us.getUsers().get(unimi).tarkistaSalasana(plainPw);
         return false;
         return 
    }
   


//    public User annaUser(String unimi) {
//        return us.getUsers().get(unimi);
//    }

    public Matsku annaMatsku(String filenimi) {
        return m;
    }

    public void lopetaOhjelma() {
        System.exit(0);
    }
 
}
