package Services;
import models.Departement;
import models.Enseignant;
import java.util.ArrayList;

public class DepServices {



    public static Departement addDept(String intitule, Enseignant... chef) {
        // Crée une nouvelle instance de la classe Departement
        Departement departement = new Departement();

        // Initialise l'intitulé du département avec la valeur fournie
        departement.setIntitule(intitule);

        // Initialise l'ID du département en utilisant une méthode fictive getDeptId() de la classe DB
        departement.setId(BD.getDeptId());

        // Si un enseignant (chef) est fourni en argument, attribue-le comme chef du département
        if (chef.length > 0) {
            departement.setResponsable(chef[0]);
        }

        // Ajoute le département à la liste fictive de départements stockée dans la classe DB
       BD.departements.add(departement);

        // Renvoie l'objet département nouvellement créé
        return departement;
    }
    public static Departement updateDept(int id , String intitule, Enseignant... chef){
        for (Departement departement : BD.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (chef.length > 0){
                    departement.setResponsable(chef[0]);
                }
                return departement;
            }
        }

        return  new Departement();
    }

    public static ArrayList<Departement>  deleteDeptById(int id){
        BD.departements.remove(getDeptById(id));
        return BD.departements ;
    }
    public static Departement getDeptById(int id){
        for (Departement departement : BD.departements) {
            if (departement.getId() == id) return  departement;
        }
        return  new Departement();
    }

    public static ArrayList<Departement> getAllDept(){

        return  BD.departements;
    }
}
