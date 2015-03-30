package harj.monivalinta.model;

import java.util.List;

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


}