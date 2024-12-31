public class Motorcycle extends Vehicle {
    private static final double DISCOUNT_RATE = 0.10;

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (days > 5) {
            cost -= cost * DISCOUNT_RATE; // Discount for long-term rentals
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}

