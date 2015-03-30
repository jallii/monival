package harj.monivalinta.model;

import java.util.List;
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
public class Matsku {

    private List<Kysymys> kysymykset;

    public Matsku(List<Kysymys> kysymyksetNumeronPerusteella) {
        this.kysymykset = kysymyksetNumeronPerusteella;
    }

    public List< Kysymys> getKysymyksetNumeronPerusteella() {
        return kysymykset;
    }

    public void setKysymyksetNumeronPerusteella(List<Kysymys> kysymykset) {
        this.kysymykset = kysymykset;
    }

}
