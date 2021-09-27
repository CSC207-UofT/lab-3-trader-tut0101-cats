/* A sample class that implements the given interfaces.
 */
public class Reindeer implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Reindeer() {
        this.maxSpeed = 3;
    }

    @Override
    public String sound() {
        return "Reindeer noise!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
