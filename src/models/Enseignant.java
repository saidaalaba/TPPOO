package models;
import java.util.ArrayList;
 public class Enseignant extends Personne {
     int id;
    String grade;
    Departement departement;

     ArrayList<Mod> modules = new ArrayList<Mod>();
    public Enseignant(String nom, String prenom, String email,String grade,Departement departement) {
        super(nom, prenom, email);
        this.departement=departement;
        this.grade=grade;
    }

     public Enseignant() {
         super();
     }

     public Enseignant(int idEnseignant, String nom, String prenom, String email, String grade, Departement departement) {
         super(nom, prenom, email);
         this.departement=departement;
         this.grade=grade;
         this.id=idEnseignant;
     }


     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public ArrayList<Mod> getModules() {
         return modules;
     }

     public void setModules(ArrayList<Mod> modules) {
         this.modules = modules;
     }

     public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

     @Override
     public String toString() {
         return "Enseignant{" +
                 "id=" + id +
                 ", grade='" + grade + '\'' +
                 ", departement=" + departement +
                 ", modules=" + modules +
                 ", nom='" + nom + '\'' +
                 ", email='" + email + '\'' +
                 ", prenom='" + prenom + '\'' +
                 '}';
     }


 }

