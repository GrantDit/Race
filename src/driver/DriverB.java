package driver;

import transport.Transport;
import transport.Competitor;
public class DriverB<T extends Transport & Competitor> extends Driver {

    public DriverB() {
        super("", true, 0);
    }

    public DriverB(String fullName, boolean driversLicence, int drivingExperience) {
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
        System.out.println("Имя водителя: " + getFullName() + " водит авто: " + transport.getBrand() + " " +
                transport.getModel() + " примет участие");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с 'B' категорией ,начинает движение ");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с 'B' категорией , останавливается");
    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("Водитель с 'B' категорией заправляет транспорт");
    }
}