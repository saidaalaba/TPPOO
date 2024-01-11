package controlleur;

import Services.BD;
import Services.DepServices;
import Services.EnsgnServices;
import models.Mod;
import models.Myscanner;
import Services.ModulServices;


public class ModuleCntr {


    public static void afficherMenu() {
        System.out.println("taper1:ajouter un module");
        System.out.println("taper2:modifier un module");
        System.out.println("taper3:supprimer un module");
        System.out.println("taper4:afficher un module");
        int choix = Myscanner.getentier("donner entrer votre choix");
        switch (choix) {
            case 1:
                ajoutermodul();
                break;
            case 2:
                modifiermodul();
                break;
            case 3:
                supprimermodul();
                break;
            case 4:
                affichermodul();
                break;
        }


    }
public static void ajoutermodul(){

      String intitule=Myscanner.getString("donner l'intitulé");
      String filier=Myscanner.getString("donner filiere");
    //selectioner un enseignant per id

    int id=Myscanner.getentier("donner l'id de l'enseignant");

    // Appelle la méthode addfilierebd de DepartementServices pour créer un nouveau département
    DepServices.addDept(intitule, EnsgnServices.getEnsById(id));

}

  public static void   modifiermodul(){
        //domander a l'utilisateur de selectionner un un mosule par id
      int id=Myscanner.getentier("selectioner un module par id");
      //domander a l'utilisateur de saisir la nouvell donner
       String intitulé=Myscanner.getString("dooner l'intitulé");
      String filiere=Myscanner.getString("dooner la filiere");
      //selectioner  un enseignant par id comme nouveau prof
     int idens=Myscanner.getentier("selectioner un enseignant");

  }

   public static void  supprimermodul(){
       //domander a l'utilisateur de selectionner un un mosule par id
       int id=Myscanner.getentier("selectioner un module par id");

       // Appelle la méthode deleteMdltById de ModulServices pour supprimer le département dans la base de donnee
       ModulServices.deleteModuleById(id);

       // Affiche à nouveau la liste des départements mise à jour
       affichermodul();


   }
    public static void affichermodul() {
        for (Mod module : BD.Mod) {
            System.out.println("intitulé : " + module.getIntitule());
            System.out.println("filiere : " + module.getFiliere());
            System.out.println("responsable : " + module.getResponsable());
        }
    }
}
