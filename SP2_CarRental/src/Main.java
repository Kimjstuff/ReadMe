public class Main {

    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();
        Car audi = new GasolineCar("Kapitalisten","audi","A7",3,12);
        Car ford = new DieselCar("Miljøsvinet","Ford","Ka",5,18,false);
        Car tesla =  new ElectricCar("Aktivisten","Tesla","S",3,100,200);
        System.out.println(audi +"\n"+ ford +"\n"+ tesla);

        fleet.addCar(audi);
        fleet.addCar(ford);
        fleet.addCar(tesla);
        System.out.println("Total registrationfee = "+ fleet.getTotalRegistrationFeeForFleet());

    }
}