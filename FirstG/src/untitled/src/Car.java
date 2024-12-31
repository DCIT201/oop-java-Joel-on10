public class Car extends Vehicle {
        private static final double INSURANCE_RATE = 15.0;

        public Car(String vehicleId, String model, double baseRentalRate) {
            super(vehicleId, model, baseRentalRate);
        }

        @Override
        public double calculateRentalCost(int days) {
            return (getBaseRentalRate() + INSURANCE_RATE) * days;
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable();
        }
}

