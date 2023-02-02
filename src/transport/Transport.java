package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private Driver driver;
    protected ArrayList<Mechanic> mechanics;
    protected ArrayList<Driver> drivers;

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if (driver != null) {
            this.driver = driver;
        }
    }

    public Transport(String brand, String model, double engineVolume, Driver driver) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "По умолчанию ";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "По умолчанию";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (driver != null) {
            this.driver = driver;
        }
    }

    //Для создания транспорта без механика.(Для того чтобы можно было создать транспорт и без механика сразу)
    public Transport(String brand, String model, double engineVolume,Driver driver ,ArrayList<Mechanic> mechanics) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "По умолчанию ";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "По умолчанию";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.mechanics = mechanics;
        if (driver != null) {
            this.driver = driver;
        }
}
    public Transport(String brand, String model, double engineVolume,Driver driver, ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "По умолчанию ";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "По умолчанию";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.mechanics = mechanics;
        this.drivers = drivers;
        if (driver != null) {
            this.driver = driver;
        }
    }

    public static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                diagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println("Произошла ошибка");
                System.out.println(e.getMessage());
            }
        }
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return "Бренд: " + getBrand() + ", " + "Модель: " + getModel() + ", " + "Объем двигателя: " + getEngineVolume()
                + " л.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void informationDriverMechanic();

    public abstract void technicalService();

    public abstract void fixCar();

    public abstract void startMoving();

    public abstract void stopMoving();
    public abstract void addMechanic(Mechanic mechanic);
}