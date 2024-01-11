package Services;

import models.Departement;
import models.Enseignant;

import java.util.ArrayList;

public class EnsgnServices {

    private static Module Modules;

    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departement dept){

        Enseignant enseignant = new Enseignant();
       enseignant.setNom(nom);
       enseignant.setEmail(email);
       enseignant.setPrenom(prenom);
       enseignant.setGrade(grade);
       enseignant.setDepartement(dept);


        
       BD.enseignants.add(enseignant);

      

        return  new Enseignant();
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departement dept) {
        for (Enseignant enseignant : BD.enseignants) {
            if (enseignant.getId() == id) {
                enseignant.setNom(nom);
                enseignant.setPrenom(prenom);
                enseignant.setEmail(email);
                enseignant.setGrade(grade);
                enseignant.setDepartement(dept);
                return enseignant;
            }

        }
        return new Enseignant();
    }

    public static ArrayList<Enseignant> deleteEnsById(int id){
        BD.enseignants.remove(getEnsById(id));

        return  BD.enseignants;
    }
    public static Enseignant getEnsById(int id){
        for (Enseignant enseignant : BD.enseignants) {
            if (enseignant.getId() == id)
                return enseignant;
        }
        return  new Enseignant();
    }

    public static ArrayList<Enseignant> getAllEns(){


        return BD.enseignants;
    }



}


