import java.util.HashMap;
import java.util.Map;

public class RentalAgency {
    private final Map<String, Vehicle> vehicleFleet;

    public RentalAgency() {
        this.vehicleFleet = new HashMap<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.put(vehicle.getVehicleId(), vehicle);
    }

    public Vehicle rentVehicle(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = vehicleFleet.get(vehicleId);
        if (vehicle == null || !vehicle.isAvailableForRental()) {
            throw new IllegalStateException("Vehicle is not available for rental");
        }

        vehicle.setAvailable(false);
        customer.addRental(vehicle);
        return vehicle;
    }

    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = vehicleFleet.get(vehicleId);
        if (vehicle != null) {
            vehicle.setAvailable(true);
        }
    }
}
