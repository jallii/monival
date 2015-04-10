package harj.monivalinta.model;

import java.util.List;
<<<<<<< HEAD

public class Kysymys {

    //Jokaiseen monivalintakysymykseen liittyy jokin IntroObjekti. Se voi olla 
    //kuva, video, äänitiedosto, appletti tms. Siksi se on objekti. 
    //Aluksi varmaan suurimmassa osassa on kyse kuvasta. Objekti voi liittyä 
    //aiheeseen, tai sitten se on muuten vaan mukavan näköinen.
    //Varsinainen kysymyslause Introlause on koko kysymyksen ydin. 
    //Kuhunkin kysymykseen liitty sitten useimmiten 2-5 mutta tarvittaessa 
    //vaikka 10 kappaletta väitelauseita, joihin vastataan. 
    //
    private Object IntroObjekti;
    private String IntroLause;
    private List<Vastaus> vaihtoehto;

    public Kysymys(Object IntroObjekti, String IntroLause, List<Vastaus> v) {
        this.IntroObjekti = IntroObjekti;
        this.IntroLause = IntroLause;
        this.vaihtoehto = v;
    }

    public Kysymys() {
        
    }

    public Object getIntroObjekti() {
        return IntroObjekti;
    }

    public String getIntroLause() {
        return IntroLause;
    }

    public List<Vastaus> getVaihtoehto() {
        return vaihtoehto;
    }

    public void setIntroObjekti(Object IntroObjekti) {
        this.IntroObjekti = IntroObjekti;
    }

    public void setIntroLause(String IntroLause) {
        this.IntroLause = IntroLause;
    }

    public void setVaihtoehto(List<Vastaus> v) {
        this.vaihtoehto = v;
    }

    public void lisaaVaihtoehto(Vastaus v) {
        this.vaihtoehto.add(v);
    }

    public String esitaVaihtoehto(Vastaus v) {
        return v.getVastauslause();
    }

    public void valitseVaihtoehto(Vastaus v) {
        v.setOnkoVastausValittu(Boolean.TRUE);
    }

    public boolean tarkistaVaihtoehto(Vastaus v) {
        boolean oikeaVastaus;
        oikeaVastaus = (v.getOnkoVastausValittu()) & (v.getVastauksenTotuusarvo())
                | ((!v.getOnkoVastausValittu()) & (!v.getVastauksenTotuusarvo()));
        return oikeaVastaus;
    }

    @Override
    public String toString() {
        return "Kysymys{" + "IntroObjekti=" + IntroObjekti + ", IntroLause=" + IntroLause + ", vastaus=" + vaihtoehto + '}';
    }
=======

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author boss
 */
public class Kysymys {

    private Object IntroObjekti;
    private String IntroLause;
    private List<Vastaus> vastaus;
    

    public Kysymys(Object IntroObjekti, String IntroLause, List<Vastaus> vastaus) {
        this.IntroObjekti = IntroObjekti;
        this.IntroLause = IntroLause;
        this.vastaus = vastaus;
    }

    public Object getIntroObjekti() {
        return IntroObjekti;
    }

    public String getIntroLause() {
        return IntroLause;
    }

    public List<Vastaus> getVastaus() {
        return vastaus;
    }

    @Override
    public String toString() {
        return "Kysymys{" + "IntroObjekti=" + IntroObjekti + ", IntroLause=" + IntroLause + ", vastaus=" + vastaus + '}';
    }

    public void setIntroObjekti(Object IntroObjekti) {
        this.IntroObjekti = IntroObjekti;
    }

    public void setIntroLause(String IntroLause) {
        this.IntroLause = IntroLause;
    }

    public void setVastaus(List<Vastaus> vastaus) {
        this.vastaus = vastaus;
    }

>>>>>>> 5b80e6f88e078c8de5397997615f257514e4a84a

}