 import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<Vehicle> rentalHistory;

    public Customer(String name, String licenseId) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty");
        if (licenseId == null || licenseId.isEmpty()) throw new IllegalArgumentException("License ID cannot be null or empty");

        this.rentalHistory = new ArrayList<>();
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public List<Vehicle> getRentalHistory() {
        return new ArrayList<>(rentalHistory);
    }
}

