public abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        if (vehicleId == null || vehicleId.isEmpty()) throw new IllegalArgumentException("Vehicle ID cannot be null or empty");
        if (model == null || model.isEmpty()) throw new IllegalArgumentException("Model cannot be null or empty");
        if (baseRentalRate <= 0) throw new IllegalArgumentException("Base rental rate must be positive");

        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true; // Initially available
    }

    // Getters and setters with encapsulation
    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public double getBaseRentalRate() { return baseRentalRate; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return String.format("Vehicle ID: %s, Model: %s, Base Rate: %.2f", vehicleId, model, baseRentalRate);
    }
}

