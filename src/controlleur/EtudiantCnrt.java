package controlleur;

import Services.BD;
import Services.EtudServices;
import models.Etudiant;
import models.Myscanner;
public class EtudiantCnrt {

    public static void afficherMenu(){
        System.out.println("taper1:ajouter un etudiant");
        System.out.println("taper2:modifier un etudiant");
        System.out.println("taper3:supprimer unetudiant");
        System.out.println("taper4:afficher un etudiant");
        int choix = Myscanner.getentier("donner entrer votre choix");
        switch(choix){
            case 1: ajouterEtud(); break;
            case 2: modifiertEtud(); break;
            case 3: supprimerEtud(); break;
            case 4:afficherEtud();break;
        }

}
   public static void ajouterEtud() {
        String nom=Myscanner.getString("donner le nom de l'etudiant");
        String prenom=Myscanner.getString("donner le prenom de l'etudiant");
        String email=Myscanner.getString("donner le mail de l'etudiant");
      int apog=Myscanner.getentier("donner l'apoget de l'etudiant");
        String filiere=Myscanner.getString("donner filiere");

        // Appelle la méthode addEtd de EtudiantBD pour créer un nouveau département
          EtudServices.addEtd(nom,prenom,email,apog,filiere);
        // Affiche la liste des etudiants mise à jour
          afficherEtud();
        // Affiche le menu principal
        afficherMenu();
    }


    public static void afficherEtud(){
        for (Etudiant EtudiantCnrt: BD.etudiants ) {
            System.out.println("apogée:"+EtudiantCnrt.getApoge());
            System.out.println("nom"+EtudiantCnrt.getNom());
            System.out.println("prenom"+EtudiantCnrt.getPrenom());
            System.out.println("email"+EtudiantCnrt.getNom());
            System.out.println("filier"+EtudiantCnrt.getFiliere());
        }
    }


    public static void modifiertEtud(){


            // Affiche tous la liste d'etudiants
            afficherEtud();

            // Demande à l'utilisateur de sélectionner un etudiant avec apoge
            int id = Myscanner.getentier("Sélectionnez un etudiant par apogée :");

            // Demande à l'utilisateur d'entrer le nouvel nom d'etudiant
            String nom = Myscanner.getString("Entrez le nom :");

        // Demande à l'utilisateur d'entrer le nouvel prenom d'etudiant
        String prenom = Myscanner.getString("Entrez le prenom :");

        // Demande à l'utilisateur d'entrer le nouvel email d'etudiant
        String email = Myscanner.getString("Entrez le email :");

        // Demande à l'utilisateur d'entrer le nouvel filiere d'etudiant
        String filiere = Myscanner.getString("Entrez filiere :");


    }
    public static void supprimerEtud(){
        afficherEtud();
//dommander a l'utilisateur de selectionner un etudiant par apoge
        int apoge=Myscanner.getentier("donner apogee d'un etudiant");

// Appelle la méthode deleteEtudtByApoge de DepartementServices pour supprimer le département dans la base de donnee
        EtudServices.deleteEtdById();

        // Affiche à nouveau la liste des départements mise à jour
        afficherEtud();

    }





}


