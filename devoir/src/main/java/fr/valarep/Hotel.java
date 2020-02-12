package fr.valarep;

import java.util.ArrayList;
import java.lang.*;

public class Hotel{

    final String nom;
    int chambres;
    int nombreDeChambre;
    int nombreDetages;

    Hotel(String nom, int nombreDeChambre, int nombreDetages)
    {
        this.nom = "JolieHotel";
        this.nombreDeChambre = 14;
        this.nombreDetages = 2;
    }

    ArrayList<String> chambre1er = new ArrayList<String>();

        chambre1er.add("Simple");
        chambre1er.add("Simple");
        chambre1er.add("Simple");
        chambre1er.add("Double");
        chambre1er.add("Double");
        chambre1er.add("Suite");
        chambre1er.add("Suite");
    

    ArrayList<String>chambre2eme = new ArrayList<String>()

        chambre2eme.add("Simple");
        chambre2eme.add("Simple");
        chambre2eme.add("Simple");
        chambre2eme.add("Double");
        chambre2eme.add("Double");
        chambre2eme.add("Suite");
        chambre2eme.add("Suite");
    



    public int nbChambreOccupées(){

    }

    public double tauxOccupation(){

    }

    public Boolean louerChambre(){

    }

    public int jourSuivant(){

    }

    public String toString(){
        
    }
    
}