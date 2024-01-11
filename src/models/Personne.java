package models;

public class Personne {
        String nom;
        String email;
        String prenom;

        public Personne(String nom,String prenom,String email){
            this.nom=nom;
            this.email=email;
            this.prenom=prenom;

        }

    public Personne() {

    }

    public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }


