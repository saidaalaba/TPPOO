package controlleur;

import Services.BD;
import Services.FilServices;
import models.Filiere;
import models.Myscanner;
public class FiliereCntr {

    public static void afficherMenu() {
        System.out.println("taper1:ajouter un filiere");
        System.out.println("taper2:modifier un filiere");
        System.out.println("taper3:supprimer filiere");
        System.out.println("taper4:afficher un filiere");
        int choix = Myscanner.getentier("donner entrer votre choix");
        switch (choix) {
            case 1:
                ajouterfiliere();
                break;
            case 2:
                modifiertfiliere();
                break;
            case 3:
                supprimerfiliere();
                break;
            case 4:
                afficherfiliere();
                break;
        }

    }
    public static void ajouterfiliere() {
        String intitulé =Myscanner.getString("donner l'i,titulée");
        int id=Myscanner.getentier("donner l'id de l'enseignant");
        int idDep=Myscanner.getentier("selectioner le departement ");

    }
    public static void modifiertfiliere(){
        afficherfiliere();
      //domander a l'uttilisateur de selectioner un filiere par id
        int idfiliere=Myscanner.getentier("selectioner un filiere par un id");
        String intitule=Myscanner.getString("");
        String chef=Myscanner.getString("donner chef");
        String dep=Myscanner.getString("donner dep");

       FilServices.updateFiliere(idfiliere,intitule,chef,dep);

    }
    public static void supprimerfiliere(){
        int idfiliere=Myscanner.getentier("selectiner une filiere par id ");

        // Appelle la méthode deleteFiliereByIdde FilServices pour supprimer un  filiere dans la base de donnee
        FilServices.deleteFiliereById(idfiliere);

    }
    public static void afficherfiliere(){
        for ( Filiere FiliereCntr:BD.filieres) {
            System.out.println("intitulé"+FiliereCntr.getIntitulé());
            System.out.println("responsable"+FiliereCntr.getResponsable());
            System.out.println("departement"+FiliereCntr.getDepartement());


        }
    }


}
