package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Objects;

public class Bus extends Transport implements Competitor {

    public Bus(String brand, String model, double engineVolume, SeatsCapacity seatsCapacity, Driver driver) {
        super(brand, model, engineVolume,driver);
    }
    public Bus(String brand, String model, double engineVolume, SeatsCapacity seatsCapacity,Driver driver,ArrayList<Mechanic> mechanics) {
        super(brand, model, engineVolume,driver,mechanics);
    }
    public Bus(String brand, String model, double engineVolume,SeatsCapacity seatsCapacity,Driver driver ,ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers) {
        super(brand, model, engineVolume,driver,mechanics,drivers);
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

    @Override
    public void informationDriverMechanic() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_BUSES ||
                        mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 4) {
                    System.out.println("Автобус " + getBrand() + " " + getModel() + ", объем двигателя "
                            + getEngineVolume() + " Л. Обслуживает " + mechanic);
                }
            }
        }else {
            System.out.println("Нет механников для автобусов");
        }
        if (drivers != null){
            for (Driver driver : drivers) {
                if (Objects.equals(driver.getFullName(), getDriver().getFullName())) {
                    System.out.println("Автобусом " + getBrand() + " " + getModel() + ", объем двигателя "
                            + getEngineVolume() + " Л. управляет " + driver.getFullName());
                }
            }
        } else {
            System.out.println("Нет водителей для Автобусов. ");
        }
    }

    @Override
    public void technicalService() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_BUSES ||
                        mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.technicalService(this);
                }
            }
        }
    }

    @Override
    public void fixCar() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_BUSES ||
                        mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.fixCar(this);
                }
            }
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }

    public void passDiagnostics() {
        throw new UnsupportedOperationException("Автобус" + getBrand() + ", " + getModel() + " не может пройти диагностику");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус остановился");
    }

    @Override
    public void addMechanic(Mechanic mechanic) {
        if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_BUSES||
                mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT) {
            mechanics.add(mechanic);
        }
        System.out.println(mechanics);
    }


    @Override
    public void pitStop() {
        System.out.println("Автобус должен остановиться");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время за круг: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость: ");
    }

}