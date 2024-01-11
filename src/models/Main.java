package models;

import controlleur.*;

import java.util.Scanner;

import static controlleur.EnseignantCntr.afficherEns;

public class Main {

        public static void main(String[] args) {

            Enseignant enseignant = new Enseignant();
           /* enseignant.setNom("saida");
            //enseignant.setEmail(getStringInput(enseignant.email));
            enseignant.setPrenom("alaba");
           enseignant.setGrade();
            enseignant.setEmail("saidaalaba@gmail.com");
            enseignant.getPrenom();
            //enseignant.setDepartement(getStringInput());
            enseignant.setId(BD.getEnsId());

            BD.enseignants.add(enseignant);

            System.out.println(enseignant.toString());*/

            showPrincipalMenu();



        }


    public static int getIntInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);


        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        //  scan.close();
        return num;
    }

    public static String getStringInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un texte : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);

        // This method reads the number provided using keyboard
        String str = scan.nextLine();

        // Closing Scanner after the use
        //  scan.close();
        return str;
    }


    public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        //"Veuillez sélectionner une option : ")
        int option = getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                departementCntr.afficherMenu();
                break;
            case 2:
                FiliereCntr.afficherMenu();

                break;
            case 3:EnseignantCntr.afficherMenu();

                break;
            case 4:
                ModuleCntr.afficherMenu();
                break;
            case 5:   EtudiantCnrt.afficherMenu();
                break;
            default:
                // code block
        }
        switch(option) {
            case 1:

                departementCntr.afficherdep();
                break;
            case 2:FiliereCntr.afficherfiliere();
                break;
            case 3: afficherEns();
                break;
            case 4:  ModuleCntr.ajoutermodul();
                break;
            case 5:EtudiantCnrt.afficherEtud();
                break;
            default:
                // code block
        }


    }



        }



