package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Objects;

public class Car extends Transport implements Competitor {

    public Car(String brand, String model, double engineVolume, BodyType bodyType, Driver driver) {
        super(brand, model, engineVolume,driver);
    }
    public Car(String brand, String model, double engineVolume, BodyType bodyType,Driver driver,ArrayList<Mechanic> mechanics) {
        super(brand, model, engineVolume,driver,mechanics);
    }
    public Car(String brand, String model, double engineVolume,BodyType bodyType,Driver driver, ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers) {
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
                if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_CARS ||
                        mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 4) {
                    System.out.println("Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя "
                            + getEngineVolume() + " Л. Обслуживает " + mechanic);
                }
            }
        }else {
            System.out.println("Нет механников для автомобиля");
        }
        if (drivers != null){
            for (Driver driver : drivers) {
                if (Objects.equals(driver.getFullName(), getDriver().getFullName())) {
                    System.out.println("Автобилем " + getBrand() + " " + getModel() + ", объем двигателя "
                            + getEngineVolume() + " Л. управляет " + driver.getFullName());
                }
            }
        } else {
            System.out.println("Нет водителей для Автомобиля. ");
        }
    }

    public void diagnostics() {
        System.out.println("Машина" + getBrand() + " должна пройти диагностику");
    }

    @Override
    public void startMoving() {
        System.out.println("Машина начала движение ");
    }

    @Override
    public void stopMoving() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void addMechanic(Mechanic mechanic) {
        if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_CARS||
                mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT) {
            mechanics.add(mechanic);
        }
        System.out.println(mechanics);
    }


    @Override
    public void pitStop() {
        System.out.println("Машина должна остановиться ");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время за круг: ");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость : ");
    }

    @Override
    public void technicalService() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_CARS ||
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
                if (mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_CARS ||
                        mechanic.getSkill() == Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT) {
                    mechanic.fixCar(this);
                }
            }
        }
    }
}
