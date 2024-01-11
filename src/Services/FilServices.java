package Services;

import models.Departement;
import models.Enseignant;
import models.Filiere;

import java.util.ArrayList;
public class FilServices {

    public static Filiere addFiliere(String intitule, Enseignant responsable, Departement dept) {
        Filiere filiere = new Filiere();
        filiere.setIntitulé(intitule);
        filiere.setResponsable(responsable);
        filiere.setDepartement(dept);


        BD.filieres.add(filiere);


        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String intitule, String chef, String dept){
        for (Filiere filiere : BD.filieres) {
            if (filiere.getIdfil() == id) {
                filiere.setIntitulé(intitule);

                return filiere;
            }
        }

        return  new Filiere();
    }



    public static ArrayList<Filiere> deleteFiliereById(int id){
        return BD.filieres;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  BD.filieres;
    }
}
