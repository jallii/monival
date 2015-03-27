/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj.monivalinta.model;

import harj.monivalinta.model.Vastaus;
import java.util.Map;

/**
 *
 * @author boss
 */
public class Vastaukset {

    private Map<Integer, Vastaus> vastauksetNumeronPerusteella;

    public Vastaukset(Map<Integer, Vastaus> vastauksetNumeronPerusteella) {
        this.vastauksetNumeronPerusteella = vastauksetNumeronPerusteella;
    }

    public Map<Integer, Vastaus> getVastauksetNumeronPerusteella() {
        return vastauksetNumeronPerusteella;
    }

    public void setVastauksetNumeronPerusteella(Map<Integer, Vastaus> vastauksetNumeronPerusteella) {
        this.vastauksetNumeronPerusteella = vastauksetNumeronPerusteella;
    }

    @Override
    public String toString() {
        return "Vastaukset{" + "vastauksetNumeronPerusteella=" + vastauksetNumeronPerusteella + '}';
    }

}
