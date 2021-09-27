public class Car implements Drivable, Tradable {
    private int maxspeed;

    public Car() {
        this.maxspeed = 10;
    }

    @Override
    public String sound() {
        return "Vroom!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed++;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxspeed +")";
    }
}
