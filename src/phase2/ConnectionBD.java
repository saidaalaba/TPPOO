package phase2;

import Services.DepServices;
import models.Departement;
import models.Enseignant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionBD {


    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/SystemGestion";
        String user = "root";
        String pwd = "";
        try {
            Connection cx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Good Connection");

            createTable(cx);
            System.out.println("tableau ens");
           // List<Enseignant> enseignantList = getAllE(cx);
           // for (Enseignant product : enseignantList) {
             //   System.out.println(product.toString());
           // }

          // for (int i = 0; i < 100; i++) {
           //    insertEns(new Enseignant(), cx);
         //  }

        }
        catch (SQLException e) {
            System.out.println("ERREUR");

        }
    }

    public static void insertEns(Enseignant enseignant, Connection cx) throws SQLException {
        String query = "INSERT INTO Enseignant (name, prenom,email,grade,departement_id) values (?,?,?,?,?)";

        PreparedStatement ps = cx.prepareStatement(query);

        ps.setString(1, enseignant.getNom());
        ps.setString(2, enseignant.getPrenom());
        ps.setString(3, enseignant.getEmail());
        ps.setString(4,enseignant.getGrade());
        ps.setString(5, String.valueOf(enseignant.getDepartement()));


        ps.executeUpdate();


    }



    public static List<Enseignant> getALLEns(Connection cx) throws SQLException {
        String query = "SELECT * from enseignant";
        List<Enseignant> enseignants = new ArrayList<>();

        Statement st = cx.createStatement();

        ResultSet r = st.executeQuery(query);

        while (r.next()) {
            int idEnseignant = r.getInt("id");
            Departement departement= DepServices.getDeptById(r.getInt("departement_id"));
            enseignants.add(
                    new Enseignant(idEnseignant,
                            r.getString("nom"),
                            r.getString("prenom"),
                            r.getString("email"),
                            r.getString("grade"),
                             departement
                    )

            );
        }

        return enseignants;


    }
    private static void createTable(Connection cx) throws SQLException {

        String queryDep = "CREATE TABLE IF NOT EXISTS Departement(\n" +
                "                                       id int primary key auto_increment,\n" +
                "  intitule VARCHAR(255),\n" +
                "  responsable VARCHAR(255),\n" +
                "  responsable VARCHAR(255),\n" +
                ");";

        Statement sat = cx.createStatement();

        sat.execute(queryDep);


       /* String queryEns = "CREATE TABLE IF NOT EXISTS Enseignant(\n" +
                "                                       id int primary key auto_increment,\n" +
                "  nom VARCHAR(255),\n" +
                "  prenom VARCHAR(255),\n" +
                "  email VARCHAR(255),\n" +
                "  grade VARCHAR(255),\n" +
                "  departement_id INT,\n" +
                // Ajout de la colonne pour la relation avec Departement
                "  FOREIGN KEY (departement_id) REFERENCES departement(id)\n" +
                ");";

        Statement st = cx.createStatement();

        st.execute(queryEns);*/





    }



    }




