package Services;

import models.Etudiant;

import java.util.ArrayList;
public class EtudServices {
    public static Etudiant addEtd(String nom, String prenom, String email, int apogee, String filiere){
        Etudiant etudiant = new Etudiant();
        etudiant.setPrenom(prenom);
       etudiant.setEmail(email);
        etudiant.setApoge(apogee);
        etudiant.setFiliere(filiere);


        BD.etudiants.add(etudiant);


        return  new Etudiant();
    }

    public static Etudiant updateEtd(int id,String nom, String prenom, String email, int apogee, String filiere){
        for (Etudiant etudiant : BD.etudiants) {
            if (etudiant.getApoge() == id) {
                etudiant.setPrenom(prenom);
                etudiant.setEmail(email);
                etudiant.setApoge(apogee);
                etudiant.setFiliere(filiere);

                return etudiant;
            }
        }

        return  new Etudiant();
    }


    public static ArrayList<Etudiant> deleteEtdById(){
        return  BD.etudiants;
    }

    public static Etudiant getEtdById(int id){
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtd(){
        return  BD.etudiants;
    }
}
