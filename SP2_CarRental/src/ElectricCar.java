public class ElectricCar extends ACar {

    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKwh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity/maxRange;
    }

    public double getKmPrLitre(){
        return (getWhPrKm()/91.25/100);
    }

    public int getRegistrationFee() {
        double kmPrLitre = (int) (getKmPrLitre() / 91.25 / 100);

        if (kmPrLitre < 5) {
            return 10470;

        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;

        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;

        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;

        } else if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        }
        return 0;
    }
    public String toString(){
        return ("RegNr: "+ registrationNumber +" Mærke: "+ make +" Model: "+ model +" Antal døre: "+ numberOfDoors +" Batterikapacitet: "+ batteryCapacity +" Max rækkevidde: "+ maxRange + "Km"+"\nFee : " + getRegistrationFee());
    }
}