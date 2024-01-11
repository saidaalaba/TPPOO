package models;

import java.util.ArrayList;


public class Filiere {
    int idfil;
    String intitulé;
    Enseignant responsable;
    Departement departement;
    ArrayList<Mod> filieres = new ArrayList<Mod>();

    public Filiere(String intitulé, Enseignant responsable, Departement deparetement) {

        this.departement = deparetement;
        this.intitulé = intitulé;
        this.responsable = responsable;
    }

    public Filiere() {

    }

    public int getIdfil() {
        return idfil;
    }

    public void setIdfil(int idfil) {
        this.idfil = idfil;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public ArrayList<Mod> getFilieres() {
        return filieres;
    }

    public void setFilieres(ArrayList<Mod> filieres) {
        this.filieres = filieres;
    }

    public static Filiere addfiliere() {
        System.out.println("entrer");

        return null;
    }
}


