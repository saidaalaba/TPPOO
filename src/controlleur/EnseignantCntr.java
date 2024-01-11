package controlleur;

import Services.BD;
import Services.DepServices;
import Services.EnsgnServices;
import models.Enseignant;
import models.Myscanner;

public class EnseignantCntr {

    public static void afficherMenu() {
        System.out.println("taper1:ajouter un enseignant");
        System.out.println("taper2:modifier un enseignant");
        System.out.println("taper3:supprimer enseignant");
        System.out.println("taper4:afficher un enseignant");
        int choix = Myscanner.getentier("donner entrer votre choix");
        switch (choix) {
            case 1:
              ajouterEns();
                break;
            case 2:
                modifierEns();
                break;
            case 3:
                supprimerEns();
                break;
            case 4:
                afficherEns();
                break;
        }

    }

    public static void ajouterEns() {
        int id =Myscanner.getentier("donner l id");
        String grade=Myscanner.getString("donner le grade");
        String nom=Myscanner.getString("donner le nom");
        String prenom=Myscanner.getString("donner le prenom");
        String email=Myscanner.getString("donner le email");

        int idd = Myscanner.getentier("selectioner un dep par id");

        // Appelle la méthode addEns de DepartementServices pour créer un nouveau département
       EnsgnServices.addEns(nom,prenom,email,grade, DepServices.getDeptById(idd));
        // Affiche la liste des départements mise à jour
       afficherEns();

        // Affiche le menu principal
        afficherMenu();




    }

    public static void modifierEns() {

        // Affiche tous les Enseingnant disponibles
        afficherEns();

        // Demande à l'utilisateur de sélectionner un enseignant par ID
        int id = Myscanner.getentier("Sélectionnez un département par ID :");

        // Demande à l'utilisateur d'entrer le nouvel nom de l'enseignant
        String nom = Myscanner.getString("Entrez le nom :");

        // Demande à l'utilisateur d'entrer le nouvel email de l'enseignant
        String email = Myscanner.getString("Entrez l'email :");

        // Demande à l'utilisateur d'entrer le nouvel grade de l'enseignant
        String grad = Myscanner.getString("Entrez le grad:");

        // Demande à l'utilisateur d'entrer le nouvel departement de l'enseignant
        String departement = Myscanner.getString("Entrez le departement :");


    }

    public static void afficherEns(){
       /* for (Enseignant EnseignantCntr: BD.enseignants) {
            System.out.println("id: "+EnseignantCntr.getId());
            System.out.println("nom: "+EnseignantCntr.getNom());
            System.out.println("prenom: "+EnseignantCntr.getPrenom());
            System.out.println("email: "+EnseignantCntr.getEmail());
            System.out.println("grade: "+EnseignantCntr.getGrade());
            System.out.println("departement: "+EnseignantCntr.getDepartement());*/
        for (Enseignant EnseignantCntr : BD.enseignants) {
            System.out.print("Id : " + EnseignantCntr.getId());
            System.out.print(" | Nom : " + EnseignantCntr.getNom() + " " + EnseignantCntr.getPrenom());
            System.out.print(" | Email : " + EnseignantCntr.getEmail() );
            if (EnseignantCntr.getDepartement() != null) {

                int departementId = EnseignantCntr.getDepartement().getId();
                System.out.println("departement= "+departementId);
            } else {

                System.out.println(" ");
            }
        }




    }
    public static void supprimerEns(){
        //domander a l'utilisateur de selectiner un enseignant par id
        int id=Myscanner.getentier("donner l'id d'enseignant");
        EnsgnServices.deleteEnsById(id);

    }

}
