package transport;

public class Car extends Transport implements Competitor {

    public Car() {
        super("", "", 0);
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
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
}

