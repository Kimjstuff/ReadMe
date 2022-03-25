public class GasolineCar extends AFuelCar{

    public GasolineCar (String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    public int getRegistrationFee(){
        if(kmPrLitre < 5){
            return 10470;
        }
        if(kmPrLitre >= 5 && kmPrLitre < 10){
            return 5500;
        }
        if(kmPrLitre >= 10 && kmPrLitre < 15){
            return 2340;
        }
        if(kmPrLitre >= 15 && kmPrLitre < 20){
            return 1050;
        }
        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            return 330;
        }
        return 0;
    }


    public String getFuelType(){
        return ("Gasoline");
    }

    public String toString(){
        return ("RegNr: "+ registrationNumber +" Mærke: " +make+" Model: "+model+" Antal døre: "+numberOfDoors+" KmPrL: "+kmPrLitre +"\nFee : " + getRegistrationFee());
    }

}
