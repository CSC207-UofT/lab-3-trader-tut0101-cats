/**
 * Class that is a Cow. I hope you like it.
 */
public class Cow implements Tradable, Domesticatable{

    private String Name;
    private static int population;

    public Cow() {
        this.Name = "Moomoo #" + (population + 1);
        population++;
    }

    public Cow (String name) {
        this.Name = name;
        population++;
    }

    /**
     * Return the price of a Cow.
     *
     * @return The price of this Cow
     */
    @Override
    public int getPrice() {
        return 20;
    }

    /**
     * Return the sound a Cow makes.
     *
     * @return The sound a Cow makes.
     */
    @Override
    public String sound() {
        return "Moo.";
    }
}
