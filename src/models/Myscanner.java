package models;

import java.util.Scanner;

public class Myscanner {

    public static int getentier (String...msg){
        Scanner sc = new Scanner(System.in);
        String message ="entrez un nombre entier";
        if(msg.length>0)
            message = msg[0];
        System.out.println(message);

        int numero = sc.nextInt();

        return numero;
    }
    public static String getString(String... msg) {
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

}
