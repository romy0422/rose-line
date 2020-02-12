package fr.valarep;

public class Chambre extends Hotel{

    int numeroDeChambre;
    int joursRestants;
    String type;
    String nomOccupant;

    Chambre(int numeroDeChambre, String type)
    {
        this.numeroDeChambre = 0;
        this.type = "Simple";
    }

    public boolean  définirOccupant(String nomOccupant, int joursrestants){

    }

    public int jourSuivant(){

       if (joursRestants >= 1){

        joursRestants --;

       }
       else {
           nomOccupant = null;
       }

       return joursRestants;

    }

    public String toString(){

    }


}