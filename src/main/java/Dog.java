/* A sample class that implements the given interfaces.
 */
public class Dog implements Domesticatable, Tradable {
    private int maxSpeed;

    public Dog() {
        this.maxSpeed = 2;
    }

    @Override
    public String sound() {
        return "Woof!";
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
