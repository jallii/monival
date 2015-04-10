package harj.monivalinta.model;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;


public class Matsku {

    private List<Kysymys> kysymykset;

    /**
     *
     * @param kysymykset
     */
    public Matsku(List<Kysymys> kysymykset) {
        this.kysymykset = kysymykset;
    }

    /**
     *
     */
    public Matsku() {
    }

//<editor-fold defaultstate="collapsed" desc="comment">
//    /**
//     *
//     * @param mFileName
//     * @throws IOException
//     * @throws ClassNotFoundException
//     */
//    public Matsku(String mFileName) throws IOException, ClassNotFoundException {
//        this.kysymykset=(List<Kysymys>) lueTiedostosta(mFileName);
//    }
//</editor-fold>
    /**
     *
     * @return
     */
    public List< Kysymys> getKysymykset() {
        return kysymykset;
    }

    /**
     *
     * @param kysymykset
     */
    public void setKysymykset(List<Kysymys> kysymykset) {
        this.kysymykset = kysymykset;
    }

    /**
     *
     * @param nimi
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Matsku lueTiedostosta(String nimi) throws IOException, ClassNotFoundException {
        Matsku m;
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(nimi))) {
            m = (Matsku) input.readObject();
        }
        return m;
    }

    /**
     *
     * @param file
     * @return
     */
    public Matsku lueMatskuFile(File file) {
        Matsku m = new Matsku();
        try {
            FileInputStream fis = new FileInputStream(file);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                m = (Matsku) ois.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Matsku.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Matsku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

    /**
     *
     * @param mFileName
     * @return
     */
    public Matsku lueMatskuFile(String mFileName) {
        File file = new File(mFileName);
        return lueMatskuFile(file);
    }

    /**
     *
     * @param m Matsku objekti joka kirjoitetaan tiedostoon
     * @param nimi Tiedoston nimi
     * @throws IOException Tämän avulla tarkastetaan ylemmällä tasolla
     * onnistuiko tiedostoon tallettaminen
     */
    public void kirjoitaTiedostoon(Matsku m, String nimi) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(nimi))) {
            output.writeObject(m);
            output.flush();
            output.close();
        }
    }

    /**
     *
     * @param m
     * @param nimi
     * @return
     * @throws java.io.IOException
     */
    public boolean talletaMatsku(Matsku m, String nimi) throws IOException {
        try {
            kirjoitaTiedostoon(m, nimi);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Matsku.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     *
     * @param mFile
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public boolean talletaMatsku2(File mFile) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(mFile);
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(this);
            oos.flush();
            return true;
        }
    }

}
