/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj.monivalinta.model;

import java.util.Map;

/**
 *
 * @author boss
 */
public class Tulokset {
//tulosten talletusta varten
    private Map<Integer, Tulos> tulokset;

    public Tulokset(Map<Integer, Tulos> tulokset) {
        this.tulokset = tulokset;
    }

    public Map<Integer, Tulos> getTulokset() {
        return tulokset;
    }

    public void setTulokset(Map<Integer, Tulos> tulokset) {
        this.tulokset = tulokset;
    }

    //parannellaan myöhemmin
    @Override
    public String toString() {
        return "Tulokset{" + "tulokset=" + tulokset + '}';
    }

}
