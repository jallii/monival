package harj.monivalinta.model;

import java.security.MessageDigest;
import java.util.UUID;

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
    
public String kryptaa(String pw) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(pw.getBytes());
        byte byteData[] = md.digest();

        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
    public String teeRandomSalasana() {
        return UUID.randomUUID().toString();
    }  
    
     public boolean tarkistaSalasana(String plainPw) throws Exception {
         return this.password.equals(kryptaa(plainPw));
    }

    
}
