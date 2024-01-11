package Services;

import models.*;

import java.lang.Module;
import java.util.ArrayList;


public class BD {
    public static int depId;
    public static int ensgId;
    public static int etud;


    public static ArrayList<Departement> departements = new ArrayList<Departement>();
    public static ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
    public static ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    public static ArrayList<Module> modules = new ArrayList<Module>();
    public static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    public static ArrayList<Note> notes = new ArrayList<Note>();
    public static ArrayList<Mod> Mod;

    public  static int getDeptId(){
        depId++;
        return depId;
    }
    public  static int getEnsId(){
        ensgId++;
        return ensgId;
    }



}
