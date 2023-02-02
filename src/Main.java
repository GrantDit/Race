import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            ArrayList<Driver> drivers = new ArrayList<>();
            DriverD<Bus> driver1 = new DriverD<>("Антонов Дмитрий Иванович", true, 12,"D");
            DriverB<Car> driver2 = new DriverB<>("Гавриш Кирилл Юрьевич", true, 11,"B");
            DriverC<Truck> driver3 = new DriverC<>("Иванова Ксения Николаевна", true, 10,"С");
            ArrayList<Mechanic> mechanics = new ArrayList<>();
            Mechanic mechanic1 = new Mechanic("Евгеинй","Петров", "СТО",Skill.SKILL_OF_WORKING_WITH_CARS);
            Mechanic mechanic2 = new Mechanic("Дмитрий","Иванов", "ПРО-СТО", Skill.SKILL_OF_WORKING_WITH_BUSES);
            Mechanic mechanic3 = new Mechanic("Алексей", "Антонов", "ПРО-ТРАК", Skill.SKILL_OF_WORKING_WITH_TRUCKS);
            Mechanic mechanic4 = new Mechanic("Ксения", "Иванова", "ТехВорк", Skill.SKILL_OF_WORKING_WITH_ALL_TRANSPORT);
            ArrayList<Transport> transports = new ArrayList<>();
            Car car1 = new Car("Volkswagen", "Golf", 2.5,BodyType.BODY_TYPE_HATCHBACK,driver2,mechanics,drivers);
            Car car2 = new Car("Škoda", "octavia RS", 2.0,BodyType.BODY_TYPE_SEDAN,driver2,mechanics,drivers);
            Car car3 = new Car("УАЗ", "Патриот", 2.7,BodyType.BODY_TYPE_SUV,driver2,mechanics,drivers);
            Bus bus1 = new Bus("MAN", "Lion's Coach", 12.4, SeatsCapacity.SEATS_CAPACITY_MEDIUM,driver1,mechanics,drivers);
            Bus bus2 = new Bus("Mercedes-Benz", "Sprinter", 2.1,SeatsCapacity.SEATS_CAPACITY_SMALL,driver1,mechanics,drivers);
            Bus bus3 = new Bus("MAN", "Lion's City", 13.0,SeatsCapacity.SEATS_CAPACITY_LARGE,driver1,mechanics,drivers);
            Truck truck1 = new Truck("Волдай", "NEXT", 2.8,LoadCapacity.LOAD_CAPACITY_N1,driver3,mechanics,drivers);
            Truck truck2 = new Truck("КамАЗ", "54901", 12.0,LoadCapacity.LOAD_CAPACITY_N2,driver3,mechanics,drivers);
            Truck truck3 = new Truck("Scania", "S730", 16.0,LoadCapacity.LOAD_CAPACITY_N3,driver3,mechanics,drivers);
            System.out.println("фпфпфпфпфпфп");
            mechanic1.fixCar(car1);
            driver1.drive(bus1);
            driver2.drive(car2);
            driver3.drive(truck3);
            transports.add(car1);
            transports.add(car2);
            transports.add(car3);
            transports.add(bus1);
            transports.add(bus2);
            transports.add(bus3);
            transports.add(truck1);
            transports.add(truck2);
            transports.add(truck3);
            mechanics.add(mechanic1);
            mechanics.add(mechanic2);
            mechanics.add(mechanic3);
            mechanics.add(mechanic4);
            drivers.add(driver1);
            drivers.add(driver2);
            drivers.add(driver3);
            //
            System.out.println(car1);
            car1.startMoving();
            car1.stopMoving();
            car1.pitStop();
            car1.getBestLapTime();
            car1.getMaximumSpeed();
            System.out.println(car2);
            System.out.println(car3);
            //
            System.out.println("------------------------------------------------------------------");
            System.out.println(bus1);
            bus1.startMoving();
            bus1.stopMoving();
            bus1.pitStop();
            bus1.getBestLapTime();
            bus1.getMaximumSpeed();
            System.out.println(bus2);
            System.out.println(bus3);

            System.out.println("------------------------------------------------------------------");

            System.out.println(truck1);
            truck1.startMoving();
            truck1.stopMoving();
            truck1.pitStop();
            truck1.getBestLapTime();
            truck1.getMaximumSpeed();
            System.out.println(truck2);
            System.out.println(truck3);

            System.out.println("------------------------------------------------------------------");
            car1.fixCar();
            car3.technicalService();
            car2.diagnostics();
            truck1.fixCar();
            car1.informationDriverMechanic();

        }
}

