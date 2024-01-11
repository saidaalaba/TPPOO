package models;

import java.util.ArrayList;

public class Mod {

    private int idMd;
    private String intitule;
    private Enseignant responsable;
    private Filiere filiere;
    public static ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
    public static ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    public Mod(){

    }
    public Mod(String intitul, Enseignant responsable, Filiere filiere){
        this.intitule=intitul;
        this.responsable=responsable;
        this.filiere=filiere;

    }

    public int getIdMd() {
        return idMd;
    }

    public void setIdMd(int id) {
        this.idMd = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
