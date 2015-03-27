package harj.monivalinta.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author boss
 */
public class Vastaus {

    //Kunkin Vastausvaihtoehdon kohdalla talletetaan 
    //erikseen väitelause ja sen totuusarvo
    //tällä ratkaisulla pisteytys ei ole sidottu
    //vain yhteen oikeaan vaihtoehtoon kuhunkin kysymykseen
    //vaan oikeita vastauksia voi olla vapaa lukumäärä
    //ja pisteytys voidaan rakentaa itsenäisesti
    //Viimeinen boolean arvo on sitä varten, että
    //voidaan rakentaa käyttäjän vastausvalinnat suoraan  
    //käyttäjälle esitettävään kokoelmaolioon.
    //Piste lasku onnistuu yksinkertaisesti vertaamalla 
    //kahta boolean kenttää.

    private String vastauslause = "";
    private Boolean vastauksenTotuusarvo = false;
    private Boolean onkoVastausValittu = false;

    /**
     *
     * @param lause viittaa kunkin vastauksen väitelauseeseen
     * @param onkoTosi sisältää oikean vastauksen. Eli kunkin väitelauseen
     * kohdalla talletetaan erikseen se, onko väite totta vai ei Kysymys
     * luokkapitää huolen, siitä mitkä kaikki vastauksen liittyvät kuhunkin
     * kysymykseen
     */
    public Vastaus(String lause, Boolean onkoTosi) {
        this.vastauslause = lause;
        this.vastauksenTotuusarvo = onkoTosi;
        this.onkoVastausValittu = false;
    }

    //*** SETTERIT ****
    public void setVastauslause(String vastauslause) {
        this.vastauslause = vastauslause;
    }

    public void setVastauksenTotuusarvo(Boolean vastauksenTotuusarvo) {
        this.vastauksenTotuusarvo = vastauksenTotuusarvo;
    }

    public void setOnkoVastausValittu(Boolean onkoVastausValittu) {
        this.onkoVastausValittu = onkoVastausValittu;
    }

    //*** GETTERIT ***
    public String getVastauslause() {
        return vastauslause;
    }

    public Boolean getVastauksenTotuusarvo() {
        return vastauksenTotuusarvo;
    }

    public Boolean getOnkoVastausValittu() {
        return onkoVastausValittu;
    }

    @Override
    public String toString() {
        return "Vastaus{" + "vastauslause=" + vastauslause + '}';
    }

    public String toStringOikeatVastaukset() {
        return "Vastaus{" + "vastauslause=" + vastauslause + ", Tämä vastaus on oikein: =" + vastauksenTotuusarvo + '}';
    }

    public String toStringOikeatJaValitutVastaukset() {
        return "Vastaus{" + "vastauslause=" + vastauslause + ", Vastauksen totuus: " + vastauksenTotuusarvo + ", Tämä vastaus valittiin: " + onkoVastausValittu + '}';
    }

    public String toStringValitutVastaukset() {
        return "Vastaus{" + "vastauslause=" + vastauslause + ", Opiskelijan valinnat: " + onkoVastausValittu + '}';
    }

}
