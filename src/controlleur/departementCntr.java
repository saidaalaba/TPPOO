package controlleur;

import Services.BD;
import Services.DepServices;
import models.Departement;
import models.Enseignant;
import models.Myscanner;

public class departementCntr {


    private static Enseignant EnsgnServices;

    public static void afficherMenu(){
        System.out.println("taper1:ajouter un departement");
        System.out.println("taper2:modifier un departement");
        System.out.println("taper3:supprimer un departement");
        System.out.println("taper4:afficher un departement");
        int choix =Myscanner.getentier("donner entrer votre choix");
        switch(choix){
            case 1: ajouterdep(); break;
            case 2: modifierdep(); break;
            case 3: supprimer(); break;
            case 4:afficherdep();break;
        }


    }

    private static void ajouterdep() {
        String intitule=Myscanner.getString("donner l'intitule");
        // Affiche tous les enseignants disponibles

        //selectioner un enseignant per id

        int id=Myscanner.getentier("donner l'id de l'enseignant");

        // Appelle la méthode addDeptbd de DepartementServices pour créer un nouveau département

        DepServices.addDept(intitule, EnsgnServices);

        // Affiche la liste des départements mise à jour

      afficherdep();
        // Affiche le menu principal
        afficherMenu();
    }
    private static void modifierdep(){
        // Affiche tous les départements disponibles
        afficherdep();

        // Demande à l'utilisateur de sélectionner un département par ID
        int id = Myscanner.getentier("Sélectionnez un département par ID :");

        // Demande à l'utilisateur d'entrer le nouvel intitulé du département
        String intitule = Myscanner.getString("Entrez l'intitulé :");

        // Affiche tous les enseignants disponibles
        BD.getEnsId();

        // Demande à l'utilisateur de sélectionner un enseignant par ID
        int idEns = Myscanner.getentier("Sélectionnez un enseignant par ID :");

        // Appelle la méthode updateDept de DepartementServices pour effectuer la mise à jour


        // Affiche à nouveau la liste des départements mise à jour
        afficherdep();

        // Affiche le menu principal
        afficherMenu();
    }
    public static void supprimer(){
afficherdep();
//dommander a l'utilisateur de selectionner un dep par id
int id=Myscanner.getentier("donner id d'un departement");

// Appelle la méthode deleteDeptById de DepartementServices pour supprimer le département dans la base de donnee
        DepServices.deleteDeptById(id);

        // Affiche à nouveau la liste des départements mise à jour
        afficherdep();

    }
    public static void afficherdep(){
        for (Departement departementCntr: BD.departements ) {
            System.out.println("Id:"+departementCntr.getId());
            System.out.println("intitul"+departementCntr.getIntitule());

        }

    }


}

