package harj.monivalinta.model;

import java.util.List;

public class Kysymys {

    /**
     * Jokaiseen monivalintakysymykseen liittyy jokin IntroObjekti. Se voi olla
     * kuva, video, äänitiedosto, appletti tms. Siksi se on objekti. Aluksi
     * suurin osa on kuvia. Objekti voi liittyä aiheeseen josta kysytään, tai
     * sitten se on muuten vaan mukavan näköinen.
     *
     * Varsinainen kysymysteksti Introlause on koko kysymyksen ydin. Se voi olla
     * pitempikin tekstinpätkä.
     *
     * Introlauseeseen liittyy useimmiten 2-5 mutta tarvittaessa vaikka 10
     * kappaletta erilaisia väitelauseita, joihin totuusarvosta on kyse. Siksi
     * lista.
     */
    private Object IntroObjekti;
    private String IntroLause;
    private List<Vastaus> vaihtoehdot;
    private static Vastaus Vastaus;

    //*** CONSTRUKTORIT ****
    /**
     *
     * @param IntroObjekti
     * @param IntroLause
     * @param v vaihtoehdot
     */
    public Kysymys(Object IntroObjekti, String IntroLause, List<Vastaus> v) {
        this.IntroObjekti = IntroObjekti;
        this.IntroLause = IntroLause;
        this.vaihtoehdot = v;
    }

    public Kysymys() {
    }

    public Kysymys(Object IntroObjekti, String IntroLause) {
        this.IntroObjekti = IntroObjekti;
        this.IntroLause = IntroLause;
    }

    public Kysymys(List<Vastaus> vaihtoehto) {
        this.vaihtoehdot = vaihtoehto;
    }

    public Kysymys(String IntroLause, List<Vastaus> vaihtoehdot) {
        this.IntroLause = IntroLause;
        this.vaihtoehdot = vaihtoehdot;
    }

    public Kysymys(int n) {
        this.IntroObjekti = "";
        this.IntroLause = "";
    }

//    Vastaus v= new Vastaus();
//     int i;
//        for (i=0;i<n;i++)
//        {  v.add(v);}
//        this.vaihtoehdot= vl ;
        //*** SETTERIT ****
//
//    public void setIntroObjekti(Object IntroObjekti) {
//        this.IntroObjekti = IntroObjekti;
//    }
//
//    public void setIntroLause(String IntroLause) {
//        this.IntroLause = IntroLause;
//    }
//
//    public void setVaihtoehdot(List<Vastaus> v) {
//        this.vaihtoehdot = v;
//    }
//
//    public void lisaaVaihtoehdot(Vastaus v) {
//        this.vaihtoehdot.add(v);
//    }
//
//    public void lisaaVastaukseenVaihtoehto(){
//    
//    }
//    
//    //*** GETTERIT ****
    /**
     *
     * @return
     */
    public Object getIntroObjekti() {
        return IntroObjekti;
    }

    /**
     *
     * @return
     */
    public String getIntroLause() {
        return IntroLause;
    }

    /**
     *
     * @return
     */
    public List<Vastaus> getVaihtoehdot() {
        return vaihtoehdot;
    }

//
//    public List<String> getVaihtoehdot(Kysymys k){
//        
//        List<String> stringList = new ArrayList<>();
//        String st="";
//        Iterator itr =this.getVaihtoehto().iterator();
// 
//     return apu;
//}
//
//    
//    public String esitaVaihtoehto(Vastaus v) {
//        return v.getVastauslause();
//    }
//
//    public void valitseVaihtoehto(Vastaus v) {
//        v.setOnkoVastausValittu(Boolean.TRUE);
//    }
//
//    public boolean tarkistaVaihtoehto(Vastaus v) {
//        boolean oikeaVastaus;
//        oikeaVastaus = (v.getOnkoVastausValittu()) & (v.getVastauksenTotuusarvo())
//                | ((!v.getOnkoVastausValittu()) & (!v.getVastauksenTotuusarvo()));
//        return oikeaVastaus;
//    }
//
//    @Override
//    public String toString() {
//        return "Kysymys{" + "IntroObjekti=" + IntroObjekti + ", IntroLause=" + IntroLause + ", vastaus=" + vaihtoehdot + '}';
//    }
//
//    private static class ListImpl implements List<Vastaus> {
//
//        public ListImpl() {
//        }
//    }
//    private static class ListImpl implements List<Vastaus> {
//
//        public ListImpl() {
//        }
//    }
    
}
