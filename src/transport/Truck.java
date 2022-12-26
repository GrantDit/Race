package transport;

public class Truck extends Transport implements Competitor {

    public Truck() {
        super("", "", 0);
    }

    public Truck(String brand, String model, double engineVolume) {
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

    @Override
    public void startMoving() {
        System.out.println("Трак начал движение ");
    }

    @Override
    public void stopMoving() {
        System.out.println("Трак остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Трак должен остановиться ");
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
