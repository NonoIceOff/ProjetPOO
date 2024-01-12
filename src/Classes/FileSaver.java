package Classes;

import java.io.*;
import java.util.ArrayList;

public class FileSaver {
    private String nomFichier;

    public FileSaver(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getNomFichier() {
        /**
         Méthode permettant d'obtenir le nom du fichier de sauvegarde
         Retourne le nom (String)
         */
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        /**
         Méthode permettant de fixer le nom du fichier de sauvegarde
         Retourne rien mais change le nom du fichier à partir de la variable de la classe instanciée
         */
        this.nomFichier = nomFichier;
    }

    public void save(Object objet) {
        /**
         Méthode permettant de sauvegarder un type "Object" dans un fichier qui à pour nom la variable this.nom
         Paramètre : un Object : cela peut-être tout type de variable
         Retourne rien mais crée le fichier de sauvegarde et écrit des données, pour ensuite fermer ce dernier.
         */
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
        /**
         Méthode permettant de charger les données qui sont stockés dans le fichier de sauvegarde
         Retourne rien mais affiche les données stockés dans le fichier de sauvegarde
         */
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