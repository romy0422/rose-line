package fr.valarep;

    import java.util.ArrayList;
    
    public class Parking{
        
        private ArrayList<String> autorisationImmatricul;
        private ArrayList<String> stationnementImmatricul;
        private int placeLimite;
    
        public static void main(String[] args) {
            Parking parking = new Parking(10);
    
            parking.ajoutVehiculeAutoriser("22-100WW-n");
            parking.ajoutVehiculeAutoriser("22-100WW-n");
            //Doublon ne sera pas ajouté
            parking.ajoutVehiculeAutoriser("22-100WW-n");
            //Il y en aura 2
            parking.afficheVehiculeAutoriser();
            parking.enregistrerVehicule(parking.autorisationImmatricul.get(0));
            parking.enregistrerVehicule(parking.autorisationImmatricul.get(1));
            //Doublon
            parking.enregistrerVehicule(parking.autorisationImmatricul.get(0));
            //Il n'y en aura que 2
            parking.afficheVehiculeStationner();
            parking.sortieVehicule(parking.autorisationImmatricul.get(1));
            //Il n'y en aura plus qu'1
            parking.afficheVehiculeStationner();
            //Le parking n'est pas plein
            System.out.println(parking.parkingIsFull());
            //Nombre de vehicule stationné
            parking.nbrVehiculeParking();
            //taux parking
            parking.TauxRemplissageParking();
            
    
        }
    
        public Parking(int limitPlace)
        {
            this.placeLimite = limitPlace;
            this.autorisationImmatricul = new ArrayList<String>();
            this.autorisationImmatricul = new ArrayList<String>();
        }
    
        public void ajoutVehiculeAutoriser(String immatriculation)
        {
            if (!autorisationImmatricul.contains(immatriculation))
            {
                this.autorisationImmatricul.add(immatriculation);
            }   
        }
    
        public boolean enregistrerVehicule(String immatriculation)
        {
            if (this.autorisationImmatricul.size() < this.placeLimite && (!this.autorisationImmatricul.contains(immatriculation)) && (this.autorisationImmatricul.contains(immatriculation)))
            {
                this.autorisationImmatricul.add(immatriculation);
                return true;
            }
            else{
                return false;
            }
        }
    
        public boolean sortieVehicule(String immatriculation)
        {
            if (this.autorisationImmatricul.contains(immatriculation)) 
            {
                this.autorisationImmatricul.remove(immatriculation);
                return true;
            }
            else
            {
                return false;
            }
        }
    
        public boolean vehiculeIsStationner(String immatriculation)
        {
            if (this.autorisationImmatricul.contains(immatriculation)) 
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    
        /*
        On doit pouvoir savoir si le parking est plein ou pas.
        */
        public boolean parkingIsFull()
        {
            if (this.autorisationImmatricul.size() == this.placeLimite) {
                return true;
            }
            else{
                return false;
            }
        }
    
        /*
        On doit pouvoir connaître le nombre de véhicules actuellement sur le parking.
        */
        public void nbrVehiculeParking()
        {
            System.out.println(this.autorisationImmatricul.size());
        }
    
        /*
        On doit pouvoir afficher la liste des véhicules actuellement sur le parking. 
        (dans cette itération de projet, on va faire tous les affichages sur console)
        */
        public void afficheVehiculeStationner()
        {
            System.out.println("Vehicule Stationné) : ");
            for(int i = 0; i<this.autorisationImmatricul.size(); i++)
            {
                System.out.println(this.autorisationImmatricul.get(i));
            }
        }
        /*
        On doit pourvoir afficher la liste des véhicules autorisés.
        */
        public void afficheVehiculeAutoriser()
        {
            System.out.println("Vehicule Autoriser : ");
            for(int i = 0; i<this.autorisationImmatricul.size(); i++)
            {
                System.out.println(this.autorisationImmatricul.get(i));
            }
        }
        /*
        On doit pouvoir afficher le taux de remplissage actuel du parking. 
        */
        public void TauxRemplissageParking()
        {
            double taux = ((double)this.autorisationImmatricul.size() / this.placeLimite * 100; 
            System.out.println("Taux de remplissage du parking : "+ taux + "%");
        
        }
        
    }

}