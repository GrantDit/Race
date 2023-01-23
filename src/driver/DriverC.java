package driver;

import transport.Competitor;
import transport.Transport;

public class DriverC<T extends Transport & Competitor> extends Driver {

    public DriverC() {
        super("", true, 0," ");
    }

    public DriverC(String fullName, boolean driversLicence, int drivingExperience, String category) {
        super(fullName, driversLicence, drivingExperience, category);
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
        System.out.println("Водитель: " + getFullName() + "водит авто: " + transport.getBrand() + " " +
                transport.getModel() + " примет участие");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с 'С' категорией ,начинает движение ");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с 'С' категорией , останавливается");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водитель с 'С' категорией заправляет транспорт");
    }
}
