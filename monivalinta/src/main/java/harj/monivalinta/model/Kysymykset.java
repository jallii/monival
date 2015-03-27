package harj.monivalinta.model;

import java.util.List;
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
public class Kysymykset {

    private Map<Integer, Kysymys> kysymyksetNumeronPerusteella;

    public Kysymykset(Map<Integer, Kysymys> kysymyksetNumeronPerusteella) {
        this.kysymyksetNumeronPerusteella = kysymyksetNumeronPerusteella;
    }

    public Map<Integer, Kysymys> getKysymyksetNumeronPerusteella() {
        return kysymyksetNumeronPerusteella;
    }

    public void setKysymyksetNumeronPerusteella(Map<Integer, Kysymys> kysymyksetNumeronPerusteella) {
        this.kysymyksetNumeronPerusteella = kysymyksetNumeronPerusteella;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kysymykset other = (Kysymykset) obj;
        if (!Objects.equals(this.kysymyksetNumeronPerusteella, other.kysymyksetNumeronPerusteella)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.kysymyksetNumeronPerusteella);
        return hash;
    }
}
