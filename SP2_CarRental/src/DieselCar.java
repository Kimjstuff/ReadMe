public class DieselCar extends AFuelCar {

    boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getRegistrationFee() {
        int tax = 0;

        if (kmPrLitre < 5) {
            tax = 10470 + 15260;

        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            tax = 5500 + 2770;

        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            tax = 2340 + 1850;

        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            tax = 1050 + 1390;

        } else if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            tax = 330 + 130;
        }

        if (!hasParticleFilter) {
            tax += 1000;
        }
        return tax;
    }


    public String getFuelType() {
        return ("Diesel");
    }

    public String toString () {
        return ("RegNr: " + registrationNumber + " Mærke: " + make + " Model: " + model + " Antal døre: " + numberOfDoors + " KmPrL: " + kmPrLitre + " Partikelfilter: " + hasParticleFilter +"\nFee : "+ getRegistrationFee());
    }
}
