/* A sample class that implements the given interfaces.
 */
public class Cat implements Domesticatable, Tradable {
    private int maxSpeed;

    @Override
    public String sound() {
        return "Meow!";
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
