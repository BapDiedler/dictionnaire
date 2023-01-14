package affichage;

import javax.swing.*;

public class Ecran{
    private final JFrame fenetre;

    /**
     * constructeur de la classe Ecran
     * @param titre titre que l'on donne à la fenetre
     */
    public Ecran(String titre) {
        fenetre = new JFrame(titre);
        fenetre.setSize(1000,1000);
        fenetre.setVisible(true);
    }

    public Ecran(){
        this("DICTIONNAIRE");
    }

    /**
     * méthode qui ferme la fenêtre
     */
    public void close(){
        fenetre.setDefaultCloseOperation(3);
    }
}
