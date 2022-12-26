package driver;

import transport.Competitor;
import transport.Transport;

public class DriverD<T extends Transport & Competitor> extends Driver {

    public DriverD() {
        super("", true, 0);
    }

    public DriverD(String fullName, boolean driversLicence, int drivingExperience) {
        super(fullName, driversLicence, drivingExperience);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void drive(T transport) {
        System.out.println("Водитель: " + getFullName() + " водит авто: " + transport.getBrand() + " " +
                transport.getModel() + " примет участие");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с 'D' категорией ,начинает движение ");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с 'D' категорией , останавливается");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водитель с 'D' категорией заправляет транспорт");
    }
}
