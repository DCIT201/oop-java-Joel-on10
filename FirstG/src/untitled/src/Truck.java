public class Truck extends Vehicle {
       private static final double LOAD_CHARGE = 50.0;
       public Truck(String vehicleId, String model, double baseRentalRate) {
           super(vehicleId, model, baseRentalRate);
       }

     @Override
      public double calculateRentalCost(int days) {
           return (getBaseRentalRate() + LOAD_CHARGE) * days;
     }

      @Override
     public boolean isAvailableForRental() {
          return isAvailable();
       }
}


