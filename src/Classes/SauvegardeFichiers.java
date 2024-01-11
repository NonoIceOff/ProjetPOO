package Classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SauvegardeFichiers {

    public void save(Object objet) {
        // Sauvegarde
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //Writing the Dog object
            objectOutputStream.writeObject(objet);
            //Close the ObjectOutputStream
            objectOutputStream.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
