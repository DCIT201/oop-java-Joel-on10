import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void testCarRentalCost() {
        Car car = new Car("C001", "Sedan", 50.0);
        assertEquals(130.0, car.calculateRentalCost(2)); // (50 + 15) * 2
    }

    @Test
    void testRentalAgency() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("C001", "Sedan", 50.0);
        Customer customer = new Customer("Alice", "DL123");

        agency.addVehicle(car);
        Vehicle rentedCar = agency.rentVehicle("C001", customer, 3);

        assertEquals("C001", rentedCar.getVehicleId());
        assertFalse(rentedCar.isAvailable());
    }
}



