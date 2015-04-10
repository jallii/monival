/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj.monivalinta.model;

/**
 *
 * @author boss
 */
public class User {

    String password;
    String etunimi;
    String sukunimi;
    Tulos tulos;
    Suoritukset suoritukset;

    public User() {
            }

    public String getPassword() {
        return password;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public Tulos getTulos() {
        return tulos;
    }

    public Suoritukset getSuoritukset() {
        return suoritukset;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public void setTulos(Tulos tulos) {
        this.tulos = tulos;
    }

    public void setSuoritukset(Suoritukset suoritukset) {
        this.suoritukset = suoritukset;
    }

    public String kryptaa(String plainPw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
