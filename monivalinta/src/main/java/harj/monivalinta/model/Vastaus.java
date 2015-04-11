package harj.monivalinta.model;

public class Vastaus {

    /**
     * Kunkin vastausvaihtoehdon kohdalla 
     * talletetaan erikseen väitelause ja sen
     * boolean totuusarvo. 
     * Tällä ratkaisulla pisteytys ei ole sidottu vain yhteen
     * oikeaan vaihtoehtoon kuhunkin kysymykseen vaan oikeita vastauksia
     * voi olla vapaa lukumäärä ja pisteytys voidaan rakentaa itsenäisesti.
     * Viimeinen boolean arvo onkoVastausValittu on sitä varten, että voidaan
     * rakentaa käyttäjän vastausvalinnat suoraan käyttäjälle esitettävään
     * kokoelmaolioon. Pistelasku onnistuu yksinkertaisesti vertaamalla kahta
     * boolean kenttää.
     */
    private String vastauslause;
    private Boolean onkoVastausTosi;
    private Boolean onkoVastausValittu;

//<editor-fold defaultstate="collapsed" desc="CONSTRUKTORIT">
    /**
     *
     * @param lause viittaa kunkin vastauksen väitelauseeseen
     * @param onkoTosi sisältää oikean vastauksen. Eli kunkin väitelauseen
     * kohdalla talletetaan erikseen se, onko väite totta vai ei. Piilotetun
     * parametrin onkoVastausValittu avulla hoidetaan kuhunkin olioon liittyvä
     * kyselyn vastaaminen. Olio on luotava uudestaan aina uutta kyselyä varten.
     * Vastaus olioden lista talletetaan lopuksi suoritus olioon jossa ei ole
     * metodeja vastauksien muuttamiseen. Kysymys luokka kokoaa kaikki
     * kysymyksen osat yhteen ja pitää huolen, siitä mitkä kaikki muuta osat ja
     * vastaukset liittyvät kuhunkin kysymykseen.
     */
    public Vastaus(String lause, Boolean onkoTosi) {
        this.vastauslause = lause;
        this.onkoVastausTosi = onkoTosi;
        this.onkoVastausValittu = false;
    }

    /**
     * Alustaa epätodeksi annetulla väitelauseella
     * @param vastauslause 
     */
    public Vastaus(String vastauslause) {
        this.vastauslause = vastauslause;
        this.onkoVastausTosi = false;
        this.onkoVastausValittu = false;
    }

    /**
     * Alustaa tyhjällä epätodella väitelauseella 
     */
    public Vastaus() {
        this.vastauslause = "";
        this.onkoVastausTosi = false;
        this.onkoVastausValittu = false;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="SETTERIT">
    /**
     *
     * @param vastauslause sisältää vastausvaihtoehdon väitelaueen joka on siis
     * joko toi tai epätosi.
     */
    public void setVastauslause(String vastauslause) {
        this.vastauslause = vastauslause;
    }

    /**
     *
     * @param onkoVastausTosi sisältää tiedon siitä onko vastauksen väite
     * lause tosi tai ei
     */
    public void setOnkoVastausTosi(Boolean onkoVastausTosi) {
        this.onkoVastausTosi = onkoVastausTosi;
    }

    /**
     *
     * @param onkoVastausValittu sisältää oppilaan valinnan, eli pitääkö hän
     * tätä vaihtoehtoa totena vai epätotena Onko oppilas vastannut oikein
     * saadaan selville vertaamalla vastauksen totuusarvoa tähän oppilaan
     * valintaan.
     */
    public void setOnkoVastausValittu(Boolean onkoVastausValittu) {
        this.onkoVastausValittu = onkoVastausValittu;
    }
//</editor-fold>    
//<editor-fold defaultstate="collapsed" desc="GETTERIT">

    /**
     *
     * @return palauttaa vastausvaihtoehdon väitelauseen
     */
    public String getVastauslause() {
        return vastauslause;
    }

    /**
     *
     * @return onkoVastausTosi palauttaa true, jos vastausvaihtoehto on
 tosi
     */
    public Boolean getOnkoVastausTosi() {
        return onkoVastausTosi;
    }

    /**
     *
     * @return palauttaa true, jos käyttäjä on valinnut/pitää tätä vastausta
     * totena
     */
    public boolean getOnkoVastausValittu() {
        return onkoVastausValittu;
    }

    /**
     *
     * @return true vain kun tosi vastaus on valittu palauttaa false jos väärä
     * ei ole valittuna
     */
    public boolean getOnkoOikeaValittu() {
        boolean apu = false;
        if (this.onkoVastausTosi && this.onkoVastausValittu) {
            apu = true;
        }
        return apu;
    }

    /**
     *
     * @return true kun tosi vastaus on valittu tai epätosi on valitsematta
     * palauttaa siis myös true jos väärä väite on valitsematta
     */
    public boolean getOnkoOikeinValittu() {
        boolean apu = false;
        if (this.onkoVastausTosi && this.onkoVastausValittu) {
            apu = true;
        }
        if ((!this.onkoVastausTosi && !this.onkoVastausValittu)) {
            apu = true;
        }
        return apu;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="TO STRING">

    @Override
    public String toString() {
        return "Vastaus{" + "vastauslause=" + vastauslause + '}';
    }

    public String toStringVastausLause() {
        return vastauslause;
    }

    public String toStringOikeaVastaus() {
        if (onkoVastausTosi) {
            return vastauslause;
        } else {
            return "";
        }
    }

    public String toStringVaaraVastaus() {
        if (!onkoVastausTosi) {
            return vastauslause;
        } else {
            return "";
        }
    }

    public String toStringOikeinValittuVastaus() {
        if (this.getOnkoOikeinValittu()) {
            return vastauslause;
        } else {
            return "";
        }
    }

    public String toStringValittuVastaus() {
        if (this.getOnkoVastausValittu()) {
            return vastauslause;
        } else {
            return "";
        }
    }
//</editor-fold>
}
