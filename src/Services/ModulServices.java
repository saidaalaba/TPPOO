package Services;

import models.Enseignant;
import models.Filiere;
import models.Mod;

import java.util.ArrayList;

public class ModulServices {


    public static Mod addFiliere(String intitule, Enseignant chef, Filiere filiere) {

        return new Mod();
    }

    public static Mod updateFiliere(int id , String intitule, Enseignant chef, Filiere filiere){
        return  new Mod();
    }
    public static void deleteModuleById(int id){

    }

    public static Mod getModuleById(int id){
        return  new Mod();
    }

    public static ArrayList<java.lang.Module> getAllModule(){
        return  BD.modules;
    }

}
