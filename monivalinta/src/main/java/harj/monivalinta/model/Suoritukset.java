/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj.monivalinta.model;

import java.util.List;

/**
 *
 * @author boss
 */
public class Suoritukset {
//tulosten talletusta varten
    private List<Tulos> suoritukset;

    public Suoritukset(List<Tulos> suoritukset) {
        this.suoritukset = suoritukset;
    }

    public Suoritukset() {
      
    }
    public List<Tulos> getSuoritukset() {
        return suoritukset;
    }

    public void setSuoritukset(List<Tulos> suoritukset) {
        this.suoritukset = suoritukset;
    }

    @Override
    public String toString() {
        return "Suoritukset{" + "suoritukset=" + suoritukset + '}';
    }

   
    
   

    
 
}
