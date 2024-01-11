package models;

import java.util.ArrayList;

public class Etudiant extends Personne {
    int apoge;
    Filiere filiere;

    ArrayList<Filiere> filieres = new ArrayList<Filiere>();

    public Etudiant(int apoge, Filiere filiere, String nom, String prenom, String email){
        super(nom,prenom,email);
        this.apoge=apoge;

        this.filiere=filiere;

    }

    public Etudiant() {
        super();
    }


    public  int getApoge() {
        return apoge;
    }

    public void setApoge(int apoge) {
        this.apoge = apoge;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = this.filiere;
    }


}

