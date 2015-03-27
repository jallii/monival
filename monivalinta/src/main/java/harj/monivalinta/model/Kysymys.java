package harj.monivalinta.model;

import harj.monivalinta.model.Vastaukset;
import java.util.Map;
import java.util.Objects;

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

    private int nro;
    private String kysymysLause;
    private Map<Integer, Vastaukset> vastausVaihtoehdot;

    public Kysymys(int nro, String kysymysLause, Map<Integer, Vastaukset> vastausVaihtoehdot) {
        this.nro = nro;
        this.kysymysLause = kysymysLause;
        this.vastausVaihtoehdot = vastausVaihtoehdot;
    }

    public Kysymys(String kysymysLause, Map<Integer, Vastaukset> vastausVaihtoehdot) {
        this.kysymysLause = kysymysLause;
        this.vastausVaihtoehdot = vastausVaihtoehdot;
    }

    public int getNro() {
        return nro;
    }

    public String getKysymysLause() {
        return kysymysLause;
    }

    public Map<Integer, Vastaukset> getVastausVaihtoehdot() {
        return vastausVaihtoehdot;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setKysymysLause(String kysymysLause) {
        this.kysymysLause = kysymysLause;
    }

    public void setVastausVaihtoehdot(Map<Integer, Vastaukset> vastausVaihtoehdot) {
        this.vastausVaihtoehdot = vastausVaihtoehdot;
    }

    public int hashCodeKysymysNro() {
        int hash = 3;
        hash = 83 * hash + this.nro;
        return hash;
    }

    public boolean equalsKysymysNro(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kysymys other = (Kysymys) obj;
        if (this.nro != other.nro) {
            return false;
        }
        return true;
    }

    public int hashCodeKysymysLause() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.kysymysLause);
        return hash;
    }

    public boolean equalsKysymysLause(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kysymys other = (Kysymys) obj;
        if (!Objects.equals(this.kysymysLause, other.kysymysLause)) {
            return false;
        }
        return true;
    }

    public boolean equalsKysymys(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kysymys other = (Kysymys) obj;
        if (this.nro != other.nro) {
            return false;
        }
        if (!Objects.equals(this.kysymysLause, other.kysymysLause)) {
            return false;
        }
        if (!Objects.equals(this.vastausVaihtoehdot, other.vastausVaihtoehdot)) {
            return false;
        }
        return true;
    }

    public String toStringKysymysJaVastausVaihtoehdot() {
        return "Kysymys{" + "vastausVaihtoehdot=" + vastausVaihtoehdot + '}';
    }

    public String toStringKysymysNro() {
        return "Kysymys{" + "nro=" + nro + '}';
    }

    @Override
    public String toString() {
        return "Kysymys{" + "nro=" + nro + ", kysymysLause=" + kysymysLause + ", vastausVaihtoehdot=" + vastausVaihtoehdot + '}';
    }

}
