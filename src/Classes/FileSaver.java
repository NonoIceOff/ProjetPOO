package Classes;

import java.io.*;
import java.util.ArrayList;

public class FileSaver {
    private String nomFichier;

    public FileSaver(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public void save(Object objet) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(this.nomFichier);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objet);
            objectOutputStream.close();
        }catch(IOException e){
            System.out.println("Erreur : "+e);
        }
    }

    public void load() {
        File fichier =  new File(this.nomFichier) ;

        // ouverture d'un flux sur un fichier
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(fichier));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // désérialization de l'objet
        ArrayList<Integer> m = null;
        try {
            m = (ArrayList<Integer>)ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(m) ;
    }
}
