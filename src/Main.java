import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

public class Main {
        public static void main(String[] args) {

            Car car1 = new Car("Volkswagen", "Golf", 2.5, BodyType.BODY_TYPE_HATCHBACK);
            Car car2 = new Car("Škoda", "octavia RS", 2.0,BodyType.BODY_TYPE_SEDAN);
            Car car3 = new Car("УАЗ", "Патриот", 2.7,BodyType.BODY_TYPE_SUV);


            System.out.println(car1);
            car1.startMoving();
            car1.stopMoving();
            car1.pitStop();
            car1.getBestLapTime();
            car1.getMaximumSpeed();
            System.out.println(car2);
            System.out.println(car3);

            System.out.println("------------------------------------------------------------------");

            Bus bus1 = new Bus("MAN", "Lion's Coach", 12.4, SeatsCapacity.SEATS_CAPACITY_MEDIUM);
            Bus bus2 = new Bus("Mercedes-Benz", "Sprinter", 2.1,SeatsCapacity.SEATS_CAPACITY_SMALL);
            Bus bus3 = new Bus("MAN", "Lion's City", 13.0,SeatsCapacity.SEATS_CAPACITY_LARGE);

            System.out.println(bus1);
            bus1.startMoving();
            bus1.stopMoving();
            bus1.pitStop();
            bus1.getBestLapTime();
            bus1.getMaximumSpeed();
            System.out.println(bus2);
            System.out.println(bus3);

            System.out.println("------------------------------------------------------------------");

            Truck truck1 = new Truck("Волдай", "NEXT", 2.8,LoadCapacity.LOAD_CAPACITY_N1);
            Truck truck2 = new Truck("КамАЗ", "54901", 12.0,LoadCapacity.LOAD_CAPACITY_N2);
            Truck truck3 = new Truck("Scania", "S730", 16.0,LoadCapacity.LOAD_CAPACITY_N3);

            System.out.println(truck1);
            truck1.startMoving();
            truck1.stopMoving();
            truck1.pitStop();
            truck1.getBestLapTime();
            truck1.getMaximumSpeed();
            System.out.println(truck2);
            System.out.println(truck3);

            System.out.println("------------------------------------------------------------------");

            DriverD<Bus> ilja = new DriverD<>("Антонов Дмитрий Иванович", true, 12);
            ilja.drive(bus1);
            DriverB<Car> andrej = new DriverB<>("Гавриш Кирилл Юрьевич", true, 11);
            andrej.drive(car2);
            DriverC<Truck> sergej = new DriverC<>("Иванова Ксения Николаевна", true, 10);
            sergej.drive(truck3);
        }
}

